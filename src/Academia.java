import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Autobot> guardiaElite;
    private List<Autobot> ingenieros;
    private List<Autobot> infanteria;

    public Academia() {
        guardiaElite = new ArrayList<>();
        ingenieros = new ArrayList<>();
        infanteria = new ArrayList<>();
    }

    public void asignarRol(Autobot autobot) {
        double fuerzaMejorada = autobot.mejorarFuerza();
        double agilidadMejorada = autobot.mejorarAgilidad();
        double inteligenciaMejorada = autobot.mejorarInteligencia();

        if (autobot.valor && fuerzaMejorada > 150 && agilidadMejorada > 150 && inteligenciaMejorada > 150) {
            guardiaElite.add(autobot);
            autobot.rol = "Guardia de Élite";
        } else if (inteligenciaMejorada >= 150 && fuerzaMejorada > 120) {
            ingenieros.add(autobot);
            autobot.rol = "Ingeniero de Puentes Espaciales";
        } else {
            infanteria.add(autobot);
            autobot.rol = "Infantería Autobot";
        }
    }

    public void mostrarPorRol() {
        System.out.println("Guardia de Élite:");
        for (Autobot autobot : guardiaElite) {
            autobot.mostrarInformacion();
            System.out.println();
        }

        System.out.println("Ingenieros de Puentes Espaciales:");
        for (Autobot autobot : ingenieros) {
            autobot.mostrarInformacion();
            System.out.println();
        }

        System.out.println("Infantería Autobot:");
        for (Autobot autobot : infanteria) {
            autobot.mostrarInformacion();
            System.out.println();
        }
    }
    public void mostrarResumenPorRol() {
        System.out.println("Resumen de la Guardia de Élite:");
        System.out.println("Total de Autobots: " + guardiaElite.size());
        for (Autobot autobot : guardiaElite) {
            System.out.println("  - " + autobot.nombre);
        }

        System.out.println("\nResumen de Ingenieros de Puentes Espaciales:");
        System.out.println("Total de Autobots: " + ingenieros.size());
        for (Autobot autobot : ingenieros) {
            System.out.println("  - " + autobot.nombre);
        }

        System.out.println("\nResumen de Infantería Autobot:");
        System.out.println("Total de Autobots: " + infanteria.size());
        for (Autobot autobot : infanteria) {
            System.out.println("  - " + autobot.nombre);
        }
    }
    public void agregarAutobot(Autobot autobot) {
        asignarRol(autobot);
    }
}
