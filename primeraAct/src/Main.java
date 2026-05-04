import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // System.out.println("Imprimir del 1 al 100");
    // for (int i = 1; i <= 10; i++) {
    // System.out.println("i = " + i);
    // }
    // System.out.println("Imprimir los paresd del 0 al 50");
    // for (int i = 0; i <= 50; i++) {
    // if (i % 2 == 0) {
    // System.out.println(i);
    // }
    // }
    // System.out.println("sumar del 1 al 100 e imprimir el resultado");
    // int suma = 0;
    // for (int i = 1; i <= 100; i++) {
    // suma += i;
    // }
    // System.out.println("El resultado es: " + suma);
    // System.out.println("While");
    // System.out.println("Cuenta regresiva del 5 al 1 y ¡Despegue!");
    // int contador = 5;
    // while (contador != 0) {
    // System.out.println(contador);
    // contador--;
    // }
    // System.out.println("Despegue!!!");
    // System.out.println("Validación de contraseña, pedir al usuario contraseña y
    // verififcar que sea correcta");
    // boolean estado = false;
    // while (estado == false) {
    // Scanner sc = new Scanner(System.in);
    //
    // String usuario = "Pancho";
    // String clave = "Villa123";
    //
    // System.out.print("Ingrese usuario: ");
    // String ingresoUsuario = sc.nextLine();
    //
    // if (usuario.equals(ingresoUsuario)) {
    // System.out.println("Bienvenido " + usuario);
    // } else {
    // System.out.println("Usuario no encontrado...");
    // }
    //
    // System.out.print("Ingresar la contraseña: ");
    // String ingresoClave = sc.nextLine();
    // if (clave.equals(ingresoClave)) {
    // System.out.println("Clave Correcta, buena jornada!!");
    // estado = true;
    // } else {
    // System.out.println("Clave Incorrecta...");
    // }
    // sc.close();
    // }
    //
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Adivinar un numero, detener el ciclo cuando el numero
    // ingresado sea igual al condicional");
    // int numero = 5;
    // int intento = 0;
    // boolean estado = false;
    // while (estado == false) {
    // System.out.print("Ingresa un numero del 1 al 10: ");
    // intento = sc.nextInt();
    // if (intento == numero) {
    // estado = true;
    // System.out.println("Adivinaste!!");
    // }
    // }
    //
    // // Do while
    // "Menú Simple (Una Vez Garantizada): Imprime un menú de opciones al menos
    // una vez, y luego pregunta si el usuario quiere verlo de nuevo.
    // El bucle continúa si el usuario lo desea.");
    //
    // int opcion = 0;
    // do {
    // System.out.println("1.Siguiente...");
    // System.out.println("2.Omitir...");
    // System.out.println("3.Menú anterior...");
    // System.out.println("4.Salir...");
    // System.out.print("Opcion: ");
    // opcion = sc.nextInt();
    // switch (opcion) {
    // case 1:
    // continue;
    // case 2:
    // continue;
    // case 3:
    // continue;
    // case 4:
    // System.out.println("Saliendo...");
    // }
    // } while (opcion != 4);
    //
    // Solicitar Número Positivo: Pide al usuario que ingrese un número, y sigue
    // pidiéndolo hasta que ingrese un número positivo.
    // double numeroPositivo = 0;
    // do {
    // System.out.print("Ingresa un numero positivo: ");
    // numeroPositivo = sc.nextDouble();
    // if (numeroPositivo <= 0) {
    // System.out.println("Por favor, ingresa un numero entero positivo.");
    // } else {
    // System.out.println("Chas Gracias!!");
    // }
    // } while (numeroPositivo <= 0);
    //
    // Contador Mínimo: Imprime números del 1 al 3. Asegura que al menos el 1 se
    // imprima, incluso si la condición del while se cumple desde el principio.
    // int contadorBucle = 1;
    // do {
    // System.out.println(contadorBucle);
    // contadorBucle++;
    // } while (contadorBucle <= 3);
    //
    // // Tablas de Multiplicar (del 1 al 5): Usa un bucle externo (for) para iterar
    // por
    // las tablas del 1 al 5, y un bucle interno (for, while o do-while) para
    // calcular e
    // imprimir cada multiplicación (del 1 al 10).

    for (int tabla = 1; tabla <= 5; tabla++) {
      for (int multiplo = 1; multiplo <= 10; multiplo++) {
        int resultado = tabla * multiplo;
        System.out.println(tabla + " x " + multiplo + " = " + resultado);
      }
    }

    // sc.close();

  }
}
