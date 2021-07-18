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
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice() = 1
      System.out.println("Nombre del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.ataques[0].nombre_golpe);
      System.out.println("Fuerza del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.ataques[0].damage);
      System.out.println("======================================================");// Aqui comienza mi segundo "ataque".
      Tipo MiTipo2 = new Tipo("agua", 5 , 0.55); 
      System.out.println("Cantidad de la defensa: " + MiTipo2.defensa);
      System.out.println("La precision de mi segundo ataque es: " + MiTipo2.precision);
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice = 0 
      System.out.println("======================================================");
      System.out.println("Vamos a crear un ataque para el tipo " + MiTipo.nombre);
      MiTipo.agregarAtaque("Burbuja", 16);
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice() = 0
      System.out.println("Nombre del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.getAtaque(1).nombre_golpe);
      System.out.println("Fuerza del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.getAtaque(1).damage);
      System.out.println("======================================================");
      Tipo MiTipo3 = new Tipo("agua", 5 , 0.80);
      System.out.println("Cantidad de la defensa: " + MiTipo3.defensa);
      System.out.println("La precision de mi primer ataque es de " +  MiTipo3.precision);
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice = 2     
      System.out.println("======================================================");
      //====================POKEMON====================
      System.out.println("Vamos a crear un nuevo pokemon");
      Pokemon pikachu = new Pokemon("pikachu", "Electrico");
      System.out.println("El nombre de mi pokemon es: " + pikachu.nombre);
      System.out.println("La vida de mi pokemon es: " + pikachu.vida);
      System.out.println("El tipo de mi pokemon " + pikachu.nombre + " es de :" + pikachu.claseTipo.nombre);
      System.out.println("La defensa de mi pokemon " + pikachu.nombre + " es de :" + pikachu.claseTipo.defensa);
      System.out.println("La precision de mi pokemon " + pikachu.nombre + " es de :" + pikachu.claseTipo.precision);
      System.out.println("Los Ataques de mi pokemon son: ");
      pikachu.claseTipo.printAllAtaques();
      //====================POKEMON 2====================
      System.out.println("======================================================");
      System.out.println("Vamos a crear un nuevo pokemon");
      Pokemon Squirtle = new Pokemon("Squirtle", "Agua");
      System.out.println("El nombre de mi pokemon es: " + Squirtle.nombre);
      System.out.println("La vida de mi pokemon es: " + Squirtle.vida);
      System.out.println("El tipo de mi pokemon " + Squirtle.nombre + " es de :" + Squirtle.claseTipo.nombre);
      System.out.println("La defensa de mi pokemon " + Squirtle.nombre + " es de :" + Squirtle.claseTipo.defensa);
      System.out.println("La presion de mi pokemon " + Squirtle.nombre + " es de :" + Squirtle.claseTipo.precision);
      System.out.println("Los Ataques de mi pokemon son: ");
      Squirtle.claseTipo.printAllAtaques();
      //====================POKEMON 3====================
      System.out.println("======================================================");
      System.out.println("Vamos a crear un nuevo pokemon");
      Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Planta");
      System.out.println("El nombre de mi pokemon es: " + Bulbasaur.nombre);
      System.out.println("La vida de mi pokemon es: " + Bulbasaur.vida);
      System.out.println("El tipo de mi pokemon " + Bulbasaur.nombre + " es de :" + Bulbasaur.claseTipo.nombre);
      System.out.println("La defensa de mi pokemon " + Bulbasaur.nombre + " es de :" + Bulbasaur.claseTipo.defensa);
      System.out.println("La precision de mi pokemon " + Bulbasaur.nombre + " es de :" + Bulbasaur.claseTipo.precision);
      System.out.println("Los Ataques de mi pokemon son: ");
      Bulbasaur.claseTipo.printAllAtaques();
      //====================POKEMON 4====================
      System.out.println("======================================================");
      System.out.println("Vamos a crear un nuevo pokemon");
      Pokemon Charmander = new Pokemon("Charmander", "Fuego");
      System.out.println("El nombre de mi pokemon es: " + Charmander.nombre);
      System.out.println("La vida de mi pokemon es: " + Charmander.vida);
      System.out.println("El tipo de mi pokemon " + Charmander.nombre + " es de :" + Charmander.claseTipo.nombre);
      System.out.println("La defensa de mi pokemon " + Charmander.nombre + " es de :" + Charmander.claseTipo.defensa);
      System.out.println("La precision de mi pokemon " + Charmander.nombre + " es de :" + Charmander.claseTipo.precision);
      System.out.println("Los Ataques de mi pokemon son: ");
      Charmander.claseTipo.printAllAtaques();
      //====================POKEMON 5====================
      System.out.println("======================================================");
      System.out.println("Vamos a crear un nuevo pokemon");
      Pokemon Swellow = new Pokemon("Swellow", "Volador");
      System.out.println("El nombre de mi pokemon es: " + Swellow.nombre);
      System.out.println("La vida de mi pokemon es: " + Swellow.vida);
      System.out.println("El tipo de mi pokemon " + Swellow.nombre + " es de :" + Swellow.claseTipo.nombre);
      System.out.println("La defensa de mi pokemon " + Swellow.nombre + " es de :" + Swellow.claseTipo.defensa);
      System.out.println("La precision de mi pokemon " + Swellow.nombre + " es de :" + Swellow.claseTipo.precision);
      System.out.println("Los Ataques de mi pokemon son: ");
      Swellow.claseTipo.printAllAtaques();


        while (pikachu.vida >0 && Bulbasaur.vida >0) {
          System.out.println("combatientes:");
          System.out.println("Mi pokemon 1 es: " + pikachu.nombre + " con una vida de  " + pikachu.vida );
          System.out.println("Mi pokemon 2 es: " + Bulbasaur.nombre + " con una vida de  " + Bulbasaur.vida );
          try{
            Thread.sleep(5000);
          }
          catch(InterruptedException e){
          }
          System.out.println("El turno de ataque es para: " + pikachu.nombre);
          Bulbasaur.perdervida(pikachu.claseTipo.getAtaque(1).damage);
          if(pikachu.vida <= 0){
            System.out.println(Bulbasaur.nombre + " fue derrotado.");
          } else{                     //aqui comienza el turno del segundo pokemon.
                  System.out.println("combatientes:");
                  System.out.println("Mi pokemon 1 es " + pikachu.nombre + " con una vida de: " + pikachu.vida );
                  System.out.println("Mi pokemon 2 es: " + Bulbasaur.nombre + " con una vida de  " + Bulbasaur.vida );
                  try{
                    Thread.sleep(5000);
                  }
                  catch(InterruptedException e){
                  }
                  if(pikachu.vida <= 0);
                  System.out.println(pikachu.nombre + " a sido derrotado");
          }
  
        }

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
