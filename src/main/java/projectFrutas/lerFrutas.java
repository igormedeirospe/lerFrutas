package projectFrutas;

import javax.swing.*;

public class lerFrutas {

    public static void main(String[] args) {


    String frutas1, frutas2;

    frutas1 = JOptionPane.showInputDialog("Digite o nome da fruta");
    frutas2 = JOptionPane.showInputDialog("Digite o nome da fruta");

    if(frutas1.equals("Maça") && frutas2.equals("Banana")){

        JOptionPane.showMessageDialog(null, "A fruta é " + frutas1 + " e " + frutas2);
    }else{
        JOptionPane.showMessageDialog(null, "fruta invalida");
    }






    }

}
