public class Wrecker extends Autobot {
    public Wrecker(String nombre, int fuerzaBase, int agilidadBase, int inteligenciaBase) {
        super(nombre, fuerzaBase, agilidadBase, inteligenciaBase);
    }

    @Override
    public double mejorarFuerza() {
        if (valor){
            return fuerzaBase * 1.4;
        } else {
            return fuerzaBase;
        }
    }

    @Override
    public double mejorarAgilidad() {
            return agilidadBase;
    }

    @Override
    public double mejorarInteligencia() {
        if (valor){
            return inteligenciaBase * 0.7;
        } else
            return inteligenciaBase;
    }
}
