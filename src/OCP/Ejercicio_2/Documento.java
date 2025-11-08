package OCP.Ejercicio_2;

abstract class Documento {
    public abstract void exportar();

}

class PDF  extends Documento {
    @Override
    public void exportar() {
        System.out.println("Exportando documento en formato PDF");
    }
}

class Word extends Documento {
    @Override
    public void exportar() {
        System.out.println("Exportando documento en formato Word");
    }
}

