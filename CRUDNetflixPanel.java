package GUIs;

import Features.Language;
import Features.Quality;
import static GUIs.NetflixAppGUI.shows;
import Shows.Genre;
import Shows.Show;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author DOUAE
 */
public class CRUDNetflixPanel extends javax.swing.JPanel {

    static DefaultListModel<Show> model;

    //Creates new form CRUDNetflixPanel
    public CRUDNetflixPanel() {

        model = new DefaultListModel<>();
        initComponents();
        shows.getShowList().forEach((show) -> {
            model.addElement(show);
        });

        showsList.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        showsList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TitleTxt = new javax.swing.JTextField();
        NumberOfViewsTxt = new javax.swing.JTextField();
        AverageRatingTxt = new javax.swing.JTextField();
        SynopsisTxt = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        GenreCombo = new javax.swing.JComboBox<>();
        QualityCombo = new javax.swing.JComboBox<>();
        LanguageCombo = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(699, 496));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Shows Available  ");

        showsList.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        showsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        showsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                showsListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(showsList);

        jLabel2.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Title");

        jLabel4.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Language");

        jLabel5.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Quality");

        jLabel6.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Number Of Views");

        jLabel7.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Average Rating");

        jLabel8.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Synopsis");

        jLabel9.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Genre");

        AddButton.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        AddButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\DOUAE\\Pictures\\Createsmall.png")); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        EditButton.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        EditButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\DOUAE\\Pictures\\Modifysmall.png")); // NOI18N
        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        DeleteButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\DOUAE\\Pictures\\Deletesmall.png")); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        ClearButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\DOUAE\\Pictures\\Abortsmall.png")); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        GenreCombo.setModel(new javax.swing.DefaultComboBoxModel<>(Genre.values()));

        QualityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(Quality.values()));

        LanguageCombo.setModel(new javax.swing.DefaultComboBoxModel<>(Language.values()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2))))
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TitleTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(GenreCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(AverageRatingTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NumberOfViewsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LanguageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QualityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(SynopsisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GenreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QualityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LanguageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumberOfViewsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AverageRatingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SynopsisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClearButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(564, 564, 564))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        TitleTxt.setText("");
        NumberOfViewsTxt.setText("");
        SynopsisTxt.setText("");
        AverageRatingTxt.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        Show selected = showsList.getSelectedValue();

        shows.removeShow(selected);
        model.removeElement(selected);
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
        Show selected = showsList.getSelectedValue();
        Show newShow;

        Genre genre = (Genre) GenreCombo.getSelectedItem();
        ArrayList<Genre> genres = new ArrayList();
        genres.add(genre);
        Language language = (Language) LanguageCombo.getSelectedItem();
        Quality quality = (Quality) QualityCombo.getSelectedItem();

        String title = TitleTxt.getText();
        if (title.isEmpty()) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Please provide a valid title.", "Editing shows", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!selected.getTitle().equals(title) && !shows.findShowWithTitle(title).isEmpty()) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Please provide a unique title.", "Editing shows", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String synopsis = SynopsisTxt.getText();
        if (synopsis.isEmpty()) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Please provide a valid text.", "Editing shows", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int numberOfViews;
        try {
            numberOfViews = Integer.parseInt(NumberOfViewsTxt.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Please provide a valid count of number of views.", "Editing shows", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double averageRating;
        try {
            averageRating = Double.parseDouble(AverageRatingTxt.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Please provide a valid average rating.", "Editing shows", JOptionPane.ERROR_MESSAGE);
            return;
        }

        newShow = new Show(title, genres, numberOfViews, language, synopsis, averageRating, quality.name());

        if (shows.modifyShow(selected, newShow)) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Show modified successfully..", "Editing shows", JOptionPane.INFORMATION_MESSAGE);
            model.removeElement(selected);
            model.addElement(newShow);
            showsList.setSelectedValue(newShow, true);
        } else {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Failed to modify the show.", "Editing shows", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_EditButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:

        Show newShow;

        Genre genre = (Genre) GenreCombo.getSelectedItem();
        ArrayList<Genre> genres = new ArrayList();
        genres.add(genre);
        Language language = (Language) LanguageCombo.getSelectedItem();
        Quality quality = (Quality) QualityCombo.getSelectedItem();

        String title = TitleTxt.getText();
        if (title.isEmpty()) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Please provide a valid title.", "Adding shows", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!shows.findShowWithTitle(title).isEmpty()) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Please provide a unique title.", "Adding shows", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String synopsis = SynopsisTxt.getText();
        if (synopsis.isEmpty()) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Please provide a valid synopsis.", "Adding shows", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int numberOfViews;
        try {
            numberOfViews = Integer.parseInt(NumberOfViewsTxt.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Please provide a valid count of number of views.", "Adding shows", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double averageRating;
        try {
            averageRating = Double.parseDouble(AverageRatingTxt.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Please provide a valid average rating.", "Adding shows", JOptionPane.ERROR_MESSAGE);
            return;
        }

        newShow = new Show(title, genres, numberOfViews, language, synopsis, averageRating, quality.name());
        if (shows.addShow(newShow)) {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Show added successfully..", "Adding shows", JOptionPane.INFORMATION_MESSAGE);
            model.addElement(newShow);
            showsList.setSelectedValue(newShow, true);
        } else {
            JOptionPane.showMessageDialog(CRUDNetflixPanel.this, "" + "Failed to add the show.", "Adding shows", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_AddButtonActionPerformed

    private void showsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_showsListValueChanged
        // TODO add your handling code here:
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Show show = showsList.getSelectedValue();

        if (show == null) {
            return;
        }
        TitleTxt.setText(show.getTitle());
        QualityCombo.setSelectedItem(show.getQuality());
        LanguageCombo.setSelectedItem(show.getLanguage());
        NumberOfViewsTxt.setText(String.valueOf(show.getNum_views()));
        SynopsisTxt.setText(show.getSynopsis());
        AverageRatingTxt.setText(String.valueOf(show.getAverage_rating()));
        GenreCombo.setSelectedItem(show.getGenre());

    }//GEN-LAST:event_showsListValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AverageRatingTxt;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JComboBox<Genre> GenreCombo;
    private javax.swing.JComboBox<Language> LanguageCombo;
    private javax.swing.JTextField NumberOfViewsTxt;
    private javax.swing.JComboBox<Quality> QualityCombo;
    private javax.swing.JTextField SynopsisTxt;
    private javax.swing.JTextField TitleTxt;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane2;
    static javax.swing.JList<Show> showsList;
    // End of variables declaration//GEN-END:variables

}
