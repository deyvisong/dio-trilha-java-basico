public class Usuario {
  public static void main(String[] args) throws Exception {

    SmartTv smartTv = new SmartTv();



    System.out.println("TV Ligada ? " + (smartTv.ligada ? "Ligada" : "Desligada"));
    System.out.println("Canal Atual : " + smartTv.canal);
    System.out.println("Volume Atual : " + smartTv.volume);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    System.out.println("Volume Atual : " + smartTv.volume);
    smartTv.mudarCanal(13);
    System.out.println("Canal Atual : " + smartTv.canal);

    smartTv.ligar ();
    System.out.println("TV Ligada ? " + (smartTv.ligada ? "Ligada" : "Desligada"));

    smartTv.desligar();
    System.out.println("Tv ligada ? " + (smartTv.ligada ? "Ligada" : "Desligada"));

  }
}
