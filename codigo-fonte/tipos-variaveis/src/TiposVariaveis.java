public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
      byte numero1 = 100;
      short  numero2=numero1;
      numero1 = (byte) numero2;
      System.out.println(numero1);
    }
}
