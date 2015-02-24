package Vista;

import Controlador.Usuario_controlador;
import javax.swing.JOptionPane;

public class Usuario_vista extends javax.swing.JFrame {

    Principal principal;
    Usuario_controlador cu;
    int alta_baja;

    public Usuario_vista(Principal principal) {
        initComponents();
        this.setTitle("ADMINISTRACIÓN DE USUARIOS");
        this.setLocationRelativeTo(null);
        this.principal = principal;
        cu = new Usuario_controlador();
        this.alta_baja = 0;
        //agregar tipos de cliente
        String[][] datos = cu.Select("select tipo from tipo_usuario;", 1);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                aCategoria.addItem(datos[i][j]);
                mCategoria.addItem(datos[i][j]);
            }
        }
this.mId.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelAltas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        aNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aPaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        aMaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        aCalle = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        aNum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        aCP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        aCategoria = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        aRFC = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        aTelefono = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        aMail = new javax.swing.JTextField();
        aCiudad = new javax.swing.JTextField();
        aEstado = new javax.swing.JTextField();
        aColonia = new javax.swing.JTextField();
        agregarCliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        bUsuario = new javax.swing.JComboBox();
        etiquetaBaja = new javax.swing.JLabel();
        bActualiza = new javax.swing.JLabel();
        Borrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        mUsuario = new javax.swing.JComboBox();
        etiquetaModificar = new javax.swing.JLabel();
        ver_baja = new javax.swing.JLabel();
        ver_alta = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        mNombre = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        mPaterno = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        mMaterno = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        mCalle = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        mNum = new javax.swing.JTextField();
        mCP = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        mEstado = new javax.swing.JTextField();
        mCiudad = new javax.swing.JTextField();
        mColonia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        mCategoria = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        mTelefono = new javax.swing.JTextField();
        mEmail = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        mRfc = new javax.swing.JTextField();
        mEstatus = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        modificar = new javax.swing.JLabel();
        mId = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setName("Cliente"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(245, 180, 116));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        panelAltas.setBackground(new java.awt.Color(232, 232, 232));
        panelAltas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos personales"));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setText("*Nombre (s)");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aNombre.setBackground(new java.awt.Color(254, 254, 254));
        aNombre.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aNombre.setForeground(new java.awt.Color(1, 1, 1));
        aNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("Apellido paterno");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aPaterno.setBackground(new java.awt.Color(254, 254, 254));
        aPaterno.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aPaterno.setForeground(new java.awt.Color(1, 1, 1));
        aPaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("Apellido materno");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aMaterno.setBackground(new java.awt.Color(254, 254, 254));
        aMaterno.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aMaterno.setForeground(new java.awt.Color(1, 1, 1));
        aMaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setText("Estado");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 1, 1));
        jLabel8.setText("Ciudad/Municipio");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(1, 1, 1));
        jLabel9.setText("Colonia");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(1, 1, 1));
        jLabel10.setText("Calle");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aCalle.setBackground(new java.awt.Color(254, 254, 254));
        aCalle.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aCalle.setForeground(new java.awt.Color(1, 1, 1));
        aCalle.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel11.setBackground(new java.awt.Color(192, 182, 182));
        jLabel11.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 1, 1));
        jLabel11.setText("Número");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aNum.setBackground(new java.awt.Color(254, 254, 254));
        aNum.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aNum.setForeground(new java.awt.Color(1, 1, 1));
        aNum.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 1, 1));
        jLabel12.setText("Código postal");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aCP.setBackground(new java.awt.Color(254, 254, 254));
        aCP.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aCP.setForeground(new java.awt.Color(1, 1, 1));
        aCP.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(1, 1, 1));
        jLabel13.setText("*Categoria");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aCategoria.setBackground(new java.awt.Color(254, 254, 254));
        aCategoria.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aCategoria.setForeground(new java.awt.Color(1, 1, 1));

        jLabel16.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 1, 1));
        jLabel16.setText("RFC");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aRFC.setBackground(new java.awt.Color(254, 254, 254));
        aRFC.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aRFC.setForeground(new java.awt.Color(1, 1, 1));
        aRFC.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel17.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(1, 1, 1));
        jLabel17.setText("Teléfono");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aTelefono.setBackground(new java.awt.Color(254, 254, 254));
        aTelefono.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aTelefono.setForeground(new java.awt.Color(1, 1, 1));
        aTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel18.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(1, 1, 1));
        jLabel18.setText("E-mail");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aMail.setBackground(new java.awt.Color(254, 254, 254));
        aMail.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aMail.setForeground(new java.awt.Color(1, 1, 1));
        aMail.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        aCiudad.setBackground(new java.awt.Color(254, 254, 254));
        aCiudad.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aCiudad.setForeground(new java.awt.Color(1, 1, 1));
        aCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        aEstado.setBackground(new java.awt.Color(254, 254, 254));
        aEstado.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aEstado.setForeground(new java.awt.Color(1, 1, 1));
        aEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        aColonia.setBackground(new java.awt.Color(254, 254, 254));
        aColonia.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        aColonia.setForeground(new java.awt.Color(1, 1, 1));
        aColonia.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        agregarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cliente/oki.png"))); // NOI18N
        agregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aPaterno)
                            .addComponent(aMaterno)
                            .addComponent(aRFC)
                            .addComponent(aNombre)
                            .addComponent(aCiudad)
                            .addComponent(aEstado)
                            .addComponent(aColonia)
                            .addComponent(aMail)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(aCalle)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(aCP, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(aNum, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(aTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(agregarCliente)))
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(aCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(aPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(aMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(aRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(aEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(aCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(aColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(aCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(aCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(aNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(aMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(aTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(agregarCliente))))
        );

        javax.swing.GroupLayout panelAltasLayout = new javax.swing.GroupLayout(panelAltas);
        panelAltas.setLayout(panelAltasLayout);
        panelAltasLayout.setHorizontalGroup(
            panelAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelAltasLayout.setVerticalGroup(
            panelAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ALTA", panelAltas);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        jPanel6.setBackground(new java.awt.Color(200, 197, 197));

        bUsuario.setBackground(new java.awt.Color(199, 195, 195));

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
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(etiquetaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bActualiza)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bActualiza)
                    .addComponent(etiquetaBaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Borrar)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                .addComponent(Borrar)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("BAJA", jPanel1);

        jPanel3.setBackground(new java.awt.Color(232, 232, 232));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(193, 197, 197));

        etiquetaModificar.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        etiquetaModificar.setForeground(new java.awt.Color(1, 1, 1));
        etiquetaModificar.setText("Selecciona el cliente para modificar");
        etiquetaModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etiquetaModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiquetaModificarMouseClicked(evt);
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
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(etiquetaModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ver_baja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ver_alta)
                        .addGap(37, 37, 37)
                        .addComponent(ver)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(mUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaModificar)
                    .addComponent(ver_baja, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ver_alta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jLabel15.setBackground(new java.awt.Color(192, 182, 182));
        jLabel15.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(1, 1, 1));
        jLabel15.setText("*Nombre (s)");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mNombre.setBackground(new java.awt.Color(254, 254, 254));
        mNombre.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mNombre.setForeground(new java.awt.Color(1, 1, 1));
        mNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel22.setBackground(new java.awt.Color(192, 182, 182));
        jLabel22.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(1, 1, 1));
        jLabel22.setText("Apellido paterno");
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mPaterno.setBackground(new java.awt.Color(254, 254, 254));
        mPaterno.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mPaterno.setForeground(new java.awt.Color(1, 1, 1));
        mPaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel23.setBackground(new java.awt.Color(192, 182, 182));
        jLabel23.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(1, 1, 1));
        jLabel23.setText("Apellido materno");
        jLabel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mMaterno.setBackground(new java.awt.Color(254, 254, 254));
        mMaterno.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mMaterno.setForeground(new java.awt.Color(1, 1, 1));
        mMaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel25.setBackground(new java.awt.Color(192, 182, 182));
        jLabel25.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(1, 1, 1));
        jLabel25.setText("Estado");
        jLabel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setBackground(new java.awt.Color(192, 182, 182));
        jLabel26.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(1, 1, 1));
        jLabel26.setText("Ciudad/Municipio");
        jLabel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel27.setBackground(new java.awt.Color(192, 182, 182));
        jLabel27.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(1, 1, 1));
        jLabel27.setText("Colonia");
        jLabel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel28.setBackground(new java.awt.Color(192, 182, 182));
        jLabel28.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(1, 1, 1));
        jLabel28.setText("Calle");
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mCalle.setBackground(new java.awt.Color(254, 254, 254));
        mCalle.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mCalle.setForeground(new java.awt.Color(1, 1, 1));
        mCalle.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel29.setBackground(new java.awt.Color(192, 182, 182));
        jLabel29.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(1, 1, 1));
        jLabel29.setText("Número");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mNum.setBackground(new java.awt.Color(254, 254, 254));
        mNum.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mNum.setForeground(new java.awt.Color(1, 1, 1));
        mNum.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        mCP.setBackground(new java.awt.Color(254, 254, 254));
        mCP.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mCP.setForeground(new java.awt.Color(1, 1, 1));
        mCP.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel30.setBackground(new java.awt.Color(192, 182, 182));
        jLabel30.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(1, 1, 1));
        jLabel30.setText("Código postal");
        jLabel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mEstado.setBackground(new java.awt.Color(254, 254, 254));
        mEstado.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mEstado.setForeground(new java.awt.Color(1, 1, 1));
        mEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        mCiudad.setBackground(new java.awt.Color(254, 254, 254));
        mCiudad.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mCiudad.setForeground(new java.awt.Color(1, 1, 1));
        mCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        mColonia.setBackground(new java.awt.Color(254, 254, 254));
        mColonia.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mColonia.setForeground(new java.awt.Color(1, 1, 1));
        mColonia.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel14.setBackground(new java.awt.Color(192, 182, 182));
        jLabel14.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 1, 1));
        jLabel14.setText("Categoria");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mCategoria.setBackground(new java.awt.Color(254, 254, 254));
        mCategoria.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mCategoria.setForeground(new java.awt.Color(1, 1, 1));

        jLabel31.setBackground(new java.awt.Color(192, 182, 182));
        jLabel31.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(1, 1, 1));
        jLabel31.setText("Teléfono");
        jLabel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mTelefono.setBackground(new java.awt.Color(254, 254, 254));
        mTelefono.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mTelefono.setForeground(new java.awt.Color(1, 1, 1));
        mTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        mEmail.setBackground(new java.awt.Color(254, 254, 254));
        mEmail.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mEmail.setForeground(new java.awt.Color(1, 1, 1));
        mEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel32.setBackground(new java.awt.Color(192, 182, 182));
        jLabel32.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(1, 1, 1));
        jLabel32.setText("E-mail");
        jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setBackground(new java.awt.Color(192, 182, 182));
        jLabel24.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(1, 1, 1));
        jLabel24.setText("RFC");
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mRfc.setBackground(new java.awt.Color(254, 254, 254));
        mRfc.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mRfc.setForeground(new java.awt.Color(1, 1, 1));
        mRfc.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        mEstatus.setBackground(new java.awt.Color(254, 254, 254));
        mEstatus.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        mEstatus.setForeground(new java.awt.Color(1, 1, 1));
        mEstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BAJA", "ALTA" }));

        jLabel34.setBackground(new java.awt.Color(192, 182, 182));
        jLabel34.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(1, 1, 1));
        jLabel34.setText("Estatus");
        jLabel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificar.setIcon(new javax.swing.ImageIcon("/home/csr2000/Imágenes/iconos/png (3)/actualizar.png")); // NOI18N
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
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
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(mMaterno))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mPaterno)
                            .addComponent(mNombre)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mEstado))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mCiudad))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mColonia))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mCalle))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(mCP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mNum, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(mRfc, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(mTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mEmail, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(mCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(mColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(mCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(mCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(mCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(mTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(mEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(mRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(mEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mId))
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("MODIFICACIÓN", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        principal.usuario = false;
    }//GEN-LAST:event_formWindowClosing

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
    }//GEN-LAST:event_jPanel3MouseClicked

    private void agregarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarClienteMouseClicked
        String[] datos = new String[13];
        datos[0] = aNombre.getText();
        datos[1] = aPaterno.getText();
        datos[2] = aMaterno.getText();
        datos[3] = aRFC.getText();
        datos[4] = aColonia.getText();
        datos[5] = aCalle.getText();
        datos[6] = aNum.getText();
        datos[7] = aCiudad.getText();
        datos[8] = aEstado.getText();
        datos[9] = aCP.getText();
        datos[10] = String.valueOf(aCategoria.getSelectedIndex() + 1);
        datos[11] = aTelefono.getText();
        datos[12] = aMail.getText();
        cu.agregarInsert(datos);
    }//GEN-LAST:event_agregarClienteMouseClicked

    private void BorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarMouseClicked

        if (bUsuario.getItemCount() != 0) {
            int confirmado = JOptionPane.showConfirmDialog(this, "¡Seguro que deseas borrar a \n" + bUsuario.getSelectedItem().toString() + "?");

            if (JOptionPane.OK_OPTION == confirmado) {
                String[][] datos = cu.Select("select id_usuario,ape_pat from usuario where estatus = true order by ape_pat ", 2);
                if (datos != null) {
                    String sql = "update usuario set estatus = false where id_usuario = '" + datos[bUsuario.getSelectedIndex()][0] + "';";
                    cu.Delete(sql, "USUARIO", "USUARIO DADO DE BAJA");
                }
            }
            bUsuario.removeAllItems();
            String[][] datos = cu.Select("select nombre,ape_pat,ape_mat from usuario where estatus = true order by ape_pat;", 3);
            if (datos != null) {
                String nombre = "";
                for (int i = 0; i < datos.length; i++) {
                    nombre += datos[i][1] + " " + datos[i][2] + " " + datos[i][0];
                    bUsuario.addItem(nombre);
                    nombre = "";
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY USUARIOS PARA DAR DE BAJA");
        }


    }//GEN-LAST:event_BorrarMouseClicked

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
        String[] datos = new String[15];
        datos[0] = mId.getText();
        datos[1] = mNombre.getText();;
        datos[2] = mPaterno.getText();
        datos[3] = mMaterno.getText();
        datos[4] = mRfc.getText();
        datos[5] = mColonia.getText();
        datos[6] = mCalle.getText();
        datos[7] = mNum.getText();
        datos[8] = mCiudad.getText();
        datos[9] = mEstado.getText();
        datos[10] = mCP.getText();
        datos[12] = String.valueOf(mCategoria.getSelectedIndex() + 1);
        datos[13] = mTelefono.getText();;
        datos[14] = mEmail.getText();
        if (mEstatus.getSelectedIndex() == 0) {
            datos[11] = String.valueOf(false);
        } else {
            datos[11] = String.valueOf(true);
        }
        cu.agregarUpdate(datos);


    }//GEN-LAST:event_modificarMouseClicked

    private void etiquetaModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaModificarMouseClicked

    }//GEN-LAST:event_etiquetaModificarMouseClicked


    private void ver_bajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_bajaMouseClicked
        mUsuario.removeAllItems();
        String[][] datos = cu.Select("select nombre,ape_pat,ape_mat from usuario where estatus = false order by ape_pat;", 3);
        if (datos != null) {
            this.alta_baja = 0;
            String nombre = "";
            for (int i = 0; i < datos.length; i++) {
                nombre += datos[i][1] + " " + datos[i][2] + " " + datos[i][0];
                mUsuario.addItem(nombre);
                nombre = "";
            }
        }
    }//GEN-LAST:event_ver_bajaMouseClicked

    private void ver_altaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_altaMouseClicked
        mUsuario.removeAllItems();
        String[][] datos = cu.Select("select nombre,ape_pat,ape_mat from usuario where estatus = true order by ape_pat;", 3);
        if (datos != null) {
            this.alta_baja = 1;
            String nombre = "";
            for (int i = 0; i < datos.length; i++) {
                nombre += datos[i][1] + " " + datos[i][2] + " " + datos[i][0];
                mUsuario.addItem(nombre);
                nombre = "";
            }
        }
    }//GEN-LAST:event_ver_altaMouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        if (mUsuario.getItemCount() != 0) {
            String[][] datos;
            if (this.alta_baja == 0) {//si es cero es baja
                datos = cu.Select("select id_usuario,ape_pat from usuario where estatus = false order by ape_pat;", 2);
            } else {
                datos = cu.Select("select id_usuario,ape_pat from usuario where estatus = true order by ape_pat;", 2);
            }
            if (datos != null) {
                String id_usuario = datos[mUsuario.getSelectedIndex()][0];
                String sql = "select * from usuario where id_usuario = " + id_usuario + ";";
                datos = cu.Select(sql, 15);
                if (datos != null) {
                    mId.setText(datos[0][0]);
                    mNombre.setText(datos[0][1]);
                    mPaterno.setText(datos[0][2]);
                    mMaterno.setText(datos[0][3]);
                    mRfc.setText(datos[0][4]);
                    mColonia.setText(datos[0][5]);
                    mCalle.setText(datos[0][6]);
                    mNum.setText(datos[0][7]);
                    mCiudad.setText(datos[0][8]);
                    mEstado.setText(datos[0][9]);
                    mCP.setText(datos[0][10]);
                    mCategoria.setSelectedIndex(Integer.parseInt(datos[0][11]) - 1);
                    mTelefono.setText(datos[0][13]);
                    mEmail.setText(datos[0][14]);
                    if (datos[0][12].equals("t")) {
                        mEstatus.setSelectedIndex(1);
                    } else {
                        mEstatus.setSelectedIndex(0);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONA UN USUARIO");
        }


    }//GEN-LAST:event_verMouseClicked

    private void bActualizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bActualizaMouseClicked
        bUsuario.removeAllItems();
        String[][] datos = cu.Select("select nombre,ape_pat,ape_mat from usuario where estatus = true order by ape_pat;", 3);
        if (datos != null) {
            String nombre = "";
            for (int i = 0; i < datos.length; i++) {
                nombre += datos[i][1] + " " + datos[i][2] + " " + datos[i][0];
                bUsuario.addItem(nombre);
                nombre = "";
            }
        }
    }//GEN-LAST:event_bActualizaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Borrar;
    private javax.swing.JTextField aCP;
    private javax.swing.JTextField aCalle;
    private javax.swing.JComboBox aCategoria;
    private javax.swing.JTextField aCiudad;
    private javax.swing.JTextField aColonia;
    private javax.swing.JTextField aEstado;
    private javax.swing.JTextField aMail;
    private javax.swing.JTextField aMaterno;
    private javax.swing.JTextField aNombre;
    private javax.swing.JTextField aNum;
    private javax.swing.JTextField aPaterno;
    private javax.swing.JTextField aRFC;
    private javax.swing.JTextField aTelefono;
    private javax.swing.JLabel agregarCliente;
    private javax.swing.JLabel bActualiza;
    private javax.swing.JComboBox bUsuario;
    private javax.swing.JLabel etiquetaBaja;
    private javax.swing.JLabel etiquetaModificar;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mCP;
    private javax.swing.JTextField mCalle;
    private javax.swing.JComboBox mCategoria;
    private javax.swing.JTextField mCiudad;
    private javax.swing.JTextField mColonia;
    private javax.swing.JTextField mEmail;
    private javax.swing.JTextField mEstado;
    private javax.swing.JComboBox mEstatus;
    private javax.swing.JLabel mId;
    private javax.swing.JTextField mMaterno;
    private javax.swing.JTextField mNombre;
    private javax.swing.JTextField mNum;
    private javax.swing.JTextField mPaterno;
    private javax.swing.JTextField mRfc;
    private javax.swing.JTextField mTelefono;
    private javax.swing.JComboBox mUsuario;
    private javax.swing.JLabel modificar;
    private javax.swing.JPanel panelAltas;
    private javax.swing.JLabel ver;
    private javax.swing.JLabel ver_alta;
    private javax.swing.JLabel ver_baja;
    // End of variables declaration//GEN-END:variables
}
