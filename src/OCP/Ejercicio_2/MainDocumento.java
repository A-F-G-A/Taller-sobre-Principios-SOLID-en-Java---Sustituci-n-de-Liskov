package OCP.Ejercicio_2;

public class MainDocumento {
    public static void main(String[] args) {
        Documento pdf = new PDF();
        pdf.exportar();

        Documento word = new Word();
        word.exportar();
    }
}
