/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hardware.store.system;
import java.sql.PreparedStatement;
import java.awt.Image;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;  
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Selling extends javax.swing.JFrame {

    Connection Con = null;
    PreparedStatement pst =null;
    ResultSet Rs =null;
    Statement St = null;
    
    public Selling() {
        initComponents();
        DisplayItems();
        ShowDate();
        
        try{
            String Query = "SELECT * FROM `itemstbl` WHERE 1";
           pst = Con.prepareStatement(Query);
            Rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)ItemsTable.getModel();
            tm.setRowCount(0);

            while(Rs.next())
        {
            Object o[] = {(Rs.getInt("ItId")),Rs.getString("ItName"),Rs.getInt("ItQty"),Rs.getInt("ItPrice")};
            tm.addRow(o);
        }

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }

    int SellerId;
    public Selling(String Sname,int SId)
    {
        initComponents();
        SNameLbl.setText(Sname);
        SellerId = SId;
        DisplayItems();
        ShowDate();
    }
   int BillId;
   Statement St1 =null;
   ResultSet Rs1 =null;
   private void CountBills()
    {
        try
        {
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(BID) from SellsTbl");
            Rs1.next();
            BillId = Rs1.getInt(1)+1;
            
        }catch(Exception Ex)
        {
            
        }
        
        
    }
   private void InsertBill()
    {
         try{
               CountBills();
              Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardwarestoresystem", "root" ,"");
               PreparedStatement Save = Con.prepareStatement("insert into SellsTbl Values(?,?,?,?,?)");
               Save.setInt(1, BillId);
               Save.setInt(2, SellerId);
                Save.setString(3, SNameLbl.getText());
                 Save.setString(4, TodayDateLbl.getText());
                  Save.setInt(5, GrdTotal);
                     

              
       
               int row = Save.executeUpdate();
               JOptionPane.showMessageDialog(this, "Bill Added");
               Con.close();
              // DisplaySeller();
              Clear();
           }catch(Exception Ex){
               JOptionPane.showMessageDialog(this, Ex);
           }
    }
     private void UpdateQty()
    {
        
           try{
              int newqty = AvailQty - Integer.valueOf(ItQtyTb.getText());
              String UpdateQuery = "Update ItemsTbl set ItQty=? where ItId=?";
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardwarestoresystem", "root" ,"");
               PreparedStatement Ps = Con.prepareStatement(UpdateQuery);
               Ps.setInt(1,newqty);
               Ps.setInt(2, Key);
             
                  
                    
                    
                   if(Ps.executeUpdate() == 1)
                   {
                       DisplayItems();
                       JOptionPane.showMessageDialog(this, "Item Added");
                      // Clear();
                   }
          } catch(Exception e)
          {
              JOptionPane.showMessageDialog(this, e);
          }
       }

   
    @SuppressWarnings("unchecked")
    
    private void DisplayItems()
 {
     try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardwarestoresystem", "root" ,"");
         St = Con.createStatement();
         Rs = St.executeQuery("SELECT ItId,ItName,ItQty,ItPrice FROM ItemsTbl");
         ItemsTable.setModel(DbUtils.resultSetToTableModel(Rs));
     }catch(Exception e)
     {
         
     }
     
 }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TotalLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ItNameTb = new javax.swing.JTextField();
        ItPriceTb = new javax.swing.JTextField();
        ItQtyTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillText = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TodayDateLbl = new javax.swing.JLabel();
        SNameLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hardware/store/system/icons8-tools-100.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("HSTORE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hardware/store/system/logout.png"))); // NOI18N
        jLabel6.setText("LOGOUT");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(37, 37, 37))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        TotalLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TotalLbl.setForeground(new java.awt.Color(51, 51, 51));
        TotalLbl.setText("ITEMS STOCKS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("NAME:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("PRICE:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("QUANTITY:");

        ItNameTb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItPriceTb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItQtyTb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItemsTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ItemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemsTable);

        AddBtn.setBackground(new java.awt.Color(255, 102, 0));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD TO BILL");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        PrintBtn.setBackground(new java.awt.Color(255, 102, 0));
        PrintBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrintBtn.setText("PRINT");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(255, 102, 0));
        ClearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hardware/store/system/reset.png"))); // NOI18N
        ClearBtn.setText("CLEAR");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        BillText.setColumns(20);
        BillText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BillText.setRows(5);
        jScrollPane2.setViewportView(BillText);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("BILLING");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("BILL");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("ITEMS STOCK");

        TodayDateLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TodayDateLbl.setForeground(new java.awt.Color(51, 51, 51));
        TodayDateLbl.setText("Date");

        SNameLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SNameLbl.setForeground(new java.awt.Color(255, 255, 102));
        SNameLbl.setText("Sname");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(ItPriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItQtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(237, 237, 237))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(TotalLbl)
                                .addGap(160, 160, 160))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SNameLbl)
                .addGap(345, 345, 345)
                .addComponent(TodayDateLbl)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TodayDateLbl)
                    .addComponent(SNameLbl))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItPriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItQtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(TotalLbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int Key = 0;
    int AvailQty;
    int i = 0;
    int GrdTotal = 0;
   
    private void ItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)ItemsTable.getModel();
        int MyIndex = ItemsTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        ItNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        AvailQty = Integer.valueOf(model.getValueAt(MyIndex, 2).toString());
        ItPriceTb.setText(model.getValueAt(MyIndex, 3).toString());
    }//GEN-LAST:event_ItemsTableMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
       if(ItNameTb.getText().isEmpty() || ItQtyTb.getText().isEmpty() )
    {
        JOptionPane.showMessageDialog(this, "Missing Information");
    }else if(AvailQty < Integer.valueOf(ItQtyTb.getText()))
    {
         JOptionPane.showMessageDialog(this, "Not Enough In Stock");
    }else{
       i++;
       
       GrdTotal = GrdTotal + (Integer.valueOf(ItPriceTb.getText()) * Integer.valueOf(ItQtyTb.getText()));
    }
       if(i == 1)
       {
           BillText.setText(BillText.getText()+"              **********************Hardware Shop************************* \n "
              +" \t ID        PRODUCT         QTY           PRICE            TOTAL\n\t"
                   +""+i+"          "+ItNameTb.getText()+"                   "+ItQtyTb.getText()+"               "+ItPriceTb.getText()+"                "+Integer.valueOf(ItQtyTb.getText())*Integer.valueOf(ItPriceTb.getText())+"\n\t");
       }else
       {
           BillText.setText(""+BillText.getText()+i+"           "+ItNameTb.getText()+"                   "+ItQtyTb.getText()+"               "+ItPriceTb.getText()+"                "+Integer.valueOf(ItQtyTb.getText())*Integer.valueOf(ItPriceTb.getText())+"\n\t");
       }
       TotalLbl.setText("TOTAL SRP: " +GrdTotal);
      UpdateQty();
    }//GEN-LAST:event_AddBtnMouseClicked
   private void ShowDate()
   {
        Date d = new Date(); 
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        TodayDateLbl.setText(s.format(d));
   }
    private void Clear()
   {
         BillText.setText("");
         ItNameTb.setText("");
         ItQtyTb.setText("");
         i = 0;
         ItPriceTb.setText("");
         TotalLbl.setText("");
   }
    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
       Clear();    
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
         try
     {
         BillText.print();
         InsertBill();
     }catch(Exception e)
     {
        JOptionPane.showMessageDialog(this, e); 
     }
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         Login log = new Login();
       log.setVisible(true);
       log.pack();
       log.setLocationRelativeTo(null);
       log.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextArea BillText;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTextField ItNameTb;
    private javax.swing.JTextField ItPriceTb;
    private javax.swing.JTextField ItQtyTb;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JLabel SNameLbl;
    private javax.swing.JLabel TodayDateLbl;
    private javax.swing.JLabel TotalLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
