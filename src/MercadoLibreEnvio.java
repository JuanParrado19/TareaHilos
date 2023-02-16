public class MercadoLibreEnvio implements Runnable{
    @Override
    public void run() {

        System.out.println("Se esta procesando el envio");

        try {
            Thread.sleep(10000);

            System.out.println("El envio ha sido procesado");

            Thread.sleep(5000);

            System.out.println(" Se ha enviado el pedido ");

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
