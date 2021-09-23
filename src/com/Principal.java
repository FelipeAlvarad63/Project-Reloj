
public class Principal extends javax.swing.JFrame {
	//VARIABLES
    private javax.swing.JPanel barra;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnconfig;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> comboampm;
    private javax.swing.JComboBox<String> combohora;
    private javax.swing.JComboBox<String> combomin;
    private javax.swing.JLabel labelampm;
    private javax.swing.JLabel labelfondo;
    public static javax.swing.JLabel labelhora;
    public static javax.swing.JLabel labelmin;
    private javax.swing.JLabel labelpuntos;
    // End of variables declaration  

    int xMouse, yMouse;
    public static int hh = 2;
    public static int mm = 9;
    public static int ss = 0;
	// End of variables declaration 

  public Principal() {

	    bg = new javax.swing.JPanel();
        labelhora = new javax.swing.JLabel();
        labelpuntos = new javax.swing.JLabel();
        labelmin = new javax.swing.JLabel();
        labelampm = new javax.swing.JLabel();
        btnconfig = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        comboampm = new javax.swing.JComboBox<>();
        combomin = new javax.swing.JComboBox<>();
        combohora = new javax.swing.JComboBox<>();
        btnclose = new javax.swing.JButton();
        labelfondo = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 590));


        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setMaximumSize(new java.awt.Dimension(900, 590));
        bg.setPreferredSize(new java.awt.Dimension(900, 590));
        bg.setLayout(null);

        labelhora.setFont(new java.awt.Font("DS-Digital", 0, 200)); // NOI18N
        labelhora.setForeground(new java.awt.Color(255, 255, 255));

        bg.add(labelhora);
        labelhora.setBounds(60, 70, 200, 190);

        labelpuntos.setFont(new java.awt.Font("DS-Digital", 0, 200)); // NOI18N
        labelpuntos.setForeground(new java.awt.Color(255, 255, 255));
        labelpuntos.setText(":");
        bg.add(labelpuntos);
        labelpuntos.setBounds(260, 90, 44, 140);

        labelmin.setFont(new java.awt.Font("DS-Digital", 0, 200)); // NOI18N
        labelmin.setForeground(new java.awt.Color(255, 255, 255));
        
        bg.add(labelmin);
        labelmin.setBounds(300, 70, 200, 190);

        labelampm.setBackground(new java.awt.Color(255, 255, 255));
        labelampm.setFont(new java.awt.Font("DS-Digital", 0, 50)); // NOI18N
        labelampm.setForeground(new java.awt.Color(255, 255, 255));
        labelampm.setText("PM");
        bg.add(labelampm);
        labelampm.setBounds(510, 100, 50, 51);

        btnconfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/btn1.png"))); // NOI18N
        btnconfig.setToolTipText("");
        btnconfig.setBorder(null);
        btnconfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconfig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnconfig.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("images/btn1-pressed.png"))); // NOI18N
	    btnconfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfigActionPerformed(evt);
            }
        });
        bg.add(btnconfig);
        btnconfig.setBounds(30, 523, 50, 50);

        btnsave.setBackground(new java.awt.Color(0, 0, 0));
        btnsave.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/btnsave1.png"))); // NOI18N
        btnsave.setText("SAVE");
        btnsave.setBorder(null);
        btnsave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("images/btnsave1-pressed.png"))); // NOI18N
	    btnsave.setVisible(false);
	    btnsave.setEnabled(false);
	    btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        bg.add(btnsave);
        btnsave.setBounds(120, 533, 80, 30);

        comboampm.setBackground(new java.awt.Color(0, 0, 0));
        comboampm.setForeground(new java.awt.Color(255, 255, 255));
        comboampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        comboampm.setBorder(null);
        comboampm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	    comboampm.setVisible(false);
	    comboampm.setEnabled(false);
        bg.add(comboampm);
        comboampm.setBounds(140, 450, 50, 40);

        combomin.setBackground(new java.awt.Color(0, 0, 0));
        combomin.setForeground(new java.awt.Color(255, 255, 255));
          for(int i = 0; i <= 59; i++){
              combomin.addItem(String.valueOf(i));
          }
        combomin.setBorder(null);
        combomin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	combomin.setVisible(false);
	combomin.setEnabled(false);
        bg.add(combomin);
        combomin.setBounds(86, 450, 50, 40);

        combohora.setBackground(new java.awt.Color(0, 0, 0));
        combohora.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        combohora.setForeground(new java.awt.Color(255, 255, 255));
        combohora.setMaximumRowCount(5);
	  for(int i = 0; i <= 12; i++){
              combohora.addItem(String.valueOf(i));
          }
        combohora.setBorder(null);
        combohora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	combohora.setVisible(false);
	combohora.setEnabled(false);
        bg.add(combohora);
        combohora.setBounds(30, 450, 50, 40);

        btnclose.setBackground(new java.awt.Color(0, 0, 0));
        btnclose.setForeground(new java.awt.Color(153, 153, 153));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/btnclose.png"))); // NOI18N
        btnclose.setBorder(null);
        btnclose.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("images/btnclose1.png"))); // NOI18N
        btnclose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("images/btnclose1.png"))); // NOI18N
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
        });

        bg.add(btnclose);
        btnclose.setBounds(850, 0, 50, 40);

        labelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/INTERSTELLAR.png"))); // NOI18N
        labelfondo.setText("jLabel1");
        bg.add(labelfondo);
        labelfondo.setBounds(502, 0, 400, 590);

        barra.setBackground(new java.awt.Color(0, 0, 0));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });
        barra.setLayout(null);
        bg.add(barra);
        barra.setBounds(0, 0, 900, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        setLocationRelativeTo(null);
  }

    private void barraMousePressed(java.awt.event.MouseEvent evt) {                                   
        xMouse = evt.getX();
        yMouse = evt.getY();
    }                                  

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {                                   
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }                                  

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {                                      
       System.exit(0);
    }
    
    //Eventos para activar los botones
    private void btnconfigActionPerformed(java.awt.event.ActionEvent evt) {                                          
       if(evt.getSource() == btnconfig){
           if(btnsave.isEnabled() & combohora.isEnabled() & combomin.isEnabled() & comboampm.isEnabled()){
               btnsave.setEnabled(false);
	       combohora.setEnabled(false);
		combomin.setEnabled(false);
		comboampm.setEnabled(false);
           }else if(!btnsave.isEnabled() & !combohora.isEnabled() & !combomin.isEnabled() & !comboampm.isEnabled()){
               btnsave.setEnabled(true);
	       combohora.setEnabled(true);
		combomin.setEnabled(true);
		comboampm.setEnabled(true);
           }
	   if(btnsave.isVisible() & combohora.isVisible() & combomin.isVisible() & comboampm.isVisible()){
		btnsave.setVisible(false);
		combohora.setVisible(false);
		combomin.setVisible(false);
		comboampm.setVisible(false);
           }else if(!btnsave.isVisible() & !combohora.isVisible() & !combomin.isVisible() & !comboampm.isVisible()){
		btnsave.setVisible(true);
		combohora.setVisible(true);
		combomin.setVisible(true);
		comboampm.setVisible(true);
	   }
       }
    }

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
	if(evt.getSource() == btnsave){
            String hora = combohora.getSelectedItem().toString();
            String minutos = combomin.getSelectedItem().toString();
            String ampm = comboampm.getSelectedItem().toString();
            
	    hh = Integer.parseInt(hora);
	    mm = Integer.parseInt(minutos);
            labelampm.setText(ampm);
	
	  if(btnsave.isEnabled() & combohora.isEnabled() & combomin.isEnabled() & comboampm.isEnabled()){
               btnsave.setEnabled(false);
	       combohora.setEnabled(false);
	       combomin.setEnabled(false);
	       comboampm.setEnabled(false);
	  }
	  if(btnsave.isVisible() & combohora.isVisible() & combomin.isVisible() & comboampm.isVisible()){
		btnsave.setVisible(false);
		combohora.setVisible(false);
		combomin.setVisible(false);
		comboampm.setVisible(false);
          }

        }
    }

  public static void main(String args[])throws InterruptedException {
        new Principal().setVisible(true);
	
	//funcionalidad del reloj
    	while(true){
		//mostrar
		if(hh < 10){
		  labelhora.setText("0"+ hh);
		}else{
		  labelhora.setText(String.valueOf(hh));
		 }
		if(mm < 10){
		  labelmin.setText("0"+ mm);
		}else{	
		  labelmin.setText(String.valueOf(mm));
		 }
		//aumentar
		ss++;
	
		//comprobar	
		if(ss == 60){
	  	  ss = 0;
	  	  mm++;
		}
	 	if(mm == 60){
	   	  mm = 0;
	   	  hh++;
	 	}
	   	if(hh == 13){
	     	  hh = 1;
	   	}
		Thread.sleep(1000);
    	}
           
    }
}