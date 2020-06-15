
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class resturant extends javax.swing.JFrame {

int ChickenNum , MeatNum , WaterNum , AyranNum ;
double ChickenPrice ,MeatPrice , WaterPrice , AyranPrice;
final double CHICKEN_COST = 4.0 , MEAT_COST = 4.0 , WATER_COST = 1.0 , AYRAN_COST = 2.0 ;
double SUBTUTAL , VAT , TUTAL;
int faturano ;
PrintWriter output ;  
    
    
    
    public resturant() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        chickencounter = new javax.swing.JSpinner();
        chickensogan = new javax.swing.JCheckBox();
        chickenpricelabel = new javax.swing.JLabel();
        EtSecimi = new javax.swing.JLabel();
        meatcounter = new javax.swing.JSpinner();
        meatsogan = new javax.swing.JCheckBox();
        meatpricelabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ayrancounter = new javax.swing.JSpinner();
        ayranpricelabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        watercounter = new javax.swing.JSpinner();
        waterpricelabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        subtutallabel = new javax.swing.JLabel();
        vatlabel = new javax.swing.JLabel();
        tutallabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        calculetbutton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        savebutt = new javax.swing.JButton();
        faturanolabel = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Resturan Yönetim Programı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Eng.Muh. Nur");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yiyecekler", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tavuk Döner");

        chickencounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        chickencounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickencounterStateChanged(evt);
            }
        });

        chickensogan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chickensogan.setText("Soğan");
        chickensogan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chickensogan.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        chickensogan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickensoganActionPerformed(evt);
            }
        });

        chickenpricelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chickenpricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chickenpricelabel.setText("0.0 tl");

        EtSecimi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EtSecimi.setText("Et Döner");

        meatcounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        meatcounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatcounterStateChanged(evt);
            }
        });

        meatsogan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        meatsogan.setText("Soğan");
        meatsogan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        meatsogan.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        meatsogan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatsoganActionPerformed(evt);
            }
        });

        meatpricelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        meatpricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        meatpricelabel.setText("0.0 tl");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EtSecimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meatcounter, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chickencounter, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(meatsogan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(meatpricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chickensogan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chickenpricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(chickencounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chickensogan)
                    .addComponent(chickenpricelabel))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtSecimi)
                    .addComponent(meatcounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meatsogan)
                    .addComponent(meatpricelabel))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İçecekler", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Ayran");

        ayrancounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        ayrancounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ayrancounterStateChanged(evt);
            }
        });

        ayranpricelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ayranpricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ayranpricelabel.setText("0.0 tl");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Su");

        watercounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        watercounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                watercounterStateChanged(evt);
            }
        });

        waterpricelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        waterpricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        waterpricelabel.setText("0.0 tl");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ayrancounter, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(watercounter))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ayranpricelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(waterpricelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ayranpricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ayrancounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waterpricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(watercounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hesap", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        subtutallabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subtutallabel.setText("Toplam : 0.0 tl");

        vatlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vatlabel.setText("Vergi     : 0.0 tl");

        tutallabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tutallabel.setText("Tutar : 0.0 tl");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tutallabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vatlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(subtutallabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtutallabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vatlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tutallabel)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hesap", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        calculetbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calculetbutton.setText("Hesap");
        calculetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculetbuttonActionPerformed(evt);
            }
        });

        savebutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        savebutton.setText("Fatura Kaydet");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        savebutt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        savebutt.setText("Yeni Fatura");
        savebutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculetbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savebutt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calculetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(savebutt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        faturanolabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        faturanolabel.setText("Fatura no : 0.0");

        exit.setText("Çıkış");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(faturanolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(faturanolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculetbuttonActionPerformed
        
    SUBTUTAL = ChickenPrice + MeatPrice + WaterPrice + AyranPrice ;    
    subtutallabel.setText("tutar"+SUBTUTAL+"tl");
    
    VAT = SUBTUTAL * 0.05 ;
    VAT = VAT * 100 ;
    VAT = (double) ((int) VAT) ;
    VAT = VAT / 100 ; 
    vatlabel.setText("vergi"+VAT+"tl");
    
    TUTAL = SUBTUTAL + VAT ;
    tutallabel.setText("tutar"+TUTAL+"tl");
        
    }//GEN-LAST:event_calculetbuttonActionPerformed

    private void meatsoganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatsoganActionPerformed
        
               if (meatsogan.isSelected()){
           MeatPrice += MeatNum ;
       }
       else{
       MeatPrice -= MeatNum ;
       }    
      
       meatpricelabel.setText(MeatPrice +" tl ");
        
        
    }//GEN-LAST:event_meatsoganActionPerformed

    private void chickensoganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickensoganActionPerformed
       
       if (chickensogan.isSelected()){
           ChickenPrice += ChickenNum ;
       }
       else{
       ChickenPrice -= ChickenNum ;
       }    
      
       chickenpricelabel.setText(ChickenPrice +" tl ");   
        
    }//GEN-LAST:event_chickensoganActionPerformed

    private void chickencounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickencounterStateChanged
        
        ChickenNum =(Integer)chickencounter.getValue();
        ChickenPrice = CHICKEN_COST * ChickenNum ;
        
        chickenpricelabel.setText(ChickenPrice +" tl ");
        
    }//GEN-LAST:event_chickencounterStateChanged

    private void meatcounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatcounterStateChanged
        
        MeatNum =(Integer)meatcounter.getValue();
        MeatPrice = MEAT_COST * MeatNum ;
        
        meatpricelabel.setText(MeatPrice +" tl ");
        
    }//GEN-LAST:event_meatcounterStateChanged

    private void ayrancounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ayrancounterStateChanged
        
        AyranNum =(Integer)ayrancounter.getValue();
        AyranPrice = AYRAN_COST * AyranNum ;
        
        ayranpricelabel.setText(AyranPrice +" tl ");
        
    }//GEN-LAST:event_ayrancounterStateChanged

    private void watercounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_watercounterStateChanged
        
        WaterNum =(Integer)watercounter.getValue();
        WaterPrice = WATER_COST * WaterNum ;
        
        waterpricelabel.setText(WaterPrice +" tl ");
        
    }//GEN-LAST:event_watercounterStateChanged

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed

    try {
        if(TUTAL !=0 ){
          output =new PrintWriter(" bill no "+faturano+".txt");
          output.println(" Fatura No "+faturano);
          output.println("------------");
          
         if(ChickenNum !=0){ 
             
           output.print(ChickenNum+" Tavuuk Döner ");          
             if(chickensogan.isSelected()){
              output.println(" Soğanlı ");
             }
             output.println(ChickenPrice + " tl ");
         }
             
             
           if(MeatNum !=0){
               
           output.print(MeatNum+" Et Döner ");
             if(meatsogan.isSelected()){
              output.println(" Soğanlı ");
             }
             output.println(MeatPrice + " tl ");
          }
        
          
                      if(WaterNum !=0){
               
           output.print(WaterNum+" Su ");
           output.println(WaterPrice + " tl ");
          }
           
         
           if(AyranNum !=0){
               
           output.print(AyranNum+" Ayran ");
           output.println(AyranPrice + " tl ");
           }
           
           output.println("---------");
           output.println(" Toplam "+SUBTUTAL+" tl ");
           output.println(" Vergi "+VAT+" tl ");
           output.println(" Tutar "+TUTAL+ "tl ");
           output.println("Teşekkürler");
           
        }
        output.close();
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(resturant.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_savebuttonActionPerformed

    private void savebuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttActionPerformed
        
       if(TUTAL !=0){
       
       
       chickencounter.setValue(0);
       meatcounter.setValue(0);
       watercounter.setValue(0);
       ayrancounter.setValue(0);
       chickencounter.setValue(0);
       chickensogan.setSelected(false);
       meatsogan.setSelected(false);
       
       subtutallabel.setText("Toplam: 0.0 tl");
       vatlabel.setText("vergi: 0.0 tl");
       tutallabel.setText("Tutar: 0.0 tl");
       
       SUBTUTAL = 0;
       VAT = 0;
       TUTAL = 0;
       
       faturano++;
       faturanolabel.setText(" FATURA NO: " +faturano);
       } 
        
        
        
    }//GEN-LAST:event_savebuttActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resturant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtSecimi;
    private javax.swing.JSpinner ayrancounter;
    private javax.swing.JLabel ayranpricelabel;
    private javax.swing.JButton calculetbutton;
    private javax.swing.JSpinner chickencounter;
    private javax.swing.JLabel chickenpricelabel;
    private javax.swing.JCheckBox chickensogan;
    private javax.swing.JButton exit;
    private javax.swing.JLabel faturanolabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner meatcounter;
    private javax.swing.JLabel meatpricelabel;
    private javax.swing.JCheckBox meatsogan;
    private javax.swing.JButton savebutt;
    private javax.swing.JButton savebutton;
    private javax.swing.JLabel subtutallabel;
    private javax.swing.JLabel tutallabel;
    private javax.swing.JLabel vatlabel;
    private javax.swing.JSpinner watercounter;
    private javax.swing.JLabel waterpricelabel;
    // End of variables declaration//GEN-END:variables
}
