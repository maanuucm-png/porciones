public class PocionCuracion {
    
    public PocionCuracion() {
    }

    public void preparar() {
        System.out.println("--- Preparando Poción de Curación ---");
        System.out.println("Ingrediente 1: 2 hojas de menta fresca.");
        System.out.println("Ingrediente 2: 1 lágrima de fénix.");
        System.out.println("Instrucciones: Remover en el sentido de las agujas del reloj.");
        System.out.println("Resultado: ¡Poción lista! +123 HP.");
        System.out.println("Nuevo metodo");

    }

    @Override
    public String toString() {
        return "PocionCuracion []";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
}