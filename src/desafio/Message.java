package desafio;

import javax.swing.*;

public class Message {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do arquivo");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!"    );

        String mensagem = "<HTML><BODY><p style=color:#FFCCCC;BACKGROUND-COLOR:#000000; >Ola mundo</p></BODY></HTML>";
        JOptionPane.showMessageDialog(null, mensagem);
        int resposta = JOptionPane.showConfirmDialog(null, "Você gosta de Java?", "Pergunta", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showConfirmDialog(null, "Que bom!");
        } else {
            JOptionPane.showConfirmDialog(null, "Que pena! Mas continue estudando.");
        }


    }
}
