--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: categoria; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE categoria (
    id_categoria integer NOT NULL,
    nombre character varying(25) NOT NULL,
    porcentaje integer NOT NULL
);


ALTER TABLE public.categoria OWNER TO postgres;

--
-- Name: categoria_id_categoria_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE categoria_id_categoria_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.categoria_id_categoria_seq OWNER TO postgres;

--
-- Name: categoria_id_categoria_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE categoria_id_categoria_seq OWNED BY categoria.id_categoria;


--
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cliente (
    id_cliente character(5) NOT NULL,
    nombre character varying(50) NOT NULL,
    ape_pat character varying(50),
    ape_mat character varying(50),
    puntos integer DEFAULT 0,
    rfc character varying(13),
    colonia character varying(60),
    calle character varying(60),
    numero character varying(6),
    ciudad character varying(50),
    delegacion character varying(50),
    cp character(5),
    id_tipo_cliente integer NOT NULL,
    telefono character varying(10),
    email character varying(100),
    estatus boolean NOT NULL
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- Name: compra; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE compra (
    id_compra integer NOT NULL,
    id_proveedor integer NOT NULL,
    fecha date NOT NULL,
    id_tipo_plazo integer NOT NULL,
    plazo integer NOT NULL,
    estatus boolean NOT NULL
);


ALTER TABLE public.compra OWNER TO postgres;

--
-- Name: compra_id_compra_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE compra_id_compra_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.compra_id_compra_seq OWNER TO postgres;

--
-- Name: compra_id_compra_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE compra_id_compra_seq OWNED BY compra.id_compra;


--
-- Name: detalle_compra; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE detalle_compra (
    id_compra integer NOT NULL,
    id_producto character(5) NOT NULL,
    cantidad integer,
    costo_producto integer
);


ALTER TABLE public.detalle_compra OWNER TO postgres;

--
-- Name: detalle_venta; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE detalle_venta (
    id_venta integer NOT NULL,
    id_producto character(5) NOT NULL,
    cantidad integer NOT NULL,
    precio_venta integer NOT NULL
);


ALTER TABLE public.detalle_venta OWNER TO postgres;

--
-- Name: devolucion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE devolucion (
    id_devolucion integer NOT NULL,
    fecha date,
    id_venta integer NOT NULL,
    id_producto character(5) NOT NULL,
    descripcion character varying(150) NOT NULL
);


ALTER TABLE public.devolucion OWNER TO postgres;

--
-- Name: devolucion_id_devolucion_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE devolucion_id_devolucion_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.devolucion_id_devolucion_seq OWNER TO postgres;

--
-- Name: devolucion_id_devolucion_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE devolucion_id_devolucion_seq OWNED BY devolucion.id_devolucion;


--
-- Name: mercancia_temp; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE mercancia_temp (
    id_producto character(5) NOT NULL,
    nombre character varying(30) NOT NULL,
    cantidad integer NOT NULL
);


ALTER TABLE public.mercancia_temp OWNER TO postgres;

--
-- Name: producto; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE producto (
    id_producto character(5) NOT NULL,
    nombre character varying(30) NOT NULL,
    descripcion character varying(70) NOT NULL,
    existencias integer NOT NULL,
    costo_compra integer NOT NULL,
    costo_venta integer NOT NULL,
    imagen bytea,
    nuevo_semi character varying(15) NOT NULL,
    id_categoria integer,
    id_proveedor integer,
    estatus boolean NOT NULL
);


ALTER TABLE public.producto OWNER TO postgres;

--
-- Name: producto_aux; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE producto_aux (
    id_producto character(5) NOT NULL,
    existencias integer NOT NULL
);


ALTER TABLE public.producto_aux OWNER TO postgres;

--
-- Name: promocion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE promocion (
    id_promo integer NOT NULL,
    fecha_inicio date,
    fecha_fin date,
    porcentaje integer
);


ALTER TABLE public.promocion OWNER TO postgres;

--
-- Name: promocion_id_promo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE promocion_id_promo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.promocion_id_promo_seq OWNER TO postgres;

--
-- Name: promocion_id_promo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE promocion_id_promo_seq OWNED BY promocion.id_promo;


--
-- Name: promocion_producto; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE promocion_producto (
    id_promo integer NOT NULL,
    id_producto character(5) NOT NULL
);


ALTER TABLE public.promocion_producto OWNER TO postgres;

--
-- Name: proveedor; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE proveedor (
    id_proveedor integer NOT NULL,
    nombre character varying(45) NOT NULL,
    colonia character varying(60) NOT NULL,
    calle character varying(60) NOT NULL,
    numero character varying(6) NOT NULL,
    ciudad character varying(50) NOT NULL,
    delegacion character varying(50),
    telefono integer,
    email character varying(100),
    rfc character varying(13),
    cp character(5),
    estatus boolean NOT NULL
);


ALTER TABLE public.proveedor OWNER TO postgres;

--
-- Name: proveedor_id_proveedor_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE proveedor_id_proveedor_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.proveedor_id_proveedor_seq OWNER TO postgres;

--
-- Name: proveedor_id_proveedor_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE proveedor_id_proveedor_seq OWNED BY proveedor.id_proveedor;


--
-- Name: tipo_cliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tipo_cliente (
    id_tipo_cliente integer NOT NULL,
    tipo character varying(20) NOT NULL
);


ALTER TABLE public.tipo_cliente OWNER TO postgres;

--
-- Name: tipo_cliente_id_tipo_cliente_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tipo_cliente_id_tipo_cliente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tipo_cliente_id_tipo_cliente_seq OWNER TO postgres;

--
-- Name: tipo_cliente_id_tipo_cliente_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tipo_cliente_id_tipo_cliente_seq OWNED BY tipo_cliente.id_tipo_cliente;


--
-- Name: tipo_plazo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tipo_plazo (
    id_tipo_plazo integer NOT NULL,
    plazo character varying(10)
);


ALTER TABLE public.tipo_plazo OWNER TO postgres;

--
-- Name: tipo_plazo_id_tipo_plazo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tipo_plazo_id_tipo_plazo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tipo_plazo_id_tipo_plazo_seq OWNER TO postgres;

--
-- Name: tipo_plazo_id_tipo_plazo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tipo_plazo_id_tipo_plazo_seq OWNED BY tipo_plazo.id_tipo_plazo;


--
-- Name: tipo_usuario; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tipo_usuario (
    id_tipo_usuario integer NOT NULL,
    tipo character varying(30) NOT NULL
);


ALTER TABLE public.tipo_usuario OWNER TO postgres;

--
-- Name: tipo_usuario_id_tipo_usuario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tipo_usuario_id_tipo_usuario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tipo_usuario_id_tipo_usuario_seq OWNER TO postgres;

--
-- Name: tipo_usuario_id_tipo_usuario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tipo_usuario_id_tipo_usuario_seq OWNED BY tipo_usuario.id_tipo_usuario;


--
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE usuario (
    id_usuario integer NOT NULL,
    nombre character varying(50) NOT NULL,
    ape_pat character varying(50),
    ape_mat character varying(50),
    rfc character varying(13),
    colonia character varying(60),
    calle character varying(60),
    numero character varying(6),
    ciudad character varying(50),
    delegacion character varying(50),
    cp character(5),
    id_tipo_usuario integer,
    estatus boolean,
    telefono character varying(13),
    email character varying(100)
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- Name: usuario_id_usuario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE usuario_id_usuario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.usuario_id_usuario_seq OWNER TO postgres;

--
-- Name: usuario_id_usuario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE usuario_id_usuario_seq OWNED BY usuario.id_usuario;


--
-- Name: venta; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE venta (
    id_venta integer NOT NULL,
    fecha date NOT NULL,
    id_usuario integer NOT NULL,
    id_cliente character(5) NOT NULL
);


ALTER TABLE public.venta OWNER TO postgres;

--
-- Name: venta_id_venta_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE venta_id_venta_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.venta_id_venta_seq OWNER TO postgres;

--
-- Name: venta_id_venta_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE venta_id_venta_seq OWNED BY venta.id_venta;


--
-- Name: id_categoria; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY categoria ALTER COLUMN id_categoria SET DEFAULT nextval('categoria_id_categoria_seq'::regclass);


--
-- Name: id_compra; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY compra ALTER COLUMN id_compra SET DEFAULT nextval('compra_id_compra_seq'::regclass);


--
-- Name: id_devolucion; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY devolucion ALTER COLUMN id_devolucion SET DEFAULT nextval('devolucion_id_devolucion_seq'::regclass);


--
-- Name: id_promo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY promocion ALTER COLUMN id_promo SET DEFAULT nextval('promocion_id_promo_seq'::regclass);


--
-- Name: id_proveedor; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY proveedor ALTER COLUMN id_proveedor SET DEFAULT nextval('proveedor_id_proveedor_seq'::regclass);


--
-- Name: id_tipo_cliente; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tipo_cliente ALTER COLUMN id_tipo_cliente SET DEFAULT nextval('tipo_cliente_id_tipo_cliente_seq'::regclass);


--
-- Name: id_tipo_plazo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tipo_plazo ALTER COLUMN id_tipo_plazo SET DEFAULT nextval('tipo_plazo_id_tipo_plazo_seq'::regclass);


--
-- Name: id_tipo_usuario; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tipo_usuario ALTER COLUMN id_tipo_usuario SET DEFAULT nextval('tipo_usuario_id_tipo_usuario_seq'::regclass);


--
-- Name: id_usuario; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuario ALTER COLUMN id_usuario SET DEFAULT nextval('usuario_id_usuario_seq'::regclass);


--
-- Name: id_venta; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY venta ALTER COLUMN id_venta SET DEFAULT nextval('venta_id_venta_seq'::regclass);


--
-- Data for Name: categoria; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY categoria (id_categoria, nombre, porcentaje) FROM stdin;
\.


--
-- Name: categoria_id_categoria_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('categoria_id_categoria_seq', 1, false);


--
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY cliente (id_cliente, nombre, ape_pat, ape_mat, puntos, rfc, colonia, calle, numero, ciudad, delegacion, cp, id_tipo_cliente, telefono, email, estatus) FROM stdin;
CAA09	krauser	doinico		0						 	     	1			f
CAA03	Cesar			0						 	     	1			f
CAA13	Cesar	Perez		0						 	     	1			f
CAA15	Juan	Pito	Gomez	0						 	     	1			f
CAA11	Perez	Alcatar		0						 	     	1			f
CAA14	Cesar	Villegas	Campos	0						 	     	1			f
CAA19	Pedrito			0							     	1			f
CAA20	Pepito	Perez	Portillo	0	PRFC	El centro	215	12121	PuertoVallarta	Guadalajara	30191	4	12123123	aasdasdasd	f
CAA18	Cesar	Perz	Garc	0	rfc	Tresguerras	Rosario	215	Celaya	Guanajuato	38080	3	2213619	krau@.com	f
CAA06	Juan	Perez	Solis	0						 	     	1			f
CAA21	Juan	Perez	Potter	0	121212rfc	TresGuerras	Rosario	215	Celaya	Guanajuato	38080	4	2131231	ksdksdksdkasdklsdjklasdjakldjaldkasjkl	t
CAA17	Cesar	Garcia	Noyola	0	12rfc	Tresquerras	Rosario	215	Celaya	 	38080	2	121212	kra@hotmail	t
CAA16	Homero	Simpsom		1000						 	     	4			t
CAA22	Canchola			0							     	1	jhgjgjhg		t
CAA12	Cesar	Garcia	Villegas	500						 	     	2			f
CAA23	ALa			0							     	1			t
CAA10	Aquies	Rocke		0						 	     	3			f
\.


--
-- Data for Name: compra; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY compra (id_compra, id_proveedor, fecha, id_tipo_plazo, plazo, estatus) FROM stdin;
\.


--
-- Name: compra_id_compra_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('compra_id_compra_seq', 1, false);


--
-- Data for Name: detalle_compra; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY detalle_compra (id_compra, id_producto, cantidad, costo_producto) FROM stdin;
\.


--
-- Data for Name: detalle_venta; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY detalle_venta (id_venta, id_producto, cantidad, precio_venta) FROM stdin;
\.


--
-- Data for Name: devolucion; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY devolucion (id_devolucion, fecha, id_venta, id_producto, descripcion) FROM stdin;
\.


--
-- Name: devolucion_id_devolucion_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('devolucion_id_devolucion_seq', 1, false);


--
-- Data for Name: mercancia_temp; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY mercancia_temp (id_producto, nombre, cantidad) FROM stdin;
\.


--
-- Data for Name: producto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY producto (id_producto, nombre, descripcion, existencias, costo_compra, costo_venta, imagen, nuevo_semi, id_categoria, id_proveedor, estatus) FROM stdin;
\.


--
-- Data for Name: producto_aux; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY producto_aux (id_producto, existencias) FROM stdin;
\.


--
-- Data for Name: promocion; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY promocion (id_promo, fecha_inicio, fecha_fin, porcentaje) FROM stdin;
\.


--
-- Name: promocion_id_promo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('promocion_id_promo_seq', 1, false);


--
-- Data for Name: promocion_producto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY promocion_producto (id_promo, id_producto) FROM stdin;
\.


--
-- Data for Name: proveedor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY proveedor (id_proveedor, nombre, colonia, calle, numero, ciudad, delegacion, telefono, email, rfc, cp, estatus) FROM stdin;
\.


--
-- Name: proveedor_id_proveedor_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('proveedor_id_proveedor_seq', 1, false);


--
-- Data for Name: tipo_cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tipo_cliente (id_tipo_cliente, tipo) FROM stdin;
1	PLUS
2	NORMAL
3	OCACIONAL
4	MALOS
\.


--
-- Name: tipo_cliente_id_tipo_cliente_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('tipo_cliente_id_tipo_cliente_seq', 1, false);


--
-- Data for Name: tipo_plazo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tipo_plazo (id_tipo_plazo, plazo) FROM stdin;
\.


--
-- Name: tipo_plazo_id_tipo_plazo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('tipo_plazo_id_tipo_plazo_seq', 1, false);


--
-- Data for Name: tipo_usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tipo_usuario (id_tipo_usuario, tipo) FROM stdin;
1	Master
2	Encargado
3	Ventas
\.


--
-- Name: tipo_usuario_id_tipo_usuario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('tipo_usuario_id_tipo_usuario_seq', 3, true);


--
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY usuario (id_usuario, nombre, ape_pat, ape_mat, rfc, colonia, calle, numero, ciudad, delegacion, cp, id_tipo_usuario, estatus, telefono, email) FROM stdin;
2	Cesar									     	1	f		
3	Cesar	Garcia	Noyola					   		     	1	t		
1	Cesar							      		     	3	f		
4	Juan	Peres	Lucas	sas	asas	asasa	asasas	asa      	as	asasa	3	f	asasasasas	asasasas
\.


--
-- Name: usuario_id_usuario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('usuario_id_usuario_seq', 1, false);


--
-- Data for Name: venta; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY venta (id_venta, fecha, id_usuario, id_cliente) FROM stdin;
\.


--
-- Name: venta_id_venta_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('venta_id_venta_seq', 1, false);


--
-- Name: categoria_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY categoria
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (id_categoria);


--
-- Name: cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente);


--
-- Name: compra_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY compra
    ADD CONSTRAINT compra_pkey PRIMARY KEY (id_compra);


--
-- Name: detalle_compra_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY detalle_compra
    ADD CONSTRAINT detalle_compra_pkey PRIMARY KEY (id_compra, id_producto);


--
-- Name: detalle_venta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY detalle_venta
    ADD CONSTRAINT detalle_venta_pkey PRIMARY KEY (id_venta, id_producto);


--
-- Name: devolucion_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY devolucion
    ADD CONSTRAINT devolucion_pkey PRIMARY KEY (id_devolucion);


--
-- Name: mercancia_temp_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY mercancia_temp
    ADD CONSTRAINT mercancia_temp_pkey PRIMARY KEY (id_producto);


--
-- Name: producto_aux_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY producto_aux
    ADD CONSTRAINT producto_aux_pkey PRIMARY KEY (id_producto);


--
-- Name: producto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY producto
    ADD CONSTRAINT producto_pkey PRIMARY KEY (id_producto);


--
-- Name: promocion_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY promocion
    ADD CONSTRAINT promocion_pkey PRIMARY KEY (id_promo);


--
-- Name: promocion_producto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY promocion_producto
    ADD CONSTRAINT promocion_producto_pkey PRIMARY KEY (id_promo, id_producto);


--
-- Name: proveedor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY proveedor
    ADD CONSTRAINT proveedor_pkey PRIMARY KEY (id_proveedor);


--
-- Name: tipo_cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tipo_cliente
    ADD CONSTRAINT tipo_cliente_pkey PRIMARY KEY (id_tipo_cliente);


--
-- Name: tipo_plazo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tipo_plazo
    ADD CONSTRAINT tipo_plazo_pkey PRIMARY KEY (id_tipo_plazo);


--
-- Name: tipo_usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tipo_usuario
    ADD CONSTRAINT tipo_usuario_pkey PRIMARY KEY (id_tipo_usuario);


--
-- Name: usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario);


