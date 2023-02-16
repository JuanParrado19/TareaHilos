import javax.swing.*;

public class MercadoLibre {
    public static void main(String[] args) {
        MercadoLibreEnvio envio = new MercadoLibreEnvio();
        Thread hiloEnvio = new Thread(envio);

        JOptionPane.showMessageDialog(null," Bienvenido a Mercado Libre ! ");
        JOptionPane.showMessageDialog(null, " Desea comprar unos zapatos ? ");

        String respuesta = JOptionPane.showInputDialog(null, "Su respuesta tiene que ser 'si' ");

        if("si".equals(respuesta)){
            JOptionPane.showMessageDialog(null, " Perfecto, Gracias por su compra, se procesará el envio ");
        }else{
            JOptionPane.showMessageDialog(null, " Igual los tenia que comprar ");
        }

        hiloEnvio.start();

    }
}