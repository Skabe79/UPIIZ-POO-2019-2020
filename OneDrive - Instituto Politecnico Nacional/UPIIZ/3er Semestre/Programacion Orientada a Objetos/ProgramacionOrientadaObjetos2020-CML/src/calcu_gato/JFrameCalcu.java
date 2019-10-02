/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu_gato;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Carlos Montes Leyva
 */
public class JFrameCalcu extends JFrame{
    String titulo;
    Dimension dim;
    Dimension dim2;
    public JFrameCalcu(String titulo, Dimension dim){
        this.titulo=titulo;
        this.dim2=new Dimension(100, 100);;
        this.dim= dim;
    }
    public void inicializapanel(){
        JPanel central= new JPanel(new GridLayout(4, 4));
        JButtonCalculadora1 btnC = new JButtonCalculadora1("C", dim, Color.BLACK);
        JButtonCalculadora1 btnCE = new JButtonCalculadora1("CE", dim, Color.BLACK);
        JButtonCalculadora1 btnMM = new JButtonCalculadora1("+/-", dim, Color.BLACK);
        JButtonCalculadora1 btnMulti = new JButtonCalculadora1("X", dim, Color.BLACK);
        JButtonCalculadora1 btn7 = new JButtonCalculadora1("7", dim, Color.BLACK);
        JButtonCalculadora1 btn8 = new JButtonCalculadora1("8", dim, Color.BLACK);
        JButtonCalculadora1 btn9 = new JButtonCalculadora1("9", dim, Color.BLACK);
        JButtonCalculadora1 btnDiv = new JButtonCalculadora1("/", dim, Color.BLACK);
        JButtonCalculadora1 btn4 = new JButtonCalculadora1("4", dim, Color.BLACK);
        JButtonCalculadora1 btn5 = new JButtonCalculadora1("5", dim, Color.BLACK);
        JButtonCalculadora1 btn6 = new JButtonCalculadora1("6", dim, Color.BLACK);
        JButtonCalculadora1 btnMenos = new JButtonCalculadora1("-", dim, Color.BLACK);
        JButtonCalculadora1 btn1 = new JButtonCalculadora1("1", dim, Color.BLACK);
        JButtonCalculadora1 btn2 = new JButtonCalculadora1("2", dim, Color.BLACK);
        JButtonCalculadora1 btn3 = new JButtonCalculadora1("3", dim, Color.BLACK);
        JButtonCalculadora1 btnMas = new JButtonCalculadora1("+", dim, Color.BLACK);
        setVisible(true);
        setSize(dim);
        setLayout(new BorderLayout());
        central.add(btnC);
        central.add(btnCE);
        central.add(btnMM);
        central.add(btnMulti);
        central.add(btn7);
        central.add(btn8);
        central.add(btn9);
        central.add(btnDiv);
        central.add(btn4);
        central.add(btn5);
        central.add(btn6);
        central.add(btnMenos);
        central.add(btn1);
        central.add(btn2);
        central.add(btn3);
        central.add(btnMas);
        
        setLayout(new BorderLayout());
        add(central, BorderLayout.CENTER);
        JTextField display= new JTextField();
        Font auxFuente=display.getFont();
        Font nueva= new Font(auxFuente.getName(),auxFuente.getStyle(), 20);
        display.setFont(nueva);
        
    }
}
