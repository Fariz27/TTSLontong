/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttslontong;

import java.io.*;
import sun.audio.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
/**
 * FXML Controller class
 *
 * @author Fariz
 */
public class FXMLutamaController implements Initializable {
    private String soal1="",soal2="",soal3="",soal4="",skorrmin;
    private int skorr;
    private boolean s1benar=false,s2benar=false,s3benar=false,s4benar=false;

    @FXML
    private Label LabelSoal;
    @FXML
    private Button tampilkan;
    @FXML
    private Button inputJawab;
    @FXML
    private TextField a1;
    @FXML
    private TextField a2;
    @FXML
    private TextField a3;
    @FXML
    private TextField b1;
    @FXML
    private TextField b3;
    @FXML
    private TextField b4;
    @FXML
    private TextField b5;
    @FXML
    private TextField b6;
    @FXML
    private Label cek1;
    @FXML
    private Label cek2;
    @FXML
    private Label cek3;
    @FXML
    private TextField c1;
    @FXML
    private TextField c3;
    @FXML
    private TextField c4;
    @FXML
    private TextField c5;
    @FXML
    private Label skor;
    @FXML
    private Label skor1;
    @FXML
    private Button quit;
    @FXML
    private Label skor2;
    @FXML
    private TextField d1;
    @FXML
    private TextField d3;
    @FXML
    private TextField d4;
    @FXML
    private TextField d5;
    @FXML
    private TextField d6;
    @FXML
    private TextField d7;
    @FXML
    private Label cek4;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        JOptionPane.showMessageDialog(null,"Untuk melihat soal klick tampilkan soal");
        String namapeng =JOptionPane.showInputDialog("Masukan nama");
        skor2.setText(namapeng);
    }    

    @FXML
    private void tampil(ActionEvent event) {
    LabelSoal.setText("Soal:\n1.Motor Memiliki Roda ...\n2.Motor bocor biasanya di ...\n3.Hewan yang nempel di dinding ...\n4.Api lilin mati jika ditutup gelas karena kurang ...");
    }

    @FXML
    private void inJawab(ActionEvent event) {
        InputStream in;
        
        soal1=a1.getText()+a2.getText()+a3.getText();
        
        if(soal1.length()==3){
            if(s1benar==false){
        if(soal1.equalsIgnoreCase("iya")){
            skor.setText("");
            cek1.setText("V");
            skorr+=100;
            skor.setText(Integer.toString(skorr));
            try{
            in =new FileInputStream(new File("benar.wav"));
        AudioStream audios=new AudioStream(in);
        AudioPlayer.player.start(audios);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);    
                }
            JOptionPane.showMessageDialog(null,"Motor jelas punya roda. kalau ga punya ga bisa jalan dong.");
            s1benar=true;
            a1.setEditable(false);
            a2.setEditable(false);
            a3.setEditable(false);
            
        }else{  
            try{
            in =new FileInputStream(new File("salah.wav"));
        AudioStream audios=new AudioStream(in);
        AudioPlayer.player.start(audios);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);    
                }
            JOptionPane.showMessageDialog(null,"Jawaban salah skor -50");
            skorr-=50;
            skorrmin=Integer.toString(skorr);
            skor.setText(skorrmin);
            
        }
        }
        }
        soal2=b1.getText()+a3.getText()+b3.getText()+b4.getText()+b5.getText()+b6.getText();
        if(soal2.length()==6){
            if(s2benar!=true){
        if(soal2.equalsIgnoreCase("bannya")){
            skor.setText("");
            cek2.setText("V");
            skorr+=100;
            skor.setText(Integer.toString(skorr));
            try{
            in =new FileInputStream(new File("benar.wav"));
        AudioStream audios=new AudioStream(in);
        AudioPlayer.player.start(audios);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);    
                }
            JOptionPane.showMessageDialog(null,"Jadi maunya dimana? di stang??");
            s2benar=true;
            b1.setEditable(false);
            a3.setEditable(false);
            b3.setEditable(false);
            b4.setEditable(false);
            b5.setEditable(false);
            b6.setEditable(false);

        }else{
            try{
            in =new FileInputStream(new File("salah.wav"));
        AudioStream audios=new AudioStream(in);
        AudioPlayer.player.start(audios);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);    
                }
            JOptionPane.showMessageDialog(null,"Jawaban salah skor -50");
            skorr-=50;
            skorrmin=Integer.toString(skorr);
            skor.setText(skorrmin);
        }
        }
        }
        soal3=c1.getText()+b6.getText()+c3.getText()+c4.getText()+c5.getText();
        if(soal3.length()==5){
            if(s3benar!=true){
        if(soal3.equalsIgnoreCase("capek")){
            skor.setText("");
            cek3.setText("V");
            skorr+=100;
            skor.setText(Integer.toString(skorr));
            try{
            in =new FileInputStream(new File("benar.wav"));
        AudioStream audios=new AudioStream(in);
        AudioPlayer.player.start(audios);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);    
                }
        JOptionPane.showMessageDialog(null,"Alasannya Cari Sendiri");
        s3benar=true;
        c1.setEditable(false);
        b6.setEditable(false);
        c3.setEditable(false);
        c4.setEditable(false);
        c5.setEditable(false);
        }else{
            try{
            in =new FileInputStream(new File("salah.wav"));
        AudioStream audios=new AudioStream(in);
        AudioPlayer.player.start(audios);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);    
                }
            JOptionPane.showMessageDialog(null,"Jawaban salah skor -50");
            skorr-=50;
            skorrmin=Integer.toString(skorr);
            skor.setText(skorrmin);
        }
        }
        }
        soal4=d1.getText()+c4.getText()+d3.getText()+d4.getText()+d5.getText()+d6.getText()+d7.getText();
        
        if(soal4.length()==7){
            if(s4benar==false){
        if(soal4.equalsIgnoreCase("kerjaan")){
            skor.setText("");
            cek4.setText("V");
            skorr+=100;
            skor.setText(Integer.toString(skorr));
            try{
            in =new FileInputStream(new File("benar.wav"));
        AudioStream audios=new AudioStream(in);
        AudioPlayer.player.start(audios);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);    
                }
            JOptionPane.showMessageDialog(null,"Lilin sudah nyala kenapa dimatiin");
            s4benar=true;
            d1.setEditable(false);
            c4.setEditable(false);
            d3.setEditable(false);
            d4.setEditable(false);
            d5.setEditable(false);
            d6.setEditable(false);
            d7.setEditable(false);
            
        }else{
            try{
            in =new FileInputStream(new File("salah.wav"));
        AudioStream audios=new AudioStream(in);
        AudioPlayer.player.start(audios);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);    
                }
            JOptionPane.showMessageDialog(null,"Jawaban salah skor -50");
            skorr-=50;
            skorrmin=Integer.toString(skorr);
            skor.setText(skorrmin);
        }
        }
        }
        
    }

    @FXML
    private void bquit(ActionEvent event) {
        Platform.exit();
    }

    
   
    
}