--
-- Name: venta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY venta
    ADD CONSTRAINT venta_pkey PRIMARY KEY (id_venta);


--
-- Name: cliente_id_tipo_cliente_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT cliente_id_tipo_cliente_fkey FOREIGN KEY (id_tipo_cliente) REFERENCES tipo_cliente(id_tipo_cliente);


--
-- Name: compra_id_proveedor_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY compra
    ADD CONSTRAINT compra_id_proveedor_fkey FOREIGN KEY (id_proveedor) REFERENCES proveedor(id_proveedor);


--
-- Name: compra_id_tipo_plazo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY compra
    ADD CONSTRAINT compra_id_tipo_plazo_fkey FOREIGN KEY (id_tipo_plazo) REFERENCES tipo_plazo(id_tipo_plazo);


--
-- Name: detalle_compra_id_compra_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY detalle_compra
    ADD CONSTRAINT detalle_compra_id_compra_fkey FOREIGN KEY (id_compra) REFERENCES compra(id_compra);


--
-- Name: detalle_compra_id_producto_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY detalle_compra
    ADD CONSTRAINT detalle_compra_id_producto_fkey FOREIGN KEY (id_producto) REFERENCES producto(id_producto);


--
-- Name: detalle_venta_id_producto_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY detalle_venta
    ADD CONSTRAINT detalle_venta_id_producto_fkey FOREIGN KEY (id_producto) REFERENCES producto(id_producto);


