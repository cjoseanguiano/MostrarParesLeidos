/*
18. Leer una secuencia de números y mostrar los 30 primeros pares leídos.
 */
package mostrarparesleidos;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class MostrarParesLeidos {

    public static void main(String[] args) {
        int sec_num[] = new int[30];
        int logitud = 30;
        int n;
        for (int i = 0; i < logitud; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los valores"));
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
