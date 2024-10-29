import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Busqueda {
    private JTextField inputField;
    private JButton searchButton;
    private JTextArea resultArea;
    private JPanel mainPanel;

    public Busqueda() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarValor();
            }
        });
    }

    private void buscarValor() {
        String input = inputField.getText();
        resultArea.setText("");
        try {
            int valorBuscado = Integer.parseInt(input);
            int resultado = buscar(new int[]{5, 3, 9, 2, 7, 1}, valorBuscado);
            if (resultado != -1) {
                resultArea.setText("El valor "+valorBuscado+ " se encuentra en la posición: "+resultado);
            } else {
                resultArea.setText("El valor "+valorBuscado+ " no se encuentra en el array.");
            }
        } catch (NumberFormatException e) {
            resultArea.setText("Ingrese un número válido.");
        }
    }

    public static int buscar(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Búsqueda Lineal");
        frame.setContentPane(new Busqueda().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}