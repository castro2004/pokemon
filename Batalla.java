import java.util.scanner;
public class Batalla {

  public static void main(String[] args){
      Sistem .out.println("Nombre jugador 1");
      String nombre = leer.nextLine();
      int seleccionar_opcion = 0;
      int numero1 = 0;
      int numero2 = 0;
      int resultado = 0;

      do{

        System.out.println("\n");
        System.out.println("Seleccionar opcion: ");
        System.out.println("Opcion 1");
        System.out.println("Opcion 2");
        System.out.println("Opcion 3");
        seleccionar_opcion = leer.nextInt();

        if(seleccionar_opcion !=5){
          System.out.println("ingrese usuario 1: ");
          usuario1 = leer.nextInt();
        
        
        }

        switch (seleccionar_opcion) {
          case 1:
                  seleccionar_opcion = 1;
                  resultado = numero1;
                  System.out.println("sus pokemones son" + pikachu + Luxray + Jolteon);
            break;
        
          default:
            break;
          }
        }

      }
      System.out.println("Bienvenidos a la batalla pokemon!")
      Pokemon pikachu = new Pokemon("pikachu", 4);
      Pokemon Luxray = new Pokemon("Luxray", 4);
      Pokemon Jolteon = new Pokemon("Jolteon ", 4);
      Pokemon charmander = new Pokemon("Charmander", 2);
      Pokemon Vulpix = new Pokemon("Vulpix", 2);
      Pokemon squirtle = new Pokemon("Squirtle", 1);
      Pokemon Totodile = new Pokemon("Totodile", 1);
      Pokemon Pansage = new Pokemon("Pansage", 3);
      Pokemon Pidgeot = new Pokemon("Pidgeot", 3);
      Pokemon Snorlax = new Pokemon("Snorlax", 3);

        System.out.println("Los combatientes el dia de hoy son: ");
        System.out.println(pikachu.toString());
        System.out.println(Luxray.toString());
        System.out.println(Jolteon.toString());
        System.out.println(charmander.toString());
        System.out.println(Vulpix.toString());
        System.out.println(squirtle.toString());
        System.out.println(Totodile.toString());
        System.out.println(Pansage.toString());
        System.out.println(Pidgeot.toString());
        System.out.println(Snorlax.toString());        

        int ataquePikachu = pikachu.getAtaque();
        int ataqueLuxray = Luxray.getAtaque();
        int ataqueJolteon = Jolteon.getAtaque();
        int ataqueCharmander = charmander.getAtaque();
        int ataqueVulpix = Vulpix.getAtaque();
        int ataqueSquirtle = squirtle.getAtaque();
        int ataqueTotodile = Totodile.getAtaque();
        int ataquePansage = Pansage.getAtaque();
        int ataquePidgeot = Pidgeot.getAtaque();
        int ataqueSnorlax = Snorlax.getAtaque();

        System.out.println("Ataca " + squirtle.nombre + " con un ataque de " + ataqueSquirtle);
        charmander.golpe(squirtle);
        System.out.println(charmander.toString());

        System.out.println("Ataca " + charmander.nombre + " con un ataque de " + ataqueCharmander);
        squirtle.golpe(charmander);
        System.out.println(squirtle.toString());

    }
  }
    
  
}