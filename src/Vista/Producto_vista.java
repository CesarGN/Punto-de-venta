package Vista;

import Controlador.Cliente_controlador;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Producto_vista extends javax.swing.JFrame {

    Principal principal;
    Cliente_controlador pc;
    int alta_baja;
    boolean buscar;

    public Producto_vista(Principal principal) {
        initComponents();
        this.buscar = false;
        this.setTitle("ADMINISTRACIÓN DE PRODUCTOS");
        this.setLocationRelativeTo(null);
        this.principal = principal;
        pc = new Cliente_controlador();
        this.alta_baja = 0;
        //agregar tipos de productos
        String[][] datos = pc.Select("select nombre from categoria;", 1);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                aFamilia.addItem(datos[i][j]);
                mFamilia.addItem(datos[i][j]);
            }
        }

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
        panelAltaFam = new javax.swing.JPanel();
        panelModFam = new javax.swing.JPanel();
        panelAltaProv = new javax.swing.JPanel();
        panelModfProv = new javax.swing.JPanel();

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
                        .addComponent(aProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(48, 48, 48)
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
                .addGap(56, 56, 56)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addGroup(panelAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(mFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(6, 6, 6))
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
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Producto.addTab("MOD PRODUCTO", panelModificacion);

        javax.swing.GroupLayout panelAltaFamLayout = new javax.swing.GroupLayout(panelAltaFam);
        panelAltaFam.setLayout(panelAltaFamLayout);
        panelAltaFamLayout.setHorizontalGroup(
            panelAltaFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        panelAltaFamLayout.setVerticalGroup(
            panelAltaFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        Producto.addTab("ALTA FAMILIA", panelAltaFam);

        javax.swing.GroupLayout panelModFamLayout = new javax.swing.GroupLayout(panelModFam);
        panelModFam.setLayout(panelModFamLayout);
        panelModFamLayout.setHorizontalGroup(
            panelModFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        panelModFamLayout.setVerticalGroup(
            panelModFamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        Producto.addTab("MOD FAMILIA", panelModFam);

        javax.swing.GroupLayout panelAltaProvLayout = new javax.swing.GroupLayout(panelAltaProv);
        panelAltaProv.setLayout(panelAltaProvLayout);
        panelAltaProvLayout.setHorizontalGroup(
            panelAltaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        panelAltaProvLayout.setVerticalGroup(
            panelAltaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        Producto.addTab("ALTA PROVEEDOR", panelAltaProv);

        javax.swing.GroupLayout panelModfProvLayout = new javax.swing.GroupLayout(panelModfProv);
        panelModfProv.setLayout(panelModfProvLayout);
        panelModfProvLayout.setHorizontalGroup(
            panelModfProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        panelModfProvLayout.setVerticalGroup(
            panelModfProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
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
            .addComponent(Producto)
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
        if (mOrdenar.getItemCount() != 0) {
            String[][] datos;
            if (this.alta_baja == 0) {
                datos = pc.Select("select id_cliente,ape_pat from cliente where estatus = true order by ape_pat;", 2);

            } else {
                datos = pc.Select("select id_cliente,ape_pat from cliente where estatus = true order by ape_pat;", 2);

            }
            if (datos != null) {
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
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONA UN PRODUCTO");
        }

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


    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel35MouseClicked

    private void etiquetaModificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaModificar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_etiquetaModificar1MouseClicked


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
    private javax.swing.JLabel bActualiza;
    private javax.swing.JComboBox bCliente;
    private javax.swing.JLabel etiquetaBaja;
    private javax.swing.JLabel etiquetaModificar;
    private javax.swing.JLabel etiquetaModificar1;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
    private javax.swing.JPanel panelAltaFam;
    private javax.swing.JPanel panelAltaProv;
    private javax.swing.JPanel panelAltas;
    private javax.swing.JPanel panelModFam;
    private javax.swing.JPanel panelModfProv;
    private javax.swing.JPanel panelModificacion;
    private javax.swing.JLabel ver;
    private javax.swing.JLabel ver_alta;
    private javax.swing.JLabel ver_baja;
    // End of variables declaration//GEN-END:variables
}
