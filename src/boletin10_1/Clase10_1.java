package boletin10_1;

import javax.swing.JOptionPane;

public class Clase10_1 {
    public int numAdivinar() {
        int numAdiv = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entre 1 y 50: "));
        while (numAdiv < 1 || numAdiv > 50) {
            numAdiv = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entre 1 y 50: "));
        }
        return numAdiv;
    }

    public int numJugador() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero que crea que es : "));
    }

    public int numAciertos() {
        int numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de oportunidades que quiere conceder entre 4 y 8 : "));
        while (numIntentos < 4 || numIntentos > 8) {
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de oportunidades que quiere conceder entre 4 y 8 : "));
        }
        return numIntentos;
    }

    public void juego() {
        int numAdi = numAdivinar();
        int intentos = numAciertos();
        int numJug;
        int i = 0;
        do {
            if (i == intentos) {
                JOptionPane.showConfirmDialog(null, "Se te han acabado los intentos");
                break;
            }
            numJug = numJugador();

            if (numJug == numAdi) {
                JOptionPane.showConfirmDialog(null, "Es el número correcto");
                break;

            } else if (numJug < numAdi) {
                JOptionPane.showMessageDialog(null, "El numero a adivinar es mayor ");
            } else {
                JOptionPane.showMessageDialog(null, "El numero a adivinar es menor ");
            }

            i++;
        } while (numJug != numAdi);

    }
}

