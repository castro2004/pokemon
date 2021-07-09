public class Batalla {

    public static void main(String[] args){
        System.out.println("Bienvenidos a la batalla pokemon!\n");
        Pokemon pikachu = new Pokemon("Pikachu", 3);
        Pokemon charmander = new Pokemon("Charmander", 2);
        Pokemon squirtle = new Pokemon("Squirtle", 1);

        System.out.println("Los combatientes el dia de hoy son: ");
        System.out.println(pikachu.toString());
        System.out.println(charmander.toString());
        System.out.println(squirtle.toString());

        int ataquePikachu = pikachu.getAtaque();
        int ataqueCharmander = charmander.getAtaque();
        int ataqueSquirtle = squirtle.getAtaque();

        System.out.println("Ataca " + squirtle.nombre + " con un ataque de " + ataqueSquirtle);
        charmander.golpe(ataqueSquirtle, squirtle.tipo.getTipo());
        System.out.println(charmander.toString());

        System.out.println("Ataca " + charmander.nombre + " con un ataque de " + ataqueCharmander);
        squirtle.golpe(ataqueCharmander, charmander.tipo.getTipo());
        System.out.println(squirtle.toString());
    }

}