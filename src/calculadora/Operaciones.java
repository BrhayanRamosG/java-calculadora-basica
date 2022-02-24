package calculadora;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Brhayan Ramos Gamboa
 */
public class Operaciones {

    private final float[] array;

    public Operaciones(float[] array) {
        this.array = array;
    }

    public float suma() {
        float resultado = 0;
        for (int i = 0; i < array.length; i++) {
            resultado += array[i];
        }
        return resultado;
    }

    public float resta() {
        float resultado = array[0];
        for (int i = 1; i < array.length; i++) {
            resultado -= array[i];
        }
        return resultado;
    }

    public float multiplicacion() {
        float resultado = 1;
        for (int i = 0; i < array.length; i++) {
            resultado *= array[i];
        }
        return resultado;
    }

    public float division() {
        float resultado = 0.0f;
        float divisor = array[0];
        for (int i = 1; i < array.length; i++) {
            resultado += array[i];
        }
        return resultado / divisor;
    }

    public float calcularPromedio() {
        float promedio = 0.0f;
        for (int i = 0; i < array.length; i++) {
            promedio += array[i];
        }
        return promedio / array.length;
    }

    public String limitarDecimal(float decimal) {
        DecimalFormat formato = new DecimalFormat("#0.00");
        return formato.format(decimal);
    }

    public static void mostrarMensaje(String title, String msg, int type) {
        JOptionPane.showMessageDialog(null, msg, title, type);
    }

}
