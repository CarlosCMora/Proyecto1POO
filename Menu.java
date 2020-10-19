import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Menu
 */
public class Menu {

    public static void main(String[] args) {
        int menu;
        Scanner sc = new Scanner(System.in);
        List <Alumno>listAlumnos = new ArrayList<Alumno>();
        List <Profesor>listProfesors = new ArrayList<Profesor>();
        do{
            System.out.println("Bienvenido al sistema de inscripcion");
            System.out.println("1)Alumnos");
            System.out.println("2)Profesores");
            System.out.println("3)Servicio Escolar");
            System.out.println("4)Salir");
            menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:  
                    menuAlumno(listAlumnos);
                    break;
                
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;
            
                default:
                    break;
            }
        }while(menu!=4);
    }
    //Ingresa a las opciones que puede ejecutar un Alumno
    public static void menuAlumno() {
        int menu;
        Scanner sc = new Scanner(System.in);
        //Funcion para login o registrarse
        int indexAlu = login();
        do {
            System.out.println("Portal del alumno");
            System.out.println("1)Mostrar datos");
            System.out.println("2)Inscribirse");
            System.out.println("3)Darse de baja");
            System.out.println("4)Regresar");
            menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:  
                    listAlumnos[indexAlu].print();
                    break;
                
                case 2:

                    break;
                case 3:
                    
                    break;

                case 4:
                    System.out.println("Hasta pronto");
                    break;
            
                default:
                    break;
            }
        } while (menu!=4);
    }
    //Profesor
    System.out.println("Portal del profesor");
    System.out.println("1)Mostrar datos");
    System.out.println("2)Dar de alta grupo");
    System.out.println("3)Darse de baja");
    System.out.println("4)Regresar");


    //Servicios Escolares
    System.out.println("Portal del servicio escolar");
    System.out.println("1)Mostrar asignaturas");//tree
    System.out.println("2)Dar de alta asignatura");
    System.out.println("3)Dar de baja asignatura");
    System.out.println("4)Regresar");
    //Crea un objeto de tiopo alumno y lo agrega a la lista de alumnos.
    public static void crearAlumno(){

    }
}