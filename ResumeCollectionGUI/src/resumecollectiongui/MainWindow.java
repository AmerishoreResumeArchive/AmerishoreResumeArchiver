package resumecollectiongui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Michael.Wiser
 */
public class MainWindow extends javax.swing.JFrame {
    //private final TableCellRenderer renderer;
   public ArrayList<Applicant> candid = new ArrayList<>();
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        //ImageIcon icon=new ImageIcon("ameriii.png");
        this.setIconImage(new ImageIcon(getClass().getResource("ameriicon.jpg")).getImage()); 
        //setIconImage(icon);
        Applicant one = new Applicant("John Smith", "UWT", "Computer Science", 5, "Test", "Test", true, 5, 4);
        Applicant two = new Applicant("Roy Smith", "UWB", "Engineering", 6, "Test2", "Test2", true, 5, 4);
        Applicant one2 = new Applicant("Todd Smith", "Bellevue", "Business", 7, "Test3", "Test3", true, 5, 4);
        Applicant two3 = new Applicant("Joe Smith", "UWS", "MIS", 8, "Test4", "Test4", true, 5, 4);
        
    
        candid.add(one);
        candid.add(two);
        candid.add(one2);
        candid.add(two3);
     
         
         
    }
    
    
    public void loadall(){
        int i = 0;
         for(Applicant temp : candid){
            String tName = temp.getName();
            String tSchool = temp.getSchool();
            String tDegree = temp.getDegree();
            int tCat = temp.getCategory();
            
            
            for(int j=0; j<4; j++){
                if(j==0){//name
                    allapplicantjTable.setValueAt(tName, i, j);
                }
                else if(j==1){ //school
                    allapplicantjTable.setValueAt(tSchool, i, j);
                }
                else if(j==2){ //degree
                    allapplicantjTable.setValueAt(tDegree, i, j);
                }
                else{ //category
                    allapplicantjTable.setValueAt(tCat, i, j);
                }
                
                
                
            }
            i++;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        addnewjButton = new javax.swing.JButton();
        removejButton = new javax.swing.JButton();
        queriesjTabbedPane = new javax.swing.JTabbedPane();
        alljScrollPane = new javax.swing.JScrollPane();
        allapplicantjTable = new javax.swing.JTable();
        rankjScrollPane = new javax.swing.JScrollPane();
        rankapplicantsjTable = new javax.swing.JTable();
        openjButton = new javax.swing.JButton();
        refreshjButton = new javax.swing.JButton();
        logojLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addnewjButton.setText("Add New Applicant");
        addnewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addnewjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 160, -1));

        removejButton.setText("Remove Applicant");
        getContentPane().add(removejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 160, -1));

        allapplicantjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "School", "Degree", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        allapplicantjTable.getTableHeader().setReorderingAllowed(false);
        alljScrollPane.setViewportView(allapplicantjTable);
        allapplicantjTable.getColumnModel().getColumn(2).setResizable(false);

        queriesjTabbedPane.addTab("All Applicants", alljScrollPane);

        rankapplicantsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "School", "Degree", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        rankjScrollPane.setViewportView(rankapplicantsjTable);

        queriesjTabbedPane.addTab("Applicants by Rank", rankjScrollPane);

        getContentPane().add(queriesjTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 591, 324));

        openjButton.setText("Open Applicant Record");
        getContentPane().add(openjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 160, -1));

        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(refreshjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 160, -1));

        logojLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resumecollectiongui/ameriii.png"))); // NOI18N
        getContentPane().add(logojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 460, 90));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
        loadall();
    }//GEN-LAST:event_refreshjButtonActionPerformed

    private void addnewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewjButtonActionPerformed
        // TODO add your handling code here:
         new AddApplicant().setVisible(true);
    }//GEN-LAST:event_addnewjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnewjButton;
    private javax.swing.JTable allapplicantjTable;
    private javax.swing.JScrollPane alljScrollPane;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel logojLabel;
    private javax.swing.JButton openjButton;
    private javax.swing.JTabbedPane queriesjTabbedPane;
    private javax.swing.JTable rankapplicantsjTable;
    private javax.swing.JScrollPane rankjScrollPane;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JButton removejButton;
    // End of variables declaration//GEN-END:variables
}
