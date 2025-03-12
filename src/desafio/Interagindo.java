package desafio;

import javax.swing.*;

public class Interagindo {
    public static void main(String[] args) {
        // Variavel criada para atribuir uma string vazia
        String ex = "";

        //Loop para o numero multiplicar de forma vertical do 1 ate o 10
        for (int a = 1; a <= 10; a++) {
            // Loops para o numero de colunas
            for (int b = 1; b <= 5; b++) {
                // Resultado sendo atribuido a variavel vazia criada no começo. O "/t" serve para dar um espaçamento entre colunas
                ex += (b + "x" + a + " = " + (b * a) + " \t");
            }
            ex += (" ");
            //Quebra de linha
            ex += ("\n");
        }
        ex += (" ");
        ex += ("\n");

        for (int a = 1; a <= 10; a++) {
            for (int b = 6; b <= 10; b++) {
                ex += (b + "x" + a + "=" + (b * a) + " \t");
            }
            ex += (" ");
            ex += ("\n");

        }

        JTextArea JtxArea = new JTextArea(ex);
        JOptionPane.showMessageDialog(null, JtxArea);
    }
}
