public class DesafioDataContrutorTeste {
    public static void main(String[] args) {
        DesafioData d1 = new DesafioData(1, 4, 2007);
        DesafioData d2 = new DesafioData();
        
        System.out.println(d1.DataFormatada());
        System.out.println(d2.DataFormatada());
    }
}
