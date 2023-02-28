public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada" + smartTv.ligada);
        System.out.println("Canal atual :" +smartTv.canal);
        System.out.println("Volume atual :" +smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status  -> Tv ligada is " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Desligada is " + smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println("Novo Status de volume -->" + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal : " + smartTv.canal);


    }
}


