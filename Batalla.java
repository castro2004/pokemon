public class Batalla {

  public static void main(String[] args){
    System.out.print("Ingrese su nombre de usuario ");
    Scanner sn = new Scanner(System.in);
      String nombre = leer.nextLine();
      System.out.print("Hola " + nombre + "tus pokemones son");  
      boolean salir = false;
      int opcion;

      while(salir) {

        System.out.println("1. Inscribir a un maestro pokemon");
        System.out.println("2. Administrar perfil del maestro pokemon");
        System.out.println("3. Pelear");
        System.out.println("4. Salir");

        System.out.println("Escribir una de las opciones");
        opcion = sn.nextInt();

        System.out.println("Bienvenidos a la batalla pokemon!\n");
        Pokemon pikachu = new Pokemon("pikachu", 4);
        Pokemon Luxray = new Pokemon("Luxray", 4);
        Pokemon Jolteon = new Pokemon("Jolteon ", 4);
        Pokemon charmander = new Pokemon("Charmander", 2);
        Pokemon Vulpix = new Pokemon("Vulpix", 2);
        Pokemon squirtle = new Pokemon("Squirtle", 1);
        Pokemon Totodile = new Pokemon("Totodile", 1);
        Pokemon Pansage = new Pokemon("Pansage", 3);
        Pokemon Pidgeot = new Pokemon("Pidgeot", 3);

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

        int ataquePikachu = pikachu.getAtaque();
        int ataqueLuxray = Luxray.getAtaque();
        int ataqueJolteon = Jolteon.getAtaque();
        int ataqueCharmander = charmander.getAtaque();
        int ataqueVulpix = Vulpix.getAtaque();
        int ataqueSquirtle = squirtle.getAtaque();
        int ataqueTotodile = Totodile.getAtaque();
        int ataquePansage = Pansage.getAtaque();
        int ataquePidgeot = Pidgeot.getAtaque();

        System.out.println("Ataca " + squirtle.nombre + " con un ataque de " + ataqueSquirtle);
        charmander.golpe(squirtle);
        System.out.println(charmander.toString());

        System.out.println("Ataca " + charmander.nombre + " con un ataque de " + ataqueCharmander);
        squirtle.golpe(charmander);
        System.out.println(squirtle.toString());
      
        }
      }
    } 
  }
}