/*
 * UI_Search_Entry JFrame class
 * Used to search for entries
 */
package phonebook_2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author s6040531
 */
public class UI_Search_Entry extends javax.swing.JFrame 
{

    // ArrayList that contains a collection of all PB_record objects
    private static ArrayList<PB_record> entry_list;
    
    // ArrayList that contains a collection of search result PB_record objects
    private static ArrayList<PB_record> search_list = new ArrayList();;
    
    /**
     * Creates new form UI_Search_Entry
     * @param el
     */
    public UI_Search_Entry(ArrayList<PB_record> el) 
    {
        entry_list = el;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        btn_search.setText("Search");
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchMouseClicked(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_search)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancel)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * MouseClicked event for btn_search
     * @param evt 
     */
    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked
        // Grabs the entered search string
        
        search_list.clear();
        String search = txt_search.getText();
        
        // Checks if the search string is empty
        if(search.equals(""))
        {
            // If it is empty, informs the user with a pop up window
            JOptionPane.showMessageDialog(this, "Search field is empty. Please enter a value to search");
        }
        else
        {
            // Loops through each element in the array list
            entry_list.forEach((e)-> 
            {
                // Grabs the name and number for the current entry
                String name = e.getfName() + " " + e.getsName();
                String pNumber = e.getpNumber();
                String mNumber = e.getmNumber();
                String wNumber = e.getwNumber();
                String email = e.getEmail();
                
                
                // Checks if the search string matches any of the details
                if (name.toLowerCase().contains(search) || pNumber.contains(search) 
                    || mNumber.contains(search) || wNumber.contains(search) 
                    || email.toLowerCase().contains(search)) 
                {
                    // If it matches, then adds the entry to the list model
                    search_list.add(e);
                    
                }
            });
            
            // Checks if the search result is empty
            if(search_list.isEmpty())
            {
                // If it is, informs the user that no search results were found and displays the full list
                // Re-displays the main UI, and hides this UI
                JOptionPane.showMessageDialog(this, "No search results found, please try another search");
                UI_Main ui = new UI_Main(entry_list);
                ui.setVisible(true);
                this.setVisible(false);
            }
            else
            {
                // If it is not empty, displays the search results
                UI_Main ui = new UI_Main(entry_list, search_list);
                ui.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_searchMouseClicked

    /**
     * MouseClicked event for btn_cancel
     * @param evt 
     */
    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        // Re-displays the main UI, and hides this UI
        UI_Main ui = new UI_Main(entry_list);
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(UI_Search_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Search_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Search_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Search_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Search_Entry(entry_list).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_search;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}