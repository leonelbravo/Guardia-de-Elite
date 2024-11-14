public abstract class Autobot {
    protected String nombre;
    protected int fuerzaBase;
    protected int agilidadBase;
    protected int inteligenciaBase;
    protected boolean valor;
    protected String rol;

    public Autobot(String nombre, int fuerzaBase, int agilidadBase, int inteligenciaBase) {
        this.nombre = nombre;
        this.fuerzaBase = fuerzaBase;
        this.agilidadBase = agilidadBase;
        this.inteligenciaBase = inteligenciaBase;
        this.valor = valor;
    }

    public abstract double mejorarFuerza();
    public abstract double mejorarAgilidad();
    public abstract double mejorarInteligencia();


    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Rol: " + rol);

        System.out.println("Estadísticas Base:");
        System.out.println("  Fuerza: " + fuerzaBase);
        System.out.println("  Agilidad: " + agilidadBase);
        System.out.println("  Inteligencia: " + inteligenciaBase);

        if (valor) {
            System.out.println("Estadísticas Mejoradas:");
            System.out.println("  Fuerza: " + mejorarFuerza());
            System.out.println("  Agilidad: " + mejorarAgilidad());
            System.out.println("  Inteligencia: " + mejorarInteligencia());
        } else {
            System.out.println("Estadísticas Mejoradas: No aplica (Valor en false)");
        }

        System.out.println("Valor: " + valor);
    }
}

