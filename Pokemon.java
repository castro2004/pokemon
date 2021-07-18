import java.util.Random;

public class Pokemon {
    
    String nombre;
    int vida;
    Tipo claseTipo; //En la clase tipo tenemos defensa, 4 ataques, precision y debilidad.

    public Pokemon(String nombrePokemon, String tipoPokemon){ //que pasa si tipo=ELECTRICO o Electrico o electrico
        nombre = nombrePokemon;
        Random numero = new Random();   
        vida = numero.nextInt(500-300+1)+ 300; 
        //definir defensa
        int defensa = 100;
        double precision = 0.50;

        claseTipo = new Tipo(tipoPokemon.toLowerCase(), defensa, precision);
        //definir precision
        if(tipoPokemon.toLowerCase().equals("electrico")){
            claseTipo.agregarAtaque("ImpactTrueno", 15);
            claseTipo.agregarAtaque("ElectroBall", 20);
            claseTipo.agregarAtaque("ThunderWave", 18);
            claseTipo.agregarAtaque("Spark", 22);
        }
        if(tipoPokemon.toLowerCase().equals("agua")){
            claseTipo.agregarAtaque("Burbuja", 15);
            claseTipo.agregarAtaque("Pistola agua", 20);
            claseTipo.agregarAtaque("Hidropulso", 18);
            claseTipo.agregarAtaque("Hidrobomba", 22);
        }
        if(tipoPokemon.toLowerCase().equals("planta")){
            claseTipo.agregarAtaque("Latigo sepa", 15);
            claseTipo.agregarAtaque("Drenadoras", 20);
            claseTipo.agregarAtaque("Derribo", 18);
            claseTipo.agregarAtaque("Bomba Germen", 22);
        }
        if(tipoPokemon.toLowerCase().equals("fuego")){
            claseTipo.agregarAtaque("Lanzallamas", 15);
            claseTipo.agregarAtaque("Giro Fuego", 20);
            claseTipo.agregarAtaque("Infierno", 18);
            claseTipo.agregarAtaque("Cuchillada", 22*5);
        }
        if(tipoPokemon.toLowerCase().equals("volador")){
            claseTipo.agregarAtaque("Picoteo", 15);
            claseTipo.agregarAtaque("Ataque Ala", 20);
            claseTipo.agregarAtaque("Anticipo", 18);
            claseTipo.agregarAtaque("Tajo Aereo", 22);
        }
        
    }
    
    //crear un metodo para modificar la defensa en base al ataque(considerar tipo de pokemon y daño)
    public int caso_ataque(String tipoAtacante){  //"electrico"
        int caso = 0;
        if(claseTipo.nombre.equals("electrico") && tipoAtacante.toLowerCase().equals("agua")){ 
            System.out.print(claseTipo.nombre.equals("electrico " + "su defensa sera de: "  + claseTipo.defensa+45 + "y el poder de sus ataques de mi pokemon sera de " + claseTipo.getAtaque(0).damage*claseTipo.precision));                        
            caso = 1; 
        }  else if(claseTipo.nombre.equals("electrico") && tipoAtacante.toLowerCase().equals("fuego")){
            caso = 2;
        }   else if(claseTipo.nombre.equals("Volador") && tipoAtacante.toLowerCase().equals("electrico")){
            System.out.print(claseTipo.nombre.equals("electrico" + "su defensa sera de: "  + claseTipo.defensa+25 + "y el poder de sus ataques de mi pokemon sera de " + claseTipo.getAtaque(0).damage*claseTipo.precision));
            caso = 3;
        }   else if(claseTipo.nombre.equals("planta") && tipoAtacante.toLowerCase().equals("volador")){
            System.out.print(claseTipo.nombre.equals("volador" + "su defensa sera de: "  + claseTipo.defensa+15 + "y el poder de sus ataques de mi pokemon sera de " + claseTipo.getAtaque(0).damage*claseTipo.precision));
            caso = 4;
        }   else if(claseTipo.nombre.equals("agua") && tipoAtacante.toLowerCase().equals("planta")){
            System.out.print(claseTipo.nombre.equals("planta" + "su defensa sera de: "  + claseTipo.defensa+35 + "y el poder de sus ataques de mi pokemon sera de " + claseTipo.getAtaque(0).damage*claseTipo.precision));
            caso = 5;
        }   else if(claseTipo.nombre.equals("fuego") && tipoAtacante.toLowerCase().equals("planta")){
            System.out.print(claseTipo.nombre.equals("fuego" + "su defensa sera de: "  + claseTipo.defensa+35 + "y el poder de sus ataques de mi pokemon sera de " + claseTipo.getAtaque(0).damage*claseTipo.precision));
            caso = 6;
        }   else if(claseTipo.nombre.equals("agua") && tipoAtacante.toLowerCase().equals("fuego")){
            System.out.print(claseTipo.nombre.equals("agua" + "su defensa sera de: "  + claseTipo.defensa+50 + "y el poder de sus ataques de mi pokemon sera de " + claseTipo.getAtaque(0).damage*claseTipo.precision));
            caso = 7;   
        }   
        return caso; 
        }

        public void perdervida(int ataca){
            vida = vida-ataca;
        }

    

                
}       