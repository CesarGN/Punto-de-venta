/*
Navicat PGSQL Data Transfer

Source Server         : PV_new
Source Server Version : 90304
Source Host           : 192.168.0.3:5432
Source Database       : pv
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90304
File Encoding         : 65001

Date: 2015-02-15 23:02:17
*/


-- ----------------------------
-- Sequence structure for categoria_id_categoria_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."categoria_id_categoria_seq";
CREATE SEQUENCE "public"."categoria_id_categoria_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for compra_id_compra_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."compra_id_compra_seq";
CREATE SEQUENCE "public"."compra_id_compra_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for devolucion_id_devolucion_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."devolucion_id_devolucion_seq";
CREATE SEQUENCE "public"."devolucion_id_devolucion_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for promocion_id_promo_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."promocion_id_promo_seq";
CREATE SEQUENCE "public"."promocion_id_promo_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for proveedor_id_proveedor_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."proveedor_id_proveedor_seq";
CREATE SEQUENCE "public"."proveedor_id_proveedor_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for tipo_cliente_id_tipo_cliente_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."tipo_cliente_id_tipo_cliente_seq";
CREATE SEQUENCE "public"."tipo_cliente_id_tipo_cliente_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for tipo_plazo_id_tipo_plazo_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."tipo_plazo_id_tipo_plazo_seq";
CREATE SEQUENCE "public"."tipo_plazo_id_tipo_plazo_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for tipo_usuario_id_tipo_usuario_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."tipo_usuario_id_tipo_usuario_seq";
CREATE SEQUENCE "public"."tipo_usuario_id_tipo_usuario_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for usuario_id_usuario_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."usuario_id_usuario_seq";
CREATE SEQUENCE "public"."usuario_id_usuario_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for venta_id_venta_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."venta_id_venta_seq";
CREATE SEQUENCE "public"."venta_id_venta_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Table structure for categoria
-- ----------------------------
DROP TABLE IF EXISTS "public"."categoria";
CREATE TABLE "public"."categoria" (
"id_categoria" int4 DEFAULT nextval('categoria_id_categoria_seq'::regclass) NOT NULL,
"nombre" varchar(25) COLLATE "default" NOT NULL,
"porcentaje" int4 NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for cliente
-- ----------------------------
DROP TABLE IF EXISTS "public"."cliente";
CREATE TABLE "public"."cliente" (
"id_cliente" char(5) COLLATE "default" NOT NULL,
"nombre" varchar(50) COLLATE "default" NOT NULL,
"ape_pat" varchar(50) COLLATE "default",
"ape_mat" varchar(50) COLLATE "default",
"puntos" int4 DEFAULT 0,
"rfc" varchar(13) COLLATE "default",
"colonia" varchar(60) COLLATE "default",
"calle" varchar(60) COLLATE "default",
"numero" varchar(6) COLLATE "default",
"ciudad" varchar(50) COLLATE "default",
"delegacion" varchar(50) COLLATE "default",
"cp" char(5) COLLATE "default",
"id_tipo_cliente" int4 NOT NULL,
"telefono" int4,
"email" varchar(100) COLLATE "default",
"estatus" bool NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for compra
-- ----------------------------
DROP TABLE IF EXISTS "public"."compra";
CREATE TABLE "public"."compra" (
"id_compra" int4 DEFAULT nextval('compra_id_compra_seq'::regclass) NOT NULL,
"id_proveedor" int4 NOT NULL,
"fecha" date NOT NULL,
"id_tipo_plazo" int4 NOT NULL,
"plazo" int4 NOT NULL,
"estatus" bool NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for detalle_compra
-- ----------------------------
DROP TABLE IF EXISTS "public"."detalle_compra";
CREATE TABLE "public"."detalle_compra" (
"id_compra" int4 NOT NULL,
"id_producto" char(5) COLLATE "default" NOT NULL,
"cantidad" int4,
"costo_producto" int4
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for detalle_venta
-- ----------------------------
DROP TABLE IF EXISTS "public"."detalle_venta";
CREATE TABLE "public"."detalle_venta" (
"id_venta" int4 NOT NULL,
"id_producto" char(5) COLLATE "default" NOT NULL,
"cantidad" int4 NOT NULL,
"precio_venta" int4 NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for devolucion
-- ----------------------------
DROP TABLE IF EXISTS "public"."devolucion";
CREATE TABLE "public"."devolucion" (
"id_devolucion" int4 DEFAULT nextval('devolucion_id_devolucion_seq'::regclass) NOT NULL,
"fecha" date,
"id_venta" int4 NOT NULL,
"id_producto" char(5) COLLATE "default" NOT NULL,
"descripcion" varchar(150) COLLATE "default" NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for mercancia_temp
-- ----------------------------
DROP TABLE IF EXISTS "public"."mercancia_temp";
CREATE TABLE "public"."mercancia_temp" (
"id_producto" char(5) COLLATE "default" NOT NULL,
"nombre" varchar(30) COLLATE "default" NOT NULL,
"cantidad" int4 NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for producto
-- ----------------------------
DROP TABLE IF EXISTS "public"."producto";
CREATE TABLE "public"."producto" (
"id_producto" char(5) COLLATE "default" NOT NULL,
"nombre" varchar(30) COLLATE "default" NOT NULL,
"descripcion" varchar(70) COLLATE "default" NOT NULL,
"existencias" int4 NOT NULL,
"costo_compra" int4 NOT NULL,
"costo_venta" int4 NOT NULL,
"imagen" bytea,
"nuevo_semi" varchar(15) COLLATE "default" NOT NULL,
"id_categoria" int4,
"id_proveedor" int4,
"estatus" bool NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for producto_aux
-- ----------------------------
DROP TABLE IF EXISTS "public"."producto_aux";
CREATE TABLE "public"."producto_aux" (
"id_producto" char(5) COLLATE "default" NOT NULL,
"existencias" int4 NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for promocion
-- ----------------------------
DROP TABLE IF EXISTS "public"."promocion";
CREATE TABLE "public"."promocion" (
"id_promo" int4 DEFAULT nextval('promocion_id_promo_seq'::regclass) NOT NULL,
"fecha_inicio" date,
"fecha_fin" date,
"porcentaje" int4
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for promocion_producto
-- ----------------------------
DROP TABLE IF EXISTS "public"."promocion_producto";
CREATE TABLE "public"."promocion_producto" (
"id_promo" int4 NOT NULL,
"id_producto" char(5) COLLATE "default" NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for proveedor
-- ----------------------------
DROP TABLE IF EXISTS "public"."proveedor";
CREATE TABLE "public"."proveedor" (
"id_proveedor" int4 DEFAULT nextval('proveedor_id_proveedor_seq'::regclass) NOT NULL,
"nombre" varchar(45) COLLATE "default" NOT NULL,
"colonia" varchar(60) COLLATE "default" NOT NULL,
"calle" varchar(60) COLLATE "default" NOT NULL,
"numero" varchar(6) COLLATE "default" NOT NULL,
"ciudad" varchar(50) COLLATE "default" NOT NULL,
"delegacion" varchar(50) COLLATE "default",
"telefono" int4,
"email" varchar(100) COLLATE "default",
"rfc" varchar(13) COLLATE "default",
"cp" char(5) COLLATE "default",
"estatus" bool NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for tipo_cliente
-- ----------------------------
DROP TABLE IF EXISTS "public"."tipo_cliente";
CREATE TABLE "public"."tipo_cliente" (
"id_tipo_cliente" int4 DEFAULT nextval('tipo_cliente_id_tipo_cliente_seq'::regclass) NOT NULL,
"tipo" varchar(20) COLLATE "default" NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for tipo_plazo
-- ----------------------------
DROP TABLE IF EXISTS "public"."tipo_plazo";
CREATE TABLE "public"."tipo_plazo" (
"id_tipo_plazo" int4 DEFAULT nextval('tipo_plazo_id_tipo_plazo_seq'::regclass) NOT NULL,
"plazo" varchar(10) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for tipo_usuario
-- ----------------------------
DROP TABLE IF EXISTS "public"."tipo_usuario";
CREATE TABLE "public"."tipo_usuario" (
"id_tipo_usuario" int4 DEFAULT nextval('tipo_usuario_id_tipo_usuario_seq'::regclass) NOT NULL,
"tipo" varchar(30) COLLATE "default" NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for usuario
-- ----------------------------
DROP TABLE IF EXISTS "public"."usuario";
CREATE TABLE "public"."usuario" (
"id_usuario" int4 DEFAULT nextval('usuario_id_usuario_seq'::regclass) NOT NULL,
"nombre" varchar(50) COLLATE "default" NOT NULL,
"ape_pat" varchar(50) COLLATE "default",
"ape_mat" varchar(50) COLLATE "default",
"rfc" varchar(13) COLLATE "default",
"colonia" varchar(60) COLLATE "default",
"calle" varchar(60) COLLATE "default",
"numero" varchar(6) COLLATE "default",
"ciudad" varchar(50) COLLATE "default",
"delegacion" varchar(50) COLLATE "default",
"cp" char(5) COLLATE "default",
"id_tipo_usuario" int4,
"estatus" bool,
"telefono" int4,
"email" varchar(100) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Table structure for venta
-- ----------------------------
DROP TABLE IF EXISTS "public"."venta";
CREATE TABLE "public"."venta" (
"id_venta" int4 DEFAULT nextval('venta_id_venta_seq'::regclass) NOT NULL,
"fecha" date NOT NULL,
"id_usuario" int4 NOT NULL,
"id_cliente" char(5) COLLATE "default" NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
ALTER SEQUENCE "public"."categoria_id_categoria_seq" OWNED BY "categoria"."id_categoria";
ALTER SEQUENCE "public"."compra_id_compra_seq" OWNED BY "compra"."id_compra";
ALTER SEQUENCE "public"."devolucion_id_devolucion_seq" OWNED BY "devolucion"."id_devolucion";
ALTER SEQUENCE "public"."promocion_id_promo_seq" OWNED BY "promocion"."id_promo";
ALTER SEQUENCE "public"."proveedor_id_proveedor_seq" OWNED BY "proveedor"."id_proveedor";
ALTER SEQUENCE "public"."tipo_cliente_id_tipo_cliente_seq" OWNED BY "tipo_cliente"."id_tipo_cliente";
ALTER SEQUENCE "public"."tipo_plazo_id_tipo_plazo_seq" OWNED BY "tipo_plazo"."id_tipo_plazo";
ALTER SEQUENCE "public"."tipo_usuario_id_tipo_usuario_seq" OWNED BY "tipo_usuario"."id_tipo_usuario";
ALTER SEQUENCE "public"."usuario_id_usuario_seq" OWNED BY "usuario"."id_usuario";
ALTER SEQUENCE "public"."venta_id_venta_seq" OWNED BY "venta"."id_venta";

-- ----------------------------
-- Primary Key structure for table categoria
-- ----------------------------
ALTER TABLE "public"."categoria" ADD PRIMARY KEY ("id_categoria");

-- ----------------------------
-- Primary Key structure for table cliente
-- ----------------------------
ALTER TABLE "public"."cliente" ADD PRIMARY KEY ("id_cliente");

-- ----------------------------
-- Primary Key structure for table compra
-- ----------------------------
ALTER TABLE "public"."compra" ADD PRIMARY KEY ("id_compra");

-- ----------------------------
-- Primary Key structure for table detalle_compra
-- ----------------------------
ALTER TABLE "public"."detalle_compra" ADD PRIMARY KEY ("id_compra", "id_producto");

-- ----------------------------
-- Primary Key structure for table detalle_venta
-- ----------------------------
ALTER TABLE "public"."detalle_venta" ADD PRIMARY KEY ("id_venta", "id_producto");

-- ----------------------------
-- Primary Key structure for table devolucion
-- ----------------------------
ALTER TABLE "public"."devolucion" ADD PRIMARY KEY ("id_devolucion");

-- ----------------------------
-- Primary Key structure for table mercancia_temp
-- ----------------------------
ALTER TABLE "public"."mercancia_temp" ADD PRIMARY KEY ("id_producto");

-- ----------------------------
-- Primary Key structure for table producto
-- ----------------------------
ALTER TABLE "public"."producto" ADD PRIMARY KEY ("id_producto");

-- ----------------------------
-- Primary Key structure for table producto_aux
-- ----------------------------
ALTER TABLE "public"."producto_aux" ADD PRIMARY KEY ("id_producto");

-- ----------------------------
-- Primary Key structure for table promocion
-- ----------------------------
ALTER TABLE "public"."promocion" ADD PRIMARY KEY ("id_promo");

-- ----------------------------
-- Primary Key structure for table promocion_producto
-- ----------------------------
ALTER TABLE "public"."promocion_producto" ADD PRIMARY KEY ("id_promo", "id_producto");

-- ----------------------------
-- Primary Key structure for table proveedor
-- ----------------------------
ALTER TABLE "public"."proveedor" ADD PRIMARY KEY ("id_proveedor");

-- ----------------------------
-- Primary Key structure for table tipo_cliente
-- ----------------------------
ALTER TABLE "public"."tipo_cliente" ADD PRIMARY KEY ("id_tipo_cliente");

-- ----------------------------
-- Primary Key structure for table tipo_plazo
-- ----------------------------
ALTER TABLE "public"."tipo_plazo" ADD PRIMARY KEY ("id_tipo_plazo");

-- ----------------------------
-- Primary Key structure for table tipo_usuario
-- ----------------------------
ALTER TABLE "public"."tipo_usuario" ADD PRIMARY KEY ("id_tipo_usuario");

-- ----------------------------
-- Primary Key structure for table usuario
-- ----------------------------
ALTER TABLE "public"."usuario" ADD PRIMARY KEY ("id_usuario");

-- ----------------------------
-- Primary Key structure for table venta
-- ----------------------------
ALTER TABLE "public"."venta" ADD PRIMARY KEY ("id_venta");

-- ----------------------------
-- Foreign Key structure for table "public"."cliente"
-- ----------------------------
ALTER TABLE "public"."cliente" ADD FOREIGN KEY ("id_tipo_cliente") REFERENCES "public"."tipo_cliente" ("id_tipo_cliente") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."compra"
-- ----------------------------
ALTER TABLE "public"."compra" ADD FOREIGN KEY ("id_tipo_plazo") REFERENCES "public"."tipo_plazo" ("id_tipo_plazo") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."compra" ADD FOREIGN KEY ("id_proveedor") REFERENCES "public"."proveedor" ("id_proveedor") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."detalle_compra"
-- ----------------------------
ALTER TABLE "public"."detalle_compra" ADD FOREIGN KEY ("id_producto") REFERENCES "public"."producto" ("id_producto") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."detalle_compra" ADD FOREIGN KEY ("id_compra") REFERENCES "public"."compra" ("id_compra") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."detalle_venta"
-- ----------------------------
ALTER TABLE "public"."detalle_venta" ADD FOREIGN KEY ("id_producto") REFERENCES "public"."producto" ("id_producto") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."detalle_venta" ADD FOREIGN KEY ("id_venta") REFERENCES "public"."venta" ("id_venta") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."devolucion"
-- ----------------------------
ALTER TABLE "public"."devolucion" ADD FOREIGN KEY ("id_producto") REFERENCES "public"."producto" ("id_producto") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."devolucion" ADD FOREIGN KEY ("id_venta") REFERENCES "public"."venta" ("id_venta") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."mercancia_temp"
-- ----------------------------
ALTER TABLE "public"."mercancia_temp" ADD FOREIGN KEY ("id_producto") REFERENCES "public"."producto" ("id_producto") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."producto"
-- ----------------------------
ALTER TABLE "public"."producto" ADD FOREIGN KEY ("id_proveedor") REFERENCES "public"."proveedor" ("id_proveedor") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."producto" ADD FOREIGN KEY ("id_categoria") REFERENCES "public"."categoria" ("id_categoria") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."producto_aux"
-- ----------------------------
ALTER TABLE "public"."producto_aux" ADD FOREIGN KEY ("id_producto") REFERENCES "public"."producto" ("id_producto") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."promocion_producto"
-- ----------------------------
ALTER TABLE "public"."promocion_producto" ADD FOREIGN KEY ("id_promo") REFERENCES "public"."promocion" ("id_promo") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."promocion_producto" ADD FOREIGN KEY ("id_producto") REFERENCES "public"."producto" ("id_producto") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."usuario"
-- ----------------------------
ALTER TABLE "public"."usuario" ADD FOREIGN KEY ("id_tipo_usuario") REFERENCES "public"."tipo_usuario" ("id_tipo_usuario") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "public"."venta"
-- ----------------------------
ALTER TABLE "public"."venta" ADD FOREIGN KEY ("id_cliente") REFERENCES "public"."cliente" ("id_cliente") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."venta" ADD FOREIGN KEY ("id_usuario") REFERENCES "public"."usuario" ("id_usuario") ON DELETE NO ACTION ON UPDATE NO ACTION;
