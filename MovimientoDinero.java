public class MovimientoDinero {
    private double montoDinero;
    private String conceptoMovimiento;

    public MovimientoDinero(double montoDinero, String conceptoMovimiento) {
        this.montoDinero = montoDinero;
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public double getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(double montoDinero) {
        this.montoDinero = montoDinero;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public double montos(){
        return 0;
    }

    public String tipoUsuario(){
        return "";
    }
}
