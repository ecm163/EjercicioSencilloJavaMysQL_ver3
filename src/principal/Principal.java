package principal;

import modelo.Modelo;
import vista.Vista;
import controlador.Controlador;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

//Las siguientes librerías se agregande forma manual. Escribiendolas.

public class Principal {

    //public static String valor_inicio = "";

    public static void main(String[] args) {

        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: "+e);
        }

        Modelo modelo = new Modelo(/*valor_inicio*/);
        Vista vista = new Vista();
        Controlador control = new Controlador(modelo, vista);
        control.iniciar();

    }

}
