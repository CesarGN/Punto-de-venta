package Vista;

import Controlador.Producto_controlador;
import Controlador.Proveedor_controlador;
import Controlador.Familia_controlador;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Producto_vista extends javax.swing.JFrame {

    Principal principal;
    Producto_controlador prod_c;
    Proveedor_controlador prov_c;
    Familia_controlador fam_c;
    int alta_baja_proveedor;
    boolean buscar;
    String id_prov, id_fami;

    public Producto_vista(Principal principal) {
        initComponents();
        this.buscar = false;
        this.setTitle("ADMINISTRACIÓN DE PRODUCTOS");
        this.setLocationRelativeTo(null);
        this.principal = principal;
        prov_c = new Proveedor_controlador();
        fam_c = new Familia_controlador();
        this.alta_baja_proveedor = 0;
        //agregar tipos de productos
        id_prov = "";
        actualiza_listas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        bCliente = new javax.swing.JComboBox();
        etiquetaBaja = new javax.swing.JLabel();
        bActualiza = new javax.swing.JLabel();
        Borrar = new javax.swing.JLabel();
        Producto = new javax.swing.JTabbedPane();
        panelAltas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        aNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        aVenta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        aExistencias = new javax.swing.JTextField();
        aCompra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        aDescripcion = new javax.swing.JTextArea();
        aImagen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        aCalidad = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        aFamilia = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        aProveedor = new javax.swing.JComboBox();
        imagen = new javax.swing.JLabel();
        agregarProducto = new javax.swing.JLabel();
        panelModificacion = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        mOrdenar = new javax.swing.JComboBox();
        etiquetaModificar = new javax.swing.JLabel();
        mCliente1 = new javax.swing.JComboBox();
        etiquetaModificar1 = new javax.swing.JLabel();
        ver_baja = new javax.swing.JLabel();
        ver_alta = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        mNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mVenta = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        mExistencias = new javax.swing.JTextField();
        mCompra = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        mDescripcion = new javax.swing.JTextArea();
        mImagen = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        mFamilia = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        mProveedor = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        mCalidad = new javax.swing.JComboBox();
        mEstatus = new javax.swing.JLabel();
        aEstado2 = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        modProducto = new javax.swing.JLabel();
        panelAltaFam = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        a_nom_fam = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        a_por_fam = new javax.swing.JTextField();
        agregarFamilia = new javax.swing.JLabel();
        panelModFam = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        m_nom_fam = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        m_por_fam = new javax.swing.JTextField();
        modFamilia = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        familia = new javax.swing.JComboBox();
        verFamilia = new javax.swing.JLabel();
        actualizafam = new javax.swing.JLabel();
        panelAltaProv = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        a_nom_pro = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        a_cal_pro = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        a_num_pro = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        a_cp_pro = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        a_rfc_pro = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        a_tel_pro = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        a_mail_pro = new javax.swing.JTextField();
        a_ciu_pro = new javax.swing.JTextField();
        a_est_pro = new javax.swing.JTextField();
        a_col_pro = new javax.swing.JTextField();
        agregarProveedor = new javax.swing.JLabel();
        panelModfProv = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        proveedor = new javax.swing.JComboBox();
        verProveedor = new javax.swing.JLabel();
        ver_alta_proveedor = new javax.swing.JLabel();
        ver_baja_proveedor = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        m_nom_pro = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        m_cal_pro = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        m_num_pro = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        m_cp_pro = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        m_rfc_pro = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        m_tel_pro = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        m_mail_pro = new javax.swing.JTextField();
        m_ciu_pro = new javax.swing.JTextField();
        m_est_pro = new javax.swing.JTextField();
        m_col_pro = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        m_estatus_pro = new javax.swing.JComboBox();
        modProveedor = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        jPanel6.setBackground(new java.awt.Color(200, 197, 197));

        bCliente.setBackground(new java.awt.Color(199, 195, 195));

        etiquetaBaja.setBackground(new java.awt.Color(164, 164, 164));
        etiquetaBaja.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        etiquetaBaja.setForeground(new java.awt.Color(1, 1, 1));
        etiquetaBaja.setText("Selecciona el cliente para dar de baja");
        etiquetaBaja.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bActualiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cliente/actualiza.png"))); // NOI18N
        bActualiza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bActualizaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bActualiza)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bActualiza)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etiquetaBaja)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cliente/basura1.png"))); // NOI18N
        Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Borrar)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addComponent(Borrar)
                .addGap(27, 27, 27))
        );

        setName("Cliente"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Producto.setBackground(new java.awt.Color(217, 15, 25));
        Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductoMouseClicked(evt);
            }
        });

        panelAltas.setBackground(new java.awt.Color(232, 232, 232));
        panelAltas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del producto"));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setText("Nombre");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aNombre.setBackground(new java.awt.Color(254, 254, 254));
        aNombre.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aNombre.setForeground(new java.awt.Color(1, 1, 1));
        aNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("Descripción");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 1, 1));
        jLabel8.setText("Existencias");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(1, 1, 1));
        jLabel9.setText("Costo compra");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(1, 1, 1));
        jLabel10.setText("Costo venta");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aVenta.setBackground(new java.awt.Color(254, 254, 254));
        aVenta.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aVenta.setForeground(new java.awt.Color(1, 1, 1));
        aVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 1, 1));
        jLabel12.setText("Imágen");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aExistencias.setBackground(new java.awt.Color(254, 254, 254));
        aExistencias.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aExistencias.setForeground(new java.awt.Color(1, 1, 1));
        aExistencias.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        aCompra.setBackground(new java.awt.Color(254, 254, 254));
        aCompra.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aCompra.setForeground(new java.awt.Color(1, 1, 1));
        aCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        aDescripcion.setColumns(20);
        aDescripcion.setRows(5);
        jScrollPane1.setViewportView(aDescripcion);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Producto/buscar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(1, 1, 1));
        jLabel17.setText("Calidad");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aCalidad.setBackground(new java.awt.Color(254, 254, 254));
        aCalidad.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aCalidad.setForeground(new java.awt.Color(1, 1, 1));
        aCalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NUEVO", "SEMINUEVO" }));

        jLabel14.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 1, 1));
        jLabel14.setText("Calcular por familia");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(306, 306, 306))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(aImagen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(aVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(26, 26, 26))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(aCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(aVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(aExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(aCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLabel13.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(1, 1, 1));
        jLabel13.setText("Familia");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aFamilia.setBackground(new java.awt.Color(254, 254, 254));
        aFamilia.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aFamilia.setForeground(new java.awt.Color(1, 1, 1));

        jLabel16.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 1, 1));
        jLabel16.setText("Proveedor");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aProveedor.setBackground(new java.awt.Color(254, 254, 254));
        aProveedor.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aProveedor.setForeground(new java.awt.Color(1, 1, 1));

        imagen.setBackground(new java.awt.Color(254, 254, 254));
        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        agregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Producto/ok.png"))); // NOI18N
        agregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aFamilia, 0, 322, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(agregarProducto)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(aFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(aProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAltasLayout = new javax.swing.GroupLayout(panelAltas);
        panelAltas.setLayout(panelAltasLayout);
        panelAltasLayout.setHorizontalGroup(
            panelAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltasLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAltasLayout.setVerticalGroup(
            panelAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleDescription("");

        Producto.addTab("ALTA PRODUCTO", panelAltas);

        panelModificacion.setBackground(new java.awt.Color(232, 232, 232));
        panelModificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelModificacionMouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(193, 197, 197));

        etiquetaModificar.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        etiquetaModificar.setForeground(new java.awt.Color(1, 1, 1));
        etiquetaModificar.setText("Selecciona el producto");
        etiquetaModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etiquetaModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiquetaModificarMouseClicked(evt);
            }
        });

        etiquetaModificar1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        etiquetaModificar1.setForeground(new java.awt.Color(1, 1, 1));
        etiquetaModificar1.setText("Ordenar por");
        etiquetaModificar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etiquetaModificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiquetaModificar1MouseClicked(evt);
            }
        });

        ver_baja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cliente/baja.png"))); // NOI18N
        ver_baja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_bajaMouseClicked(evt);
            }
        });

        ver_alta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cliente/alta.png"))); // NOI18N
        ver_alta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_altaMouseClicked(evt);
            }
        });

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cliente/ver.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(etiquetaModificar)
                        .addGap(18, 18, 18)
                        .addComponent(mCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(ver_baja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ver_alta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ver)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaModificar)
                    .addComponent(mCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaModificar1)
                    .addComponent(mOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ver_baja, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ver_alta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ver, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del producto"));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("Nombre");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mNombre.setBackground(new java.awt.Color(254, 254, 254));
        mNombre.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mNombre.setForeground(new java.awt.Color(1, 1, 1));
        mNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setText("Descripción");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 1, 1));
        jLabel11.setText("Existencias");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(1, 1, 1));
        jLabel18.setText("Costo compra");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(1, 1, 1));
        jLabel19.setText("Costo venta");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mVenta.setBackground(new java.awt.Color(254, 254, 254));
        mVenta.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mVenta.setForeground(new java.awt.Color(1, 1, 1));
        mVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel21.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(1, 1, 1));
        jLabel21.setText("Imágen");
        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mExistencias.setBackground(new java.awt.Color(254, 254, 254));
        mExistencias.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mExistencias.setForeground(new java.awt.Color(1, 1, 1));
        mExistencias.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        mCompra.setBackground(new java.awt.Color(254, 254, 254));
        mCompra.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mCompra.setForeground(new java.awt.Color(1, 1, 1));
        mCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        mDescripcion.setColumns(20);
        mDescripcion.setRows(5);
        jScrollPane2.setViewportView(mDescripcion);

        mImagen.setEditable(false);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Producto/buscar.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(1, 1, 1));
        jLabel41.setText("ID producto");
        jLabel41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mImagen)
                                    .addComponent(mExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel35)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(mCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(mVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(mExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(mImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel37.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(1, 1, 1));
        jLabel37.setText("Familia");
        jLabel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mFamilia.setBackground(new java.awt.Color(254, 254, 254));
        mFamilia.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mFamilia.setForeground(new java.awt.Color(1, 1, 1));

        jLabel38.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(1, 1, 1));
        jLabel38.setText("Proveedor");
        jLabel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mProveedor.setBackground(new java.awt.Color(254, 254, 254));
        mProveedor.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mProveedor.setForeground(new java.awt.Color(1, 1, 1));

        jLabel39.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(1, 1, 1));
        jLabel39.setText("Calidad");
        jLabel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mCalidad.setBackground(new java.awt.Color(254, 254, 254));
        mCalidad.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mCalidad.setForeground(new java.awt.Color(1, 1, 1));
        mCalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NUEVO", "SEMINUEVO" }));

        mEstatus.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mEstatus.setForeground(new java.awt.Color(1, 1, 1));
        mEstatus.setText("Estatus");
        mEstatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aEstado2.setBackground(new java.awt.Color(254, 254, 254));
        aEstado2.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aEstado2.setForeground(new java.awt.Color(1, 1, 1));
        aEstado2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALTA", "BAJA" }));

        jLabel36.setBackground(new java.awt.Color(254, 254, 254));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        modProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Producto/actualiza.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mFamilia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mProveedor, 0, 322, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(modProducto)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(mFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(mProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(mCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mEstatus)))
                .addGap(18, 18, 18)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelModificacionLayout = new javax.swing.GroupLayout(panelModificacion);
        panelModificacion.setLayout(panelModificacionLayout);
        panelModificacionLayout.setHorizontalGroup(
            panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificacionLayout.createSequentialGroup()
                .addGroup(panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelModificacionLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        panelModificacionLayout.setVerticalGroup(
            panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Producto.addTab("MOD PRODUCTO", panelModificacion);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos de la familia"));

        jLabel15.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(1, 1, 1));
        jLabel15.setText("Nombre");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        a_nom_fam.setBackground(new java.awt.Color(254, 254, 254));
        a_nom_fam.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_nom_fam.setForeground(new java.awt.Color(1, 1, 1));
        a_nom_fam.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel23.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(1, 1, 1));
        jLabel23.setText("Porcentaje de ganancia");
        jLabel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        a_por_fam.setBackground(new java.awt.Color(254, 254, 254));
        a_por_fam.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_por_fam.setForeground(new java.awt.Color(1, 1, 1));
        a_por_fam.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        agregarFamilia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Producto/ok.png"))); // NOI18N
        agregarFamilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarFamiliaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a_nom_fam)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a_por_fam, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(agregarFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a_nom_fam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(a_por_fam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(agregarFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAltaFamLayout = new javax.swing.GroupLayout(panelAltaFam);
        panelAltaFam.setLayout(panelAltaFamLayout);
        panelAltaFamLayout.setHorizontalGroup(
            panelAltaFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltaFamLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        panelAltaFamLayout.setVerticalGroup(
            panelAltaFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltaFamLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Producto.addTab("ALTA FAMILIA", panelAltaFam);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos de la familia"));

        jLabel20.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(1, 1, 1));
        jLabel20.setText("Nombre");
        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_nom_fam.setBackground(new java.awt.Color(254, 254, 254));
        m_nom_fam.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_nom_fam.setForeground(new java.awt.Color(1, 1, 1));
        m_nom_fam.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel24.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(1, 1, 1));
        jLabel24.setText("Porcentaje de ganancia");
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_por_fam.setBackground(new java.awt.Color(254, 254, 254));
        m_por_fam.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_por_fam.setForeground(new java.awt.Color(1, 1, 1));
        m_por_fam.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        modFamilia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modFamilia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Producto/actualiza.png"))); // NOI18N
        modFamilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modFamiliaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_nom_fam)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_por_fam, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modFamilia)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_nom_fam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(m_por_fam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(181, 179, 177));

        jLabel25.setBackground(new java.awt.Color(240, 242, 241));
        jLabel25.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel25.setText("Selecciona la Familia");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        verFamilia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verFamilia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Producto/ver.png"))); // NOI18N
        verFamilia.setBorder(null);
        verFamilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verFamiliaMouseClicked(evt);
            }
        });

        actualizafam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualizafam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Producto/actualiza.png"))); // NOI18N
        actualizafam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizafamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 230, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(familia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actualizafam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verFamilia)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(familia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(actualizafam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(verFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panelModFamLayout = new javax.swing.GroupLayout(panelModFam);
        panelModFam.setLayout(panelModFamLayout);
        panelModFamLayout.setHorizontalGroup(
            panelModFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModFamLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(panelModFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        panelModFamLayout.setVerticalGroup(
            panelModFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModFamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        Producto.addTab("MOD FAMILIA", panelModFam);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del proveedor"));

        jLabel27.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(1, 1, 1));
        jLabel27.setText("*Nombre (s)");
        jLabel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        a_nom_pro.setBackground(new java.awt.Color(254, 254, 254));
        a_nom_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_nom_pro.setForeground(new java.awt.Color(1, 1, 1));
        a_nom_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel32.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(1, 1, 1));
        jLabel32.setText("Estado");
        jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel33.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(1, 1, 1));
        jLabel33.setText("Ciudad/Municipio");
        jLabel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel34.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(1, 1, 1));
        jLabel34.setText("Colonia");
        jLabel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel40.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(1, 1, 1));
        jLabel40.setText("Calle");
        jLabel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        a_cal_pro.setBackground(new java.awt.Color(254, 254, 254));
        a_cal_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_cal_pro.setForeground(new java.awt.Color(1, 1, 1));
        a_cal_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel43.setBackground(new java.awt.Color(192, 182, 182));
        jLabel43.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(1, 1, 1));
        jLabel43.setText("Número");
        jLabel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        a_num_pro.setBackground(new java.awt.Color(254, 254, 254));
        a_num_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_num_pro.setForeground(new java.awt.Color(1, 1, 1));
        a_num_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel44.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(1, 1, 1));
        jLabel44.setText("Código postal");
        jLabel44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        a_cp_pro.setBackground(new java.awt.Color(254, 254, 254));
        a_cp_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_cp_pro.setForeground(new java.awt.Color(1, 1, 1));
        a_cp_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel46.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(1, 1, 1));
        jLabel46.setText("RFC");
        jLabel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        a_rfc_pro.setBackground(new java.awt.Color(254, 254, 254));
        a_rfc_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_rfc_pro.setForeground(new java.awt.Color(1, 1, 1));
        a_rfc_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel47.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(1, 1, 1));
        jLabel47.setText("Teléfono");
        jLabel47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        a_tel_pro.setBackground(new java.awt.Color(254, 254, 254));
        a_tel_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_tel_pro.setForeground(new java.awt.Color(1, 1, 1));
        a_tel_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel48.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(1, 1, 1));
        jLabel48.setText("E-mail");
        jLabel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        a_mail_pro.setBackground(new java.awt.Color(254, 254, 254));
        a_mail_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_mail_pro.setForeground(new java.awt.Color(1, 1, 1));
        a_mail_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        a_ciu_pro.setBackground(new java.awt.Color(254, 254, 254));
        a_ciu_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_ciu_pro.setForeground(new java.awt.Color(1, 1, 1));
        a_ciu_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        a_est_pro.setBackground(new java.awt.Color(254, 254, 254));
        a_est_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_est_pro.setForeground(new java.awt.Color(1, 1, 1));
        a_est_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        a_col_pro.setBackground(new java.awt.Color(254, 254, 254));
        a_col_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        a_col_pro.setForeground(new java.awt.Color(1, 1, 1));
        a_col_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a_rfc_pro)
                    .addComponent(a_nom_pro)
                    .addComponent(a_ciu_pro)
                    .addComponent(a_est_pro)
                    .addComponent(a_col_pro)
                    .addComponent(a_mail_pro)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(a_cal_pro)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(a_cp_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a_num_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(a_tel_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(83, 83, 83))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(a_nom_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(a_rfc_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(a_est_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(a_ciu_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(a_col_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(a_cal_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(a_cp_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(a_num_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(a_mail_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(a_tel_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        agregarProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cliente/oki.png"))); // NOI18N
        agregarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarProveedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelAltaProvLayout = new javax.swing.GroupLayout(panelAltaProv);
        panelAltaProv.setLayout(panelAltaProvLayout);
        panelAltaProvLayout.setHorizontalGroup(
            panelAltaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAltaProvLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarProveedor)
                .addGap(161, 161, 161))
        );
        panelAltaProvLayout.setVerticalGroup(
            panelAltaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltaProvLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelAltaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregarProveedor)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        Producto.addTab("ALTA PROVEEDOR", panelAltaProv);

        jPanel10.setBackground(new java.awt.Color(181, 179, 177));

        jLabel28.setBackground(new java.awt.Color(240, 242, 241));
        jLabel28.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel28.setText("Selecciona proveedor");
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        verProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Producto/ver.png"))); // NOI18N
        verProveedor.setBorder(null);
        verProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verProveedorMouseClicked(evt);
            }
        });

        ver_alta_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cliente/alta.png"))); // NOI18N
        ver_alta_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_alta_proveedorMouseClicked(evt);
            }
        });

        ver_baja_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cliente/baja.png"))); // NOI18N
        ver_baja_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_baja_proveedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ver_baja_proveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ver_alta_proveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verProveedor)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ver_baja_proveedor)
                    .addComponent(verProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ver_alta_proveedor)))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos personales"));

        jLabel29.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(1, 1, 1));
        jLabel29.setText("*Nombre (s)");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_nom_pro.setBackground(new java.awt.Color(254, 254, 254));
        m_nom_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_nom_pro.setForeground(new java.awt.Color(1, 1, 1));
        m_nom_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel50.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(1, 1, 1));
        jLabel50.setText("Estado");
        jLabel50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel51.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(1, 1, 1));
        jLabel51.setText("Ciudad/Municipio");
        jLabel51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel52.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(1, 1, 1));
        jLabel52.setText("Colonia");
        jLabel52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel53.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(1, 1, 1));
        jLabel53.setText("Calle");
        jLabel53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_cal_pro.setBackground(new java.awt.Color(254, 254, 254));
        m_cal_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_cal_pro.setForeground(new java.awt.Color(1, 1, 1));
        m_cal_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel54.setBackground(new java.awt.Color(192, 182, 182));
        jLabel54.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(1, 1, 1));
        jLabel54.setText("Número");
        jLabel54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_num_pro.setBackground(new java.awt.Color(254, 254, 254));
        m_num_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_num_pro.setForeground(new java.awt.Color(1, 1, 1));
        m_num_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel55.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(1, 1, 1));
        jLabel55.setText("Código postal");
        jLabel55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_cp_pro.setBackground(new java.awt.Color(254, 254, 254));
        m_cp_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_cp_pro.setForeground(new java.awt.Color(1, 1, 1));
        m_cp_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel56.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(1, 1, 1));
        jLabel56.setText("RFC");
        jLabel56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_rfc_pro.setBackground(new java.awt.Color(254, 254, 254));
        m_rfc_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_rfc_pro.setForeground(new java.awt.Color(1, 1, 1));
        m_rfc_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel57.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(1, 1, 1));
        jLabel57.setText("Teléfono");
        jLabel57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_tel_pro.setBackground(new java.awt.Color(254, 254, 254));
        m_tel_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_tel_pro.setForeground(new java.awt.Color(1, 1, 1));
        m_tel_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel58.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(1, 1, 1));
        jLabel58.setText("E-mail");
        jLabel58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_mail_pro.setBackground(new java.awt.Color(254, 254, 254));
        m_mail_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_mail_pro.setForeground(new java.awt.Color(1, 1, 1));
        m_mail_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        m_ciu_pro.setBackground(new java.awt.Color(254, 254, 254));
        m_ciu_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_ciu_pro.setForeground(new java.awt.Color(1, 1, 1));
        m_ciu_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        m_est_pro.setBackground(new java.awt.Color(254, 254, 254));
        m_est_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_est_pro.setForeground(new java.awt.Color(1, 1, 1));
        m_est_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        m_col_pro.setBackground(new java.awt.Color(254, 254, 254));
        m_col_pro.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        m_col_pro.setForeground(new java.awt.Color(1, 1, 1));
        m_col_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel59.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(1, 1, 1));
        jLabel59.setText("Estatus");
        jLabel59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_estatus_pro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALTA", "BAJA" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_rfc_pro)
                            .addComponent(m_nom_pro)
                            .addComponent(m_ciu_pro)
                            .addComponent(m_est_pro)
                            .addComponent(m_col_pro)
                            .addComponent(m_mail_pro)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(m_cal_pro)
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                            .addComponent(m_cp_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(m_num_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(m_tel_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(83, 83, 83))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(m_estatus_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(m_nom_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(m_rfc_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(m_est_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(m_ciu_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(m_col_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(m_cal_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(m_cp_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(m_num_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(m_mail_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(m_tel_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(m_estatus_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        modProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Producto/actualiza.png"))); // NOI18N
        modProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modProveedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelModfProvLayout = new javax.swing.GroupLayout(panelModfProv);
        panelModfProv.setLayout(panelModfProvLayout);
        panelModfProvLayout.setHorizontalGroup(
            panelModfProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModfProvLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModfProvLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(modProveedor)
                .addGap(176, 176, 176))
        );
        panelModfProvLayout.setVerticalGroup(
            panelModfProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModfProvLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModfProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelModfProvLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(modProveedor)))
                .addGap(68, 68, 68))
        );

        Producto.addTab("MOD PROVEEDOR", panelModfProv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Producto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        principal.producto = false;
    }//GEN-LAST:event_formWindowClosing

    private void ProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoMouseClicked

    }//GEN-LAST:event_ProductoMouseClicked

    private void panelModificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModificacionMouseClicked

    }//GEN-LAST:event_panelModificacionMouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
//        if (mOrdenar.getItemCount() != 0) {
//            String[][] datos;
//            if (this.alta_baja == 0) {
//                datos = pc.Select("select id_cliente,ape_pat from cliente where estatus = true order by ape_pat;", 2);
//
//            } else {
//                datos = pc.Select("select id_cliente,ape_pat from cliente where estatus = true order by ape_pat;", 2);
//
//            }
//            if (datos != null) {

//                String id_cliente = datos[mCliente.getSelectedIndex()][0];
//                String sql = "select * from cliente where id_cliente = '" + id_cliente + "';";
//                datos = pc.Select(sql, 16);
//                if (datos != null) {
//                    mId.setText(datos[0][0]);
//                    mNombre.setText(datos[0][1]);
//                    mPaterno.setText(datos[0][2]);
//                    mMaterno.setText(datos[0][3]);
//                    mPuntos.setText(datos[0][4]);
//                    mRfc.setText(datos[0][5]);
//                    mColonia.setText(datos[0][6]);
//                    mCalle.setText(datos[0][7]);
//                    mNum.setText(datos[0][8]);
//                    mCiudad.setText(datos[0][9]);
//                    mEstado.setText(datos[0][10]);
//                    mCP.setText(datos[0][11]);
//                    mCategoria.setSelectedIndex(Integer.parseInt(datos[0][12]) - 1);
//
//                    mTelefono.setText(datos[0][13]);
//                    mEmail.setText(datos[0][14]);
//                    if (datos[0][15].equals("t")) {
//                        mEstatus.setSelectedIndex(1);
//                    } else {
//                        mEstatus.setSelectedIndex(0);
//                    }
//                }
        //       }
//        } else {
//            JOptionPane.showMessageDialog(null, "SELECCIONA UN PRODUCTO");
//        }

    }//GEN-LAST:event_verMouseClicked

    private void ver_altaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_altaMouseClicked
//        mCliente.removeAllItems();
//        String[][] datos = pc.Select("select nombre,ape_pat,ape_mat from cliente where estatus = true order by ape_pat;", 3);
//        if (datos != null) {
//            this.alta_baja = 1;
//            String nombre = "";
//            for (int i = 0; i < datos.length; i++) {
//                nombre += datos[i][1] + " " + datos[i][2] + " " + datos[i][0];
//                mCliente.addItem(nombre);
//                nombre = "";
//            }
//        }
    }//GEN-LAST:event_ver_altaMouseClicked

    private void ver_bajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_bajaMouseClicked
//        mCliente.removeAllItems();
//        String[][] datos = pc.Select("select nombre,ape_pat,ape_mat from cliente where estatus = false order by ape_pat;", 3);
//        if (datos != null) {
//            this.alta_baja = 0;
//            String nombre = "";
//            for (int i = 0; i < datos.length; i++) {
//                nombre += datos[i][1] + " " + datos[i][2] + " " + datos[i][0];
//                mCliente.addItem(nombre);
//                nombre = "";
//            }
//        }
    }//GEN-LAST:event_ver_bajaMouseClicked

    private void etiquetaModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaModificarMouseClicked

    }//GEN-LAST:event_etiquetaModificarMouseClicked

    private void BorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarMouseClicked


    }//GEN-LAST:event_BorrarMouseClicked

    private void bActualizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bActualizaMouseClicked
//        bCliente.removeAllItems();
//        String[][] datos = pc.Select("select nombre,ape_pat,ape_mat from cliente where estatus = true order by ape_pat;", 3);
//        if (datos != null) {
//            String nombre = "";
//            for (int i = 0; i < datos.length; i++) {
//                nombre += datos[i][1] + " " + datos[i][2] + " " + datos[i][0];
//                bCliente.addItem(nombre);
//                nombre = "";
//            }
//        }
    }//GEN-LAST:event_bActualizaMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (!buscar) {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF & PNG", "jpg", "gif", "png");
            jfc.setFileFilter(filter);
            int seleccion = jfc.showOpenDialog(new JTextArea());
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                String path = jfc.getSelectedFile().getPath();
                aImagen.setText(jfc.getSelectedFile().getName());
                agregaImagen(path, imagen);
            } else {
                aImagen.setText("");
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void agregaImagen(String path, JLabel label) {
        ImageIcon fot = new ImageIcon(path);
        ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icono);
    }

    private void actualiza_listas() {
        String[][] datos = prov_c.Select("select nombre from categoria order by nombre;", 1);
        if (datos != null) {
            for (int i = 0; i < datos.length; i++) {
                for (int j = 0; j < datos[i].length; j++) {
                    aFamilia.addItem(datos[i][j]);
                    mFamilia.addItem(datos[i][j]);
                    familia.addItem(datos[i][j]);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "AGREGAR UNA FAMILIA MÍNIMO");
        }

        datos = prov_c.Select("select nombre from proveedor order by nombre;", 1);
        if (datos != null) {
            for (int i = 0; i < datos.length; i++) {
                for (int j = 0; j < datos[i].length; j++) {
                    aProveedor.addItem(datos[i][j]);
                    mProveedor.addItem(datos[i][j]);
                    proveedor.addItem(datos[i][j]);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "AGREGAR UN PROVEEDOR MÍNIMO");
        }

    }

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel35MouseClicked

    private void etiquetaModificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaModificar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_etiquetaModificar1MouseClicked

    private void agregarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarProveedorMouseClicked
        String datos[] = new String[11];
        datos[0] = a_nom_pro.getText();
        datos[1] = a_col_pro.getText();
        datos[2] = a_cal_pro.getText();
        datos[3] = a_num_pro.getText();
        datos[4] = a_ciu_pro.getText();
        datos[5] = a_est_pro.getText();
        datos[6] = a_tel_pro.getText();
        datos[7] = a_mail_pro.getText();
        datos[8] = a_rfc_pro.getText();
        datos[9] = a_cp_pro.getText();
        datos[10] = "true";
        prov_c.agregarInsertProvedor(datos);
        actualiza_listas();
    }//GEN-LAST:event_agregarProveedorMouseClicked

    private void ver_alta_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_alta_proveedorMouseClicked
        proveedor.removeAllItems();
        String[][] datos = prov_c.Select("select nombre from proveedor where estatus = true order by nombre;", 1);
        if (datos != null) {
            this.alta_baja_proveedor = 1;
            String nombre = "";
            for (int i = 0; i < datos.length; i++) {
                nombre = datos[i][0];
                proveedor.addItem(nombre);
                nombre = "";
            }
        }
    }//GEN-LAST:event_ver_alta_proveedorMouseClicked

    private void ver_baja_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_baja_proveedorMouseClicked
        proveedor.removeAllItems();
        String[][] datos = prov_c.Select("select nombre from proveedor where estatus = false order by nombre;", 1);
        if (datos != null) {
            this.alta_baja_proveedor = 0;
            String nombre = "";
            for (int i = 0; i < datos.length; i++) {
                nombre = datos[i][0];
                proveedor.addItem(nombre);
                nombre = "";
            }
        }
    }//GEN-LAST:event_ver_baja_proveedorMouseClicked

    private void verProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProveedorMouseClicked
        if (proveedor.getItemCount() != 0) {
            String[][] datos;

            if (this.alta_baja_proveedor == 0) {
                datos = prov_c.Select("select id_proveedor,nombre from proveedor where estatus = false order by nombre;", 2);
            } else {
                datos = prov_c.Select("select id_proveedor,nombre from proveedor where estatus = true order by nombre;", 2);
            }
            if (datos != null) {
                String id_proveedor = datos[proveedor.getSelectedIndex()][0];
                String sql = "select * from proveedor where id_proveedor = " + id_proveedor + ";";
                datos = prov_c.Select(sql, 12);
                if (datos != null) {
                    id_prov = datos[0][0];
                    m_nom_pro.setText(datos[0][1]);
                    m_col_pro.setText(datos[0][2]);
                    m_cal_pro.setText(datos[0][3]);
                    m_num_pro.setText(datos[0][4]);
                    m_ciu_pro.setText(datos[0][5]);
                    m_est_pro.setText(datos[0][6]);
                    m_tel_pro.setText(datos[0][7]);
                    m_mail_pro.setText(datos[0][8]);
                    m_rfc_pro.setText(datos[0][9]);
                    m_cp_pro.setText(datos[0][10]);
                    if (datos[0][11].equals("t")) {
                        m_estatus_pro.setSelectedIndex(0);
                    } else {
                        m_estatus_pro.setSelectedIndex(1);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONA UN PROVEEDOR");
        }


    }//GEN-LAST:event_verProveedorMouseClicked

    private void modProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modProveedorMouseClicked
        String datos[] = new String[12];
        datos[0] = id_prov;
        datos[1] = m_nom_pro.getText();
        datos[2] = m_col_pro.getText();
        datos[3] = m_cal_pro.getText();
        datos[4] = m_num_pro.getText();
        datos[5] = m_ciu_pro.getText();
        datos[6] = m_est_pro.getText();
        datos[7] = m_tel_pro.getText();
        datos[8] = m_mail_pro.getText();
        datos[9] = m_rfc_pro.getText();
        datos[10] = m_cp_pro.getText();
        if (String.valueOf(m_estatus_pro.getSelectedItem()).equals("ALTA")) {
            datos[11] = "true";
        } else {
            datos[11] = "false";
        }

        prov_c.agregarUpdateProvedor(datos);
    }//GEN-LAST:event_modProveedorMouseClicked

    private void agregarFamiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarFamiliaMouseClicked
        String datos[] = new String[2];
        datos[0] = a_nom_fam.getText();
        datos[1] = a_por_fam.getText();
        fam_c.agregarInsertFamilia(datos);
        actualiza_listas();

    }//GEN-LAST:event_agregarFamiliaMouseClicked

    private void modFamiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modFamiliaMouseClicked
        String datos[] = new String[3];
        datos[0] = id_fami;
        datos[1] = m_nom_fam.getText();
        datos[2] = m_por_fam.getText();
        fam_c.agregarUpdateFamilia(datos);
    }//GEN-LAST:event_modFamiliaMouseClicked

    private void verFamiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verFamiliaMouseClicked
        if (familia.getItemCount() != 0) {
            String[][] datos = fam_c.Select("select id_categoria,nombre from categoria order by nombre;", 2);
            if (datos != null) {
                String id_fam = datos[familia.getSelectedIndex()][0];
                String sql = "select * from categoria where id_categoria = " + id_fam + ";";
                datos = fam_c.Select(sql, 3);
                if (datos != null) {
                    id_fami = datos[0][0];
                    m_nom_fam.setText(datos[0][1]);
                    m_por_fam.setText(datos[0][2]);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "AGREGA UNA FAMILIA");
        }
    }//GEN-LAST:event_verFamiliaMouseClicked

    private void actualizafamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizafamMouseClicked
        familia.removeAllItems();
        String[][] datos = prov_c.Select("select nombre from categoria order by nombre;", 1);
        if (datos != null) {
            String nombre = "";
            for (int i = 0; i < datos.length; i++) {
                nombre = datos[i][0];
                familia.addItem(nombre);
                nombre = "";
            }
        }
    }//GEN-LAST:event_actualizafamMouseClicked

    private void agregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarProductoMouseClicked
          String[][] familia = fam_c.Select("select nombre from categoria order by nombre;", 1);
            String[][] proveedor = prov_c.Select("select nombre from categoria order by nombre;", 1);
      
        String datos[] = new String [12];
            datos[0]="id";
            datos[1]=aNombre.getText();
            datos[2]=aDescripcion.getText();
            datos[3]=aExistencias.getText();
            datos[4]=aCompra.getText();
            datos[5]=aVenta.getText();
            datos[6]=aImagen.getText();
            datos[7]=aEstado2.getSelectedItem().toString();
            datos[8]=aFamilia.getSelectedIndex();
            datos[9]=;
            datos[10]=;
            datos[11]=;
        
        
        

    }//GEN-LAST:event_agregarProductoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Borrar;
    private javax.swing.JTabbedPane Producto;
    private javax.swing.JComboBox aCalidad;
    private javax.swing.JTextField aCompra;
    private javax.swing.JTextArea aDescripcion;
    private javax.swing.JComboBox aEstado2;
    private javax.swing.JTextField aExistencias;
    private javax.swing.JComboBox aFamilia;
    private javax.swing.JTextField aImagen;
    private javax.swing.JTextField aNombre;
    private javax.swing.JComboBox aProveedor;
    private javax.swing.JTextField aVenta;
    private javax.swing.JTextField a_cal_pro;
    private javax.swing.JTextField a_ciu_pro;
    private javax.swing.JTextField a_col_pro;
    private javax.swing.JTextField a_cp_pro;
    private javax.swing.JTextField a_est_pro;
    private javax.swing.JTextField a_mail_pro;
    private javax.swing.JTextField a_nom_fam;
    private javax.swing.JTextField a_nom_pro;
    private javax.swing.JTextField a_num_pro;
    private javax.swing.JTextField a_por_fam;
    private javax.swing.JTextField a_rfc_pro;
    private javax.swing.JTextField a_tel_pro;
    private javax.swing.JLabel actualizafam;
    private javax.swing.JLabel agregarFamilia;
    private javax.swing.JLabel agregarProducto;
    private javax.swing.JLabel agregarProveedor;
    private javax.swing.JLabel bActualiza;
    private javax.swing.JComboBox bCliente;
    private javax.swing.JLabel etiquetaBaja;
    private javax.swing.JLabel etiquetaModificar;
    private javax.swing.JLabel etiquetaModificar1;
    private javax.swing.JComboBox familia;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox mCalidad;
    private javax.swing.JComboBox mCliente1;
    private javax.swing.JTextField mCompra;
    private javax.swing.JTextArea mDescripcion;
    private javax.swing.JLabel mEstatus;
    private javax.swing.JTextField mExistencias;
    private javax.swing.JComboBox mFamilia;
    private javax.swing.JTextField mImagen;
    private javax.swing.JTextField mNombre;
    private javax.swing.JComboBox mOrdenar;
    private javax.swing.JComboBox mProveedor;
    private javax.swing.JTextField mVenta;
    private javax.swing.JTextField m_cal_pro;
    private javax.swing.JTextField m_ciu_pro;
    private javax.swing.JTextField m_col_pro;
    private javax.swing.JTextField m_cp_pro;
    private javax.swing.JTextField m_est_pro;
    private javax.swing.JComboBox m_estatus_pro;
    private javax.swing.JTextField m_mail_pro;
    private javax.swing.JTextField m_nom_fam;
    private javax.swing.JTextField m_nom_pro;
    private javax.swing.JTextField m_num_pro;
    private javax.swing.JTextField m_por_fam;
    private javax.swing.JTextField m_rfc_pro;
    private javax.swing.JTextField m_tel_pro;
    private javax.swing.JLabel modFamilia;
    private javax.swing.JLabel modProducto;
    private javax.swing.JLabel modProveedor;
    private javax.swing.JPanel panelAltaFam;
    private javax.swing.JPanel panelAltaProv;
    private javax.swing.JPanel panelAltas;
    private javax.swing.JPanel panelModFam;
    private javax.swing.JPanel panelModfProv;
    private javax.swing.JPanel panelModificacion;
    private javax.swing.JComboBox proveedor;
    private javax.swing.JLabel ver;
    private javax.swing.JLabel verFamilia;
    private javax.swing.JLabel verProveedor;
    private javax.swing.JLabel ver_alta;
    private javax.swing.JLabel ver_alta_proveedor;
    private javax.swing.JLabel ver_baja;
    private javax.swing.JLabel ver_baja_proveedor;
    // End of variables declaration//GEN-END:variables
}
