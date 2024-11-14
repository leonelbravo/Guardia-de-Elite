public class Dinobot extends Autobot{
    public Dinobot(String nombre, int fuerzaBase, int agilidadBase, int inteligenciaBase) {
        super(nombre, fuerzaBase, agilidadBase, inteligenciaBase);
    }

    @Override
    public double mejorarFuerza() {
        if (valor){
            return fuerzaBase * 1.5;
        } else
            return fuerzaBase;
    }

    @Override
    public double mejorarAgilidad() {
        if (valor){
            return agilidadBase * 0.5;
        } else
            return agilidadBase;
    }

    @Override
    public double mejorarInteligencia() {
        return inteligenciaBase;
    }
}
