public class GuerreroAutobot extends Autobot{
    public GuerreroAutobot(String nombre, int fuerzaBase, int agilidadBase, int inteligenciaBase) {
        super(nombre, fuerzaBase, agilidadBase, inteligenciaBase);
    }

    @Override
    public double mejorarFuerza() {
        if (valor){
            return fuerzaBase + 10;
        } else
            return fuerzaBase;
    }

    @Override
    public double mejorarAgilidad() {
        if (valor){
            return agilidadBase + 10;
        } else
            return agilidadBase;
    }

    @Override
    public double mejorarInteligencia() {
        if (valor){
            return inteligenciaBase + 10;
        } else
            return inteligenciaBase;
    }
}
