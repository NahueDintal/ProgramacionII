import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Imprimir del 1 al 100");
    for (int i = 1; i <= 10; i++) {
      System.out.println("i = " + i);
    }
    System.out.println("Imprimir los paresd del 0 al 50");
    for (int i = 0; i <= 50; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    System.out.println("sumar del 1 al 100 e imprimir el resultado");
    int suma = 0;
    for (int i = 1; i <= 100; i++) {
      suma += i;
    }
    System.out.println("El resultado es: " + suma);
    // System.out.println("While");
    // System.out.println("Cuenta regresiva del 5 al 1 y ¡Despegue!");
    // while ( true ) {
    // for (int i = 5; i > 0; i--) {
    // System.out.println(i);
    // }
    // System.out.println("Despegue!!!");
    // return;
    // }
    System.out.println("Validación de contraseña, pedir al usuario contraseña y verififcar que sea correcta");
    while (true) {
      String usuario = "Pancho";
      String clave = "Villa123";
      System.out.println("Ingrese usuario: ");
      Scanner sc = new Scanner(System.in);
      String ingresoUsuario = sc.nextLine();
      if (usuario.equals(ingresoUsuario)) {
        System.out.println("Bienvenido " + usuario);
      } else {
        System.out.println("Usuario no encontrado...");
      }
      System.out.println("Ingresar la contraseña: ");
      String ingresoClave = sc.nextLine();
      if (clave.equals(ingresoClave)) {
        System.out.println("Clave Correcta, buena jornada!!");
      } else {
        System.out.println("Clave Incorrecta...");
      }
      sc.close();
      continue;
    }
    // System.out.println("Adivinar un numero, detener el ciclo cuando el numero sea
    // ingresado igal al condicional");
  }
}
