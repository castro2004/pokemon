public class Batalla {

  public static void main(String[] args){
      System.out.println("Bienvenidos a la batalla pokemon!\n");
      P pikachu = new Pokemon("pikachu", 4);
      P Luxray = new Pokemon("Luxray", 4);
      P Jolteon = new Pokemon("Jolteon ", 4);
      P charmander = new Pokemon("Charmander", 2);
      P Vulpix = new Pokemon("Vulpix", 2);
      P squirtle = new Pokemon("Squirtle", 1);
      P Totodile = new Pokemon("Totodile", 1);
      P Pansage = new Pokemon("Pansage", 3);
      P Pidgeot = new Pokemon("Pidgeot", 3);

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