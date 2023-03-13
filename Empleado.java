public class Empleado  extends Persona{
    private int numEmpleado;
    private String cargo;
    private double salario;
    private double antiguedadEmpl;
    private double vacaciones;

    public Empleado(int numId, String nombre) {
        super(numId, nombre);
        this.numEmpleado = numEmpleado;
        this.cargo = cargo;
        this.salario= salario;
        this.antiguedadEmpl= antiguedadEmpl;
        this.vacaciones= vacaciones;
    }

}
