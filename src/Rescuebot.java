public class Rescuebot extends Autobot{
    public Rescuebot(String nombre, int fuerzaBase, int agilidadBase, int inteligenciaBase) {
        super(nombre, fuerzaBase, agilidadBase, inteligenciaBase);
    }

    @Override
    public double mejorarFuerza() {
        return fuerzaBase;
    }

    @Override
    public double mejorarAgilidad() {
        if (valor){
            return agilidadBase * 2;
        } else
            return agilidadBase;
    }

    @Override
    public double mejorarInteligencia() {
        if(valor){
            return  inteligenciaBase * 0.7;
        } else
            return inteligenciaBase;
    }
}
