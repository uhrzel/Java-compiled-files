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
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;  
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



public class Items extends javax.swing.JFrame {

    Connection Con = null;
    PreparedStatement pst =null;
    ResultSet Rs =null;
    Statement St = null;
    
    public Items() {
        initComponents();
        DisplayItems();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        it = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ItNameTb = new javax.swing.JTextField();
        ItQtyTb = new javax.swing.JTextField();
        ItPriceTb = new javax.swing.JTextField();
        ItCatCb = new javax.swing.JComboBox<>();
        ItPictureLbl = new javax.swing.JLabel();
        BrowseBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hardware/store/system/icons8-tools-100.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("HSTORE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("SELLER");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("DASHBOARD");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

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
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(166, 166, 166)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(41, 41, 41))
        );

        it.setBackground(new java.awt.Color(0, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("MANAGE ITEMS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("NAME:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("QUANTITY:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("PRICE:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("CATEGORIES:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("PHOTO");

        ItNameTb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItQtyTb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItPriceTb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItCatCb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ItCatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLUMBING", "ELECTRICAL" }));

        ItPictureLbl.setBackground(new java.awt.Color(255, 255, 255));
        ItPictureLbl.setOpaque(true);

        BrowseBtn.setBackground(new java.awt.Color(255, 102, 0));
        BrowseBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BrowseBtn.setForeground(new java.awt.Color(255, 255, 255));
        BrowseBtn.setText("BROWSE");
        BrowseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseBtnMouseClicked(evt);
            }
        });

        ItemsTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(255, 102, 0));
        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("UPDATE");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 102, 0));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("ITEM STOCKS");

        javax.swing.GroupLayout itLayout = new javax.swing.GroupLayout(it);
        it.setLayout(itLayout);
        itLayout.setHorizontalGroup(
            itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itLayout.createSequentialGroup()
                .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(itLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(itLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(ItNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItQtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItPriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItCatCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itLayout.createSequentialGroup()
                        .addComponent(ItPictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(itLayout.createSequentialGroup()
                .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itLayout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel13))
                    .addGroup(itLayout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel7)))
                .addContainerGap(403, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        itLayout.setVerticalGroup(
            itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(itLayout.createSequentialGroup()
                        .addComponent(ItPictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(itLayout.createSequentialGroup()
                        .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ItNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ItQtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ItPriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ItCatCb))
                        .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(itLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(itLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(itLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(it, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(it, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void DisplayItems()
 {
     try{
         Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardwarestoresystem", "root" ,"");
         St = Con.createStatement();
         Rs = St.executeQuery("SELECT * FROM ItemsTbl WHERE 1");
         ItemsTable.setModel(DbUtils.resultSetToTableModel(Rs));
     }catch(Exception e)
     {
         
     }
     
 }
  
  private void Clear()
 {
     ItNameTb.setText("");
     ItQtyTb.setText("");
     ItPriceTb.setText("");
     ItPictureLbl.setIcon(null);
 }
  
    int ItemsId;
   Statement St1 =null;
   ResultSet Rs1 =null;
   
    private void CountItems()
    {
        try
        {
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(ItID) from ItemsTbl");
            Rs1.next();
            ItemsId = Rs1.getInt(1)+1;
            
        }catch(Exception Ex)
        {
            
        }
    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(ItNameTb.getText().isEmpty() || ItQtyTb.getText().isEmpty() || ItPriceTb.getText().isEmpty()|| ItCatCb.getSelectedIndex() == -1)
        {
             JOptionPane.showMessageDialog(this, "Missing Information");
        }else
        {
            try
            {
                 CountItems();
                 Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardwarestoresystem", "root" ,"");
                 PreparedStatement Save = Con.prepareStatement("insert Into ItemsTbl Values(?,?,?,?,?,?)");
                 Save.setInt(1, ItemsId);
                 Save.setString(2, ItNameTb.getText());
                 Save.setInt(3, Integer.valueOf(ItQtyTb.getText()));
                 Save.setInt(4, Integer.valueOf(ItPriceTb.getText()));
                 Save.setString(5, ItCatCb.getSelectedItem().toString());
                 InputStream img = new FileInputStream(imgPath);
                 Save.setBlob(6, img);
                 int row = Save.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Items Added");
                 Con.close();
                  DisplayItems();
                  Clear();
            }
            catch(Exception Ex)
            {
                  JOptionPane.showMessageDialog(this, Ex);
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked
    public ImageIcon ResizePhoto (String ImagePath, byte[] pic)
   {
       ImageIcon MyImage = null;
       if(ImagePath != null)
       {
           MyImage = new ImageIcon(ImagePath);
           
       }else{
           MyImage = new ImageIcon(pic);
       }
       Image img = MyImage.getImage();
       Image newImg = img.getScaledInstance(ItPictureLbl.getWidth(), ItPictureLbl.getHeight(),Image.SCALE_SMOOTH);
       ImageIcon image = new ImageIcon(newImg);
        return image;
       
   }
    
     String imgPath;
    private void BrowseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseBtnMouseClicked
        JFileChooser file = new JFileChooser();
      file.setCurrentDirectory(new File(System.getProperty("user.home")));
      FileNameExtensionFilter filter =new FileNameExtensionFilter("*Images","jpg","gif","png");
      file.addChoosableFileFilter(filter);
      int result =file.showSaveDialog(file);
      if(result == JFileChooser.APPROVE_OPTION)
      {
          File selectedFile = file.getSelectedFile();
          String path = selectedFile.getAbsolutePath();
          ItPictureLbl.setIcon(ResizePhoto(path,null));
          imgPath = path;
          
      }else if(result == JFileChooser.CANCEL_OPTION)
          
      {
          JOptionPane.showMessageDialog(this,"No File Selected");
      }
    }//GEN-LAST:event_BrowseBtnMouseClicked
     private void GetItemPhoto()
   {
       String Query = "SELECT ItPhoto FROM ItemsTbl where Itid ="+Key;
       Statement St;
       ResultSet Rs;
       try{
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardwarestoresystem", "root" ,"");
           St = Con.createStatement();
           Rs = St.executeQuery(Query);
           if(Rs.next())
           {
              ItPictureLbl.setIcon(ResizePhoto(null, Rs.getBytes("ItPhoto")));
           }
       }catch(Exception Ex)
       {
           
       }
   }
    int Key = 0;
    private void ItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsTableMouseClicked
      DefaultTableModel model = (DefaultTableModel)ItemsTable.getModel();
      int MyIndex = ItemsTable.getSelectedRow();
      Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
      ItNameTb.setText(model.getValueAt(MyIndex, 1).toString());
      ItQtyTb.setText(model.getValueAt(MyIndex, 2).toString());
      ItPriceTb.setText(model.getValueAt(MyIndex, 3).toString());
      ItCatCb.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
      GetItemPhoto();
    }//GEN-LAST:event_ItemsTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
         if(Key == 0)
       {
           JOptionPane.showMessageDialog(this, "Select The Item");
       }else
       {
           try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardwarestoresystem", "root" ,"");
                String Query ="DELETE FROM itemstbl WHERE `itemstbl`.`ItId`="+Key;
                Statement Del = Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Item Deleted");
                DisplayItems();
                Clear();
                
           }catch(Exception Ex)
           {
              
           }
           
       }
      
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
      if(imgPath != null)
       {
          try{
                   InputStream img = new FileInputStream(imgPath);
                   String UpdateQuery = "UPDATE itemsTbl SET ItName=?, ItQty=?, ItPrice=?, ItCat=?, ItPhoto=? WHERE ItId=?";
                   Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardwarestoresystem", "root" ,"");
                   PreparedStatement Ps = Con.prepareStatement(UpdateQuery);
                   Ps.setString(1, ItNameTb.getText());
                   Ps.setInt(2, Integer.valueOf(ItQtyTb.getText()));
                   Ps.setInt(3, Integer.valueOf(ItPriceTb.getText()));
                   Ps.setString(4, ItCatCb.getSelectedItem().toString());
                   Ps.setBlob(5, img);
                   Ps.setInt(6, Key);
                   if(Ps.executeUpdate() == 1)
                   {
                     
                       JOptionPane.showMessageDialog(this, "Items Updated");
                         DisplayItems();
                   }else{
                       JOptionPane.showMessageDialog(this, "Missing Updated");
                   }
          } catch(Exception e)
          {
              JOptionPane.showMessageDialog(this, e);
          }
       }else
       {
            JOptionPane.showMessageDialog(this, "No Photo Selected");
       }
       imgPath = null;
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       Sellers log = new Sellers();
       log.setVisible(true);
       log.pack();
       log.setLocationRelativeTo(null);
       log.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       Dashboard dash = new Dashboard();
       dash.setVisible(true);
       dash.pack();
       dash.setLocationRelativeTo(null);
       dash.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Login log = new Login();
       log.setVisible(true);
       log.pack();
       log.setLocationRelativeTo(null);
       log.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

   
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BrowseBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> ItCatCb;
    private javax.swing.JTextField ItNameTb;
    private javax.swing.JLabel ItPictureLbl;
    private javax.swing.JTextField ItPriceTb;
    private javax.swing.JTextField ItQtyTb;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JPanel it;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