--
-- Name: detalle_venta_id_venta_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY detalle_venta
    ADD CONSTRAINT detalle_venta_id_venta_fkey FOREIGN KEY (id_venta) REFERENCES venta(id_venta);


--
-- Name: devolucion_id_producto_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY devolucion
    ADD CONSTRAINT devolucion_id_producto_fkey FOREIGN KEY (id_producto) REFERENCES producto(id_producto);


--
-- Name: devolucion_id_venta_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY devolucion
    ADD CONSTRAINT devolucion_id_venta_fkey FOREIGN KEY (id_venta) REFERENCES venta(id_venta);


--
-- Name: mercancia_temp_id_producto_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY mercancia_temp
    ADD CONSTRAINT mercancia_temp_id_producto_fkey FOREIGN KEY (id_producto) REFERENCES producto(id_producto);


--
-- Name: producto_aux_id_producto_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producto_aux
    ADD CONSTRAINT producto_aux_id_producto_fkey FOREIGN KEY (id_producto) REFERENCES producto(id_producto);


--
-- Name: producto_id_categoria_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producto
    ADD CONSTRAINT producto_id_categoria_fkey FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria);


--
-- Name: producto_id_proveedor_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producto
    ADD CONSTRAINT producto_id_proveedor_fkey FOREIGN KEY (id_proveedor) REFERENCES proveedor(id_proveedor);


--
-- Name: promocion_producto_id_producto_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY promocion_producto
    ADD CONSTRAINT promocion_producto_id_producto_fkey FOREIGN KEY (id_producto) REFERENCES producto(id_producto);


--
-- Name: promocion_producto_id_promo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY promocion_producto
    ADD CONSTRAINT promocion_producto_id_promo_fkey FOREIGN KEY (id_promo) REFERENCES promocion(id_promo);


--
-- Name: usuario_id_tipo_usuario_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuario
    ADD CONSTRAINT usuario_id_tipo_usuario_fkey FOREIGN KEY (id_tipo_usuario) REFERENCES tipo_usuario(id_tipo_usuario);


--
-- Name: venta_id_cliente_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY venta
    ADD CONSTRAINT venta_id_cliente_fkey FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente);


--
-- Name: venta_id_usuario_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY venta
    ADD CONSTRAINT venta_id_usuario_fkey FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

