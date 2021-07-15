  public class Batalla {

    public static void main(String[] args){
      //=================ATAQUE==================
      System.out.println("Vamos a probar la clase ataque");
      Ataque prueba = new Ataque("Impact Trueno", 10); //creamos un objeto de tipo Ataque llamado prueba
      System.out.println("Nombre del ataque: " + prueba.nombre_golpe);
      System.out.println("Fuerza del ataque: " + prueba.damage);
      //=================ATAQUE==================
      System.out.println("\n\n");
      //=================TIPO==================
      System.out.println("Vamos a probar la clase tipo"); // Aqui comienza mi primer ataque
      Tipo MiTipo = new Tipo("agua", 5 , 0.75);
      System.out.println("Nombre del tipo:" + MiTipo.nombre);
      System.out.println("Cantidad de la defensa: " + MiTipo.defensa);
      System.out.println("La precision es: " + MiTipo.precision);
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice() = 0
      System.out.println("======================================================");
      System.out.println("Vamos a crear un ataque para el tipo " + MiTipo.nombre);
      MiTipo.agregarAtaque("Tail Whip", 10);
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice() = 0
      System.out.println("Nombre del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.ataques[0].nombre_golpe);
      System.out.println("Fuerza del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.ataques[0].damage);
      System.out.println("======================================================");// Aqui comienza mi segundo ataque.
      Tipo MiTipo2 = new Tipo("agua", 5 , 0.55); 
      System.out.println("Nombre del tipo:" + MiTipo2.nombre);
      System.out.println("Cantidad de la defensa: " + MiTipo2.defensa);
      System.out.println("La precision de mi segundo ataque es: " + MiTipo2.precision);
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice = 1 
      System.out.println("======================================================");
      System.out.println("Vamos a crear un ataque para el tipo " + MiTipo.nombre);
      MiTipoN.agregarAtaque("Burbuja", 16);
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice() = 0
      System.out.println("Nombre del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.ataques[1].nombre_golpe);
      System.out.println("Fuerza del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.ataques[1].damage);

      // System.out.println("uso de arreglos");
      //probar con arreglo de strings
      // String[] listado = new String[6]; //arreglo de 6 strings
      //1 guardar por posicion
      // listado[0] = "Hola";
      // listado[1] = "Me";
      // listado[2] = "llamo";
      // listado[3] = "YON";

      //2 obtener objeto en un arreglo
      // int i = 4;
      // System.out.println("Objeto almacenado en la posicion " + i + ": " + listado[i]);

      //3recorrer todo el arreglo
      // for(int j=0;j<listado.length;j++){
      //   System.out.println("Objeto almacenado en la posicion " + j + ": " + listado[j]);
      // }

      //4 Si yo quiero saber que posicion esta disponible (sin datos)
      // int posicionLibre=0;
      // for(int j=0;j<listado.length;j++){
      //   if(listado[j] == null){
      //     posicionLibre = j;
      //     break;
      //   }
      // }
      // System.out.println("La posicion " + posicionLibre + " no tiene nada, ahi puede escribir");

    }

  }
