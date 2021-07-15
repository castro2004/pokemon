import java.util.Random;

public class Ataque{

    String nombre_golpe;
    int damage;

    public Ataque(String nombre, int danio){
        nombre_golpe = nombre;                  //guardo el nombre de mi ataque
        Random numero = new Random();           //creo un objeto de tipo Random para generar numeros aleatorios
        int n = numero.nextInt(90-30+1) + 30;   //me da un numero random entre 30 y 90
        damage = danio + n;                     //el ataque sera el numero que recibo mas el numero random entre 30 y 90
    }
}

