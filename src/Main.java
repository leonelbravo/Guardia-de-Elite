public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia();

        Autobot autobot1 = new Dinobot("Grimlock", 160, 100, 60);
        Autobot autobot2 = new Rescuebot("Heatwave", 80, 180, 160);
        Autobot autobot3 = new Wrecker("Bulkhead", 200, 130, 90);
        Autobot autobot4 = new GuerreroAutobot("Optimus Prime", 200, 160, 200);
        Autobot autobot5 = new GuerreroAutobot("Bumblebee", 100, 100, 100);

        autobot1.valor = true;
        autobot2.valor = false;
        autobot3.valor = true;
        autobot4.valor = true;
        autobot5.valor = true;

        academia.agregarAutobot(autobot1);
        academia.agregarAutobot(autobot2);
        academia.agregarAutobot(autobot3);
        academia.agregarAutobot(autobot4);
        academia.agregarAutobot(autobot5);

        academia.mostrarPorRol();
        academia.mostrarResumenPorRol();
    }
}
