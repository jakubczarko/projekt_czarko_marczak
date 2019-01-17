/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 *
 */
public class MyListener1 implements MouseListener{
    
    private JComboBox boks1;
    private JComboBox boks2;
    private JButton przelicz;
    private JTextField tekst1;
    private JTextField tekst2;

    public MyListener1(JComboBox boks1, JComboBox boks2, JButton przelicz, JTextField tekst1, JTextField tekst2) {
        this.boks1 = boks1;
        this.boks2 = boks2;
        this.przelicz = przelicz;
        this.tekst1 = tekst1;
        this.tekst2 = tekst2;
    }

    public JComboBox getBoks1() {
        return boks1;
    }

    public JComboBox getBoks2() {
        return boks2;
    }

    public JButton getPrzelicz() {
        return przelicz;
    }

    public JTextField getTekst1() {
        return tekst1;
    }

    public JTextField getTekst2() {
        return tekst2;
    }

    public void setBoks1(JComboBox boks1) {
        this.boks1 = boks1;
    }

    public void setBoks2(JComboBox boks2) {
        this.boks2 = boks2;
    }

    public void setPrzelicz(JButton przelicz) {
        this.przelicz = przelicz;
    }

    public void setTekst1(JTextField tekst1) {
        this.tekst1 = tekst1;
    }

    public void setTekst2(JTextField tekst2) {
        this.tekst2 = tekst2;
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent me) {

    double wartosc = Double.parseDouble(tekst1.getText());
    try{
        double opcja = boks1.getSelectedIndex();
        double opcja2 = boks2.getSelectedIndex();
        //metr
        if(opcja == 0 && opcja2 == 1)
            tekst2.setText(Double.toString(wartosc*100) + " cm");
        else if(opcja == 0 & opcja2 == 2)
            tekst2.setText(Double.toString(wartosc*10) + " dm");
        else if(opcja == 0 & opcja2 == 3)
            tekst2.setText(Double.toString(wartosc/1000) + " km");
        else if(opcja == 0 & opcja2 == 0)
            tekst2.setText(Double.toString(wartosc*1) + " m");
  1      //centymetr
        else if(opcja == 1 & opcja2 == 0)
            tekst2.setText(Double.toString(wartosc/100) + " m");
        else if(opcja == 1 & opcja2 == 1)
            tekst2.setText(Double.toString(wartosc*1) + " cm");
        else if(opcja == 1 & opcja2 == 2)
            tekst2.setText(Double.toString(wartosc/10) + " dm");
        else if(opcja == 1 & opcja2 == 3)
            tekst2.setText(Double.toString(wartosc/100000) + " km");
        //decymetr
        else if(opcja == 2 & opcja2 == 0)
            tekst2.setText(Double.toString(wartosc*10) + " cm");
        else if(opcja == 2 & opcja2 == 1)
            tekst2.setText(Double.toString(wartosc/10) + " m");
        else if(opcja == 2 & opcja2 == 2)
            tekst2.setText(Double.toString(wartosc*1) + " dm");
        else if(opcja == 2 & opcja2 == 3)
            tekst2.setText(Double.toString(wartosc/10000) + " km");
        //kilometr
        else if(opcja == 3 & opcja2 == 0)
            tekst2.setText(Double.toString(wartosc*1000) + " m");
        else if(opcja == 3 & opcja2 == 1)
            tekst2.setText(Double.toString(wartosc*100000) + " cm");
        else if(opcja == 3 & opcja2 == 2)
            tekst2.setText(Double.toString(wartosc*10000) + " dm");
        else if(opcja == 3 & opcja2 == 3)
            tekst2.setText(Double.toString(wartosc*1) + " km");
        //gram
        else if(opcja == 4 & opcja2 == 5)
            tekst2.setText(Double.toString(wartosc/10) + " dg");
        else if(opcja == 4 & opcja2 == 6)
            tekst2.setText(Double.toString(wartosc/1000) + " kg");
        //dekagram
        else if(opcja == 5 & opcja2 == 4)
            tekst2.setText(Double.toString(wartosc*10) + " g");
        else if(opcja == 5 & opcja2 == 6)
            tekst2.setText(Double.toString(wartosc/100) + " kg");
        //kilogram
        else if(opcja == 6 & opcja2 == 4)
            tekst2.setText(Double.toString(wartosc*1000) + " g");
        else if(opcja == 6 & opcja2 == 5)
            tekst2.setText(Double.toString(wartosc*100) + " dg");
        //wyjątki
        else if(opcja == 0 & opcja2 == 4)
            tekst2.setText("Nie da się zamienić m na g");
        else if(opcja == 0 & opcja2 == 5)
            tekst2.setText("Nie da się zamienić m na dg");
        else if(opcja == 0 & opcja2 == 6)
            tekst2.setText("Nie da się zamienić m na kg");
        else if(opcja == 1 & opcja2 == 4)
            tekst2.setText("Nie da się zamienić cm na g");
        else if(opcja == 1 & opcja2 == 5)
            tekst2.setText("Nie da się zamienić cm na dg");
        else if(opcja == 1 & opcja2 == 6)
            tekst2.setText("Nie da się zamienić cm na kg");
        else if(opcja == 2 & opcja2 == 4)
            tekst2.setText("Nie da się zamienić dm na g");
        else if(opcja == 2 & opcja2 == 5)
            tekst2.setText("Nie da się zamienić dm na dg");
        else if(opcja == 2 & opcja2 == 6)
            tekst2.setText("Nie da się zamienić dm na kg");
        else if(opcja == 3 & opcja2 == 4)
            tekst2.setText("Nie da się zamienić km na g");
        else if(opcja == 3 & opcja2 == 5)
            tekst2.setText("Nie da się zamienić km na dg");
        else if(opcja == 3 & opcja2 == 6)
            tekst2.setText("Nie da się zamienić km na kg");
        else if(opcja == 4 & opcja2 == 0)
            tekst2.setText("Nie da się zamienić g na m");
        else if(opcja == 4 & opcja2 == 1)
            tekst2.setText("Nie da się zamienić g na cm");
        else if(opcja == 4 & opcja2 == 2)
            tekst2.setText("Nie da się zamienić g na dm");
        else if(opcja == 4 & opcja2 == 3)
            tekst2.setText("Nie da się zamienić g na km");
        else if(opcja == 5 & opcja2 == 0)
            tekst2.setText("Nie da się zamienić dg na m");
        else if(opcja == 5 & opcja2 == 1)
            tekst2.setText("Nie da się zamienić dg na cm");
        else if(opcja == 5 & opcja2 == 2)
            tekst2.setText("Nie da się zamienić dg na dm");
        else if(opcja == 5 & opcja2 == 3)
            tekst2.setText("Nie da się zamienić dg na km");
        else if(opcja == 6 & opcja2 == 0)
            tekst2.setText("Nie da się zamienić kg na m");
        else if(opcja == 6 & opcja2 == 1)
            tekst2.setText("Nie da się zamienić kg na cm");
        else if(opcja == 6 & opcja2 == 2)
            tekst2.setText("Nie da się zamienić kg na dm");
        else if(opcja == 6 & opcja2 == 3)
            tekst2.setText("Nie da się zamienić kg na km");
        
        }
    catch(NumberFormatException e){
        tekst2.setText("Błąd");
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
