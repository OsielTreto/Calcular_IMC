/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimc;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

/**
 *
 * @author LEIZO194
 */
public class CalcularIMC extends JFrame implements ActionListener {

    JLabel titulo, primer, segundo, resultado, clasificacion;
    JTextField Caja1, Caja2, Caja3, Caja4;
    JButton calcular;

    public static void main(String[] args) {

        CalcularIMC obj = new CalcularIMC();
        obj.setVisible(true);
    }

    public CalcularIMC() {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    public void configurarVentana() {
        setTitle("Calcular IMC");
        setLayout(null);
        setSize(350, 300);
    }

    public void inicializarComponentes() {
        titulo = new JLabel();
        primer = new JLabel();
        segundo = new JLabel();
        clasificacion = new JLabel();
        resultado = new JLabel();
        Caja1 = new JTextField();
        Caja2 = new JTextField();
        Caja3 = new JTextField();
        Caja4 = new JTextField();
        calcular = new JButton();

        titulo.setText("Calculadora de IMC");
        titulo.setBounds(90, 20, 120, 20);

        primer.setText("Ingrese el peso (kg)");
        primer.setBounds(30, 50, 130, 20);

        segundo.setText("Ingrese la altura (m)");
        segundo.setBounds(30, 80, 130, 20);

        Caja1.setBounds(150, 50, 120, 20);
        Caja2.setBounds(150, 80, 120, 20);

        calcular.setText("Calcular");
        calcular.setBounds(100, 110, 100, 30);
        calcular.addActionListener(this);

        resultado.setText("Resultado");
        resultado.setBounds(30, 150, 100, 20);

        Caja3.setBounds(100, 150, 200, 20);
        clasificacion.setText("Clasificación de la OMS");
        clasificacion.setBounds(30, 180, 200, 20);
        Caja4.setBounds(100, 210, 200, 20);

        add(titulo);
        add(primer);
        add(segundo);
        add(Caja1);
        add(Caja2);
        add(calcular);
        add(resultado);
        add(Caja3);
        add(clasificacion);
        add(Caja4);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        DecimalFormat df = new DecimalFormat("#.0000");

        double a = Double.parseDouble(Caja1.getText());
        double b = Double.parseDouble(Caja2.getText());
        double c = a / (b * b);

        String igual = String.valueOf(c);
        Caja3.setText(df.format(c));
        if (c < 18.5) {
            Caja4.setText("Bajo peso");
        }
        if (c >= 18.5 && c <= 24.9) {
            Caja4.setText("Adecuado");
        }
        if (c >= 25 && c <= 29.9) {
            Caja4.setText("Sobrepeso");

        }
        if (c >= 30 && c <= 34.9) {
            Caja4.setText("Obesidad grado 1");

        }
        if (c >= 35 & c <= 39.9) {
            Caja4.setText("Obesidad grado 2");

        }
        if (c >= 40) {
            Caja4.setText("Obesidad grado 2");

        }
    }
}
