/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wp_post;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Awais
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    ChromeDriver driver;

    public main() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        um = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        url = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        delay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        starting = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        count = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        delay2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Wordpress Poster ");

        jLabel2.setText("Path");

        path.setText("E:\\Projects\\new format");
        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });

        jLabel3.setText("First Title #");

        um.setText("0");

        jLabel4.setText("Category");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chemicals", "Automotive", "Energy & Power", "Industrial", "Life Science", "Tech", "Press Release", "Company News", "Business", "News" }));

        jLabel5.setText("Email");

        mail.setText("fahad");

        jLabel6.setText("Password");

        pass.setText("fahad123@123");

        jButton1.setText("Login and Start !");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("URL");

        url.setText("https://thetajphotography.in/dummy2/wp-admin/post-new.php");

        jLabel8.setText("Delay");

        delay.setText("0");

        jLabel9.setText("Start");

        starting.setText("1");

        jLabel10.setText("Total");

        count.setText("All");

        jLabel11.setText("Delay");

        delay2.setText("4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(path)
                                    .addComponent(um)
                                    .addComponent(mail)
                                    .addComponent(pass)
                                    .addComponent(url, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(delay)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addGap(367, 367, 367)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(count, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(starting)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(delay2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(starting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(delay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            fetch_files();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField count;
    private javax.swing.JTextField delay;
    private javax.swing.JTextField delay2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField path;
    private javax.swing.JTextField starting;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField um;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
String conveert(String main_content) {
        String[] splitted = main_content.split(" ");
        String link = null;
        for (int ii = 0; ii < splitted.length; ii++) {
            if ((splitted[ii]).contains("http://")) { // use more statements for

                System.out.println("After conversion of <ahref     "+splitted[ii]); //just checking the output
                link = "<a href=\"" + splitted[ii] + "\">" + splitted[ii] + "</a>";

            }
            if ((splitted[ii]).contains("https://")) { // use more statements for

                System.out.println("After conversion of <ahref     "+splitted[ii]); //just checking the output
                link = "<a href=\"" + splitted[ii] + "\">" + splitted[ii] + "</a>";

            }
        }
        return main_content.subSequence(0, 26) + link;

    }

    String conveert2nd(String main_content) {
        String[] splitted = main_content.split(" ");
        String link = null;
        for (int ii = 0; ii < splitted.length; ii++) {
            if ((splitted[ii]).contains("http://")) { // use more statements for

                 System.out.println("Output of link "+splitted[ii]); //just checking the output
                link = "<a href=\"" + splitted[ii] + "\">" + splitted[ii] + "</a>";

            }
            if ((splitted[ii]).contains("https://")) { // use more statements for

                System.out.println("Output of link "+splitted[ii]); //just checking the output
                link = "<a href=\"" + splitted[ii] + "\">" + splitted[ii] + "</a>";
                

            }
        }
        return main_content.subSequence(0, 42) + " " + link;

    }

    
    String conveert3rd(String main_content) {
        String[] splitted = main_content.split(" ");
        String link = null;
        for (int ii = 0; ii < splitted.length; ii++) {
            if ((splitted[ii]).contains("http://")) { // use more statements for

                 System.out.println("Output of link "+splitted[ii]); //just checking the output
                link = "<a href=\"" + splitted[ii] + "\">" + splitted[ii] + "</a>";

            }
            if ((splitted[ii]).contains("https://")) { // use more statements for

                System.out.println("Output of link "+splitted[ii]); //just checking the output
                link = "<a href=\"" + splitted[ii] + "\">" + splitted[ii] + "</a>";
                

            }
        }
        return main_content.subSequence(0, 36) + " " + link;

    }
    
    private void fetch_files() throws IOException, InvalidFormatException, InterruptedException {
        int files = 1;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(url.getText());
        int k = 1;
        int st = Integer.parseInt(starting.getText());
        try {
            File folder = new File(path.getText());
            File[] listOfFiles = folder.listFiles();
            int j = Integer.parseInt(um.getText());

            driver.findElement(By.name("log")).sendKeys(mail.getText());
            driver.findElement(By.name("pwd")).sendKeys(pass.getText());
            driver.findElement(By.name("wp-submit")).click();
            int coun = 0;
            int ct = 0;
            if (count.getText().contains("All")) {
                ct = listOfFiles.length;
            } else {
                ct = Integer.parseInt(count.getText());

            }
            for (File file : listOfFiles) {

                if (files >= st && coun <= ct) {
                    coun++;
                    int t = Integer.parseInt(delay.getText());
                    Thread.sleep(t * 1000);
                    String title = "", meta_description = "", main_content = "", tags = "";
                    if (file.isFile()) {
                       // System.out.println("406"+file.toString());
                        XWPFDocument xdoc = new XWPFDocument(OPCPackage.open(file));
                        
                        List<XWPFParagraph> paragraphList = xdoc.getParagraphs();

                        //  System.out.println(paragraphList.get(4).getText());
                        int i = 1;
                        int total = 0;
                        for (XWPFParagraph paragraph : paragraphList) {

                            if (!"".equals(paragraph.getText())) {
                                total++;
                            
                            }
                          
                        }
                        

                       System.out.println("421 total : " + total);
                        int tile_iterator = 0;
                        boolean doo = false;
                        outerloop:
                        for (XWPFParagraph paragraph : paragraphList) {

                            if (tile_iterator == 0) {
                               // System.out.println("429 GETTEXTttttttttttttttt :  " + paragraph.getText());
                                System.out.println("430 getselectd:  " + type.getSelectedItem());
                                tile_iterator++;

                                if (!type.getSelectedItem().equals(paragraph.getText())) {
                                    {                                        
                                        
                                        doo = true;
                                        for (XWPFParagraph paragraphh : paragraphList) {
                                            
                                            if (!"".equals(paragraphh.getText())) {
                                                
                                                i++;

                                                if (i == 6 + j) {//4 For the num of titles
                                                  //  k=1;
                                                    title = paragraphh.getText();
                                                    System.out.println(" 443 title"+ title);
                                                    if (j >= 4) { //9
                                                        j = 0;
                                                        break outerloop;

                                                    } else {
                                                        j++;
                                                        break outerloop;

                                                    }
                                                }
                                            }

                                        }
                                    }
                                }
                            }
                            if (!"".equals(paragraph.getText())) {
                                i++;

                                if (i == 6 + j) {//5
                                    title = paragraph.getText();
                                    System.out.println("Title neechy wala"+title);
                                    if (j >= 4) {   //9
                                        j = 0;
                                    } else {
                                        j++;
                                        break;
                                    }
                                }
                            }

                        }
                        //meta description
                        int meta_iterate = 1;
                        Random r = new Random();
                        int low = 12;   //16
                         int high = 13; //17
                        int result = r.nextInt(high - low) + low;
//                        System.out.println(result);
                        for (XWPFParagraph paragraph : paragraphList) {
                           // System.out.println("Data"+paragraph.getText());
                            if (!"".equals(paragraph.getText())) {
                                    
                                meta_iterate++;
                                
                                if (meta_iterate == result) {
                                    meta_description = paragraph.getText();
                                    System.out.println("meta Description:   "+meta_description);
                                }
                            }

                        }
                        System.out.println("meta    "+meta_iterate);
                        //paragraph
                      
                        int main_iterate = 1;
                        String url_line = "";
                        String remaining = "";
                        String first = "";      
                        String query= "";
                        for (XWPFParagraph paragraph : paragraphList) {

                            if (!"".equals(paragraph.getText())) {
                                if (main_iterate == total) {
                                    tags = paragraph.getText();
                                  //  System.out.println("tags"+ tags);
                                    break;
                                }

                                main_iterate++;

                                if (paragraph.getText().contains("Access Report ")) {
                                    url_line = paragraph.getText();
                                    //System.out.println("Main Iterate "+main_iterate+" url   "+url_line);
                                    url_line = conveert(url_line);
                                    System.out.println(url_line);
                                } else if ((main_iterate == 15 && !paragraph.getText().contains("Access Report ") || (main_iterate == 14 && doo && !paragraph.getText().contains("Access Report ")))) {  //18 , 17
                                    first = paragraph.getText();
                                } else if (main_iterate >= 14) {//17
                                    if (paragraph.getText().contains("Purchase this premium research report at")) {
                                        String a = paragraph.getText();
                                        System.out.println("full    "+a);
                                        a = conveert2nd(a);
                                        System.out.println("pur     "+a);
                                        remaining = remaining + "\n \n" + a;

                                        }else if (paragraph.getText().contains("Ask your report related queries at:")) {
                                       System.out.println(main_iterate);
                                       
                                        String a = paragraph.getText();
                                         System.out.println("full    "+a);
                                        query = conveert3rd(a);
                                        System.out.println("pur     "+a);                               
                                    } 
                                    
                                    
                                    else {
                                        remaining = remaining + "\n \n" + paragraph.getText();
                                    }
                                }                                   
                                
                            }

                        }
                        System.out.println("----------------------------------------------------------------");
                        main_content = first + "\n \n" + url_line + "\n" + remaining + "\n \n"+query;
                        //     System.out.println(main_content);

                        driver.findElement(By.name("post_title")).sendKeys(title);
                        WebElement element;

                        driver.findElement(By.xpath("//button[@class ='wp-switch-editor switch-html']")).click();

                        element = driver.findElement(By.xpath("//textarea[@name='content']"));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", element,
                                main_content);

                        List<WebElement> allcategoreis = driver.findElements(By.xpath("//label[@class='selectit']"));

                        System.out.println("Select category     "+type.getSelectedItem());
                        for (WebElement w : allcategoreis) {
                            if (w.getText().equals(type.getSelectedItem())) {
                                w.click();
                                break;
                            }

                        }

                        element = driver.findElement(By.name("newtag[post_tag]"));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", element,
                                tags);
                        element = driver.findElement(By.name("aiosp_title"));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", element,
                                title);
                        element = driver.findElement(By.name("aiosp_description"));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", element,
                                meta_description);
                        JavascriptExecutor js = (JavascriptExecutor) driver;
                        js.executeScript("window.scrollTo(0, 0);");
                        int tt = Integer.parseInt(delay2.getText());
                        Thread.sleep(tt * 1000);
                        WebDriverWait wait = new WebDriverWait(driver, 20);
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='publish']"))).click();
                        driver.get(url.getText());
                        System.out.println(files + " : " + title);

                    }

                    files++;

                } else {
                    files++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "ERROR ON FILE : " + files + e.getLocalizedMessage(), "Failure", JOptionPane.ERROR_MESSAGE);
        }
    }
}
