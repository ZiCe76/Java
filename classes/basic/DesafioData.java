
public class DesafioData {
    int dia;
    int mes;
    int ano;

    DesafioData(int diaDado, int mesDado, int anoDado) {
        dia = diaDado;
        mes = mesDado;
        ano = anoDado;
    }
    DesafioData() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    String DataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
