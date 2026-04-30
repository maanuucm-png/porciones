public class RecetarioMagico {
    public static void main(String[] args) {
        System.out.println("Encendiendo el fuego del caldero en ....");
        
        mostrarHoraActual();

        // Instanciamos y preparamos la poción
        PocionCuracion pocion = new PocionCuracion();
        pocion.preparar();
    }

    public static void mostrarHoraActual() {
        java.time.LocalTime hora = java.time.LocalTime.now();
        java.time.format.DateTimeFormatter formato = java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("La hora actual es: " + hora.format(formato));
    }
}
