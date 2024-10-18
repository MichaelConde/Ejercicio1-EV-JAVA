
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class CalculosEmpleados {
    int categoria=0;
    double sueldo=0;
    double sueldototal=0;
    String nombre="";
    int numempleados=0;
 
Map<String, Double> empleados = new HashMap<>();


  //---------------------------------------------------------
    public void cantidadEmpleados(){
    numempleados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleado que va a llenar"));
    for (int i = 0; i < numempleados; i++) {
        infoEmpleado();
        EleccionCategoria();
        operaciones();
        insercionEmpleados();
       
    }
    imprimirLista();
    }

    //---------------------------------------------------------
    public void EleccionCategoria(){
        categoria= Integer.parseInt(JOptionPane.showInputDialog("Ingrese que a que categoria pertenece"));
        System.out.println("La categoria del empleado es: "+categoria);
    }
  //---------------------------------------------------------

    public void infoEmpleado(){

         nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
       
        System.out.println("El nombre del empleado es: "+nombre);
        System.out.println("El sueldo del empleado es: "+sueldo);
    }
  //---------------------------------------------------------
    
    public void operaciones(){
        switch (categoria) {
            case 1 -> sueldototal=sueldo+(sueldo*0.15)-(sueldo*0.2);
            case 2 -> sueldototal=sueldo+(sueldo*0.10)-(sueldo*0.015);
            case 3 -> sueldototal=sueldo+(sueldo*0.8)-(sueldo*0.1);
            case 4 -> sueldototal=sueldo+(sueldo*0.0)-(sueldo*0.0);
            default -> {
            }
        }
    }
  //---------------------------------------------------------
    public void insercionEmpleados(){
        empleados.put(nombre, sueldototal);
    }

    public void imprimirLista(){
        for (Map.Entry<String,Double> entrada : empleados.entrySet()) {
            System.out.println("Empleado: "+entrada.getKey()+" Sueldo Total"+entrada.getValue());
        }
    }
}

