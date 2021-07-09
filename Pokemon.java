import java.lang.Math;


public class Pokemon {
    String nombre;
    int vida;
    Tipo tipo; 
    int ataque;

    public Pokemon(String nombre, int tipo){
        this.nombre = nombre;
        this.tipo = new Tipo(tipo);
        vida = 100;
        ataque = (int)(Math.random() * (19) + 5);  
    }

    public String golpe(Pokemon atacante){
        
        return nombre + " recibio un golpe de " + atacante.getAtaque();
    }

    public int getAtaque(){
        return ataque;
    }

    public String toString(){
        return "Pokemon tipo " + tipo.getTipoString () + ", vida: " + vida + ", ataque: " + ataque + ", nombre: " + nombre;
    }


    

    
}