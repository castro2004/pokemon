public class Tipo {
    String nombre;
    int defensa;
    Ataque[] ataques=new Ataque[4]; //son 4 ataques los que debe tener. No se crean en el constructor
    double precision; //precision es un porcentaje del ataque. Por ejemplo, ataque de 50 y una precision del 50% = ataque de 25

    public Tipo(String nombreTipo, int defensaTipo, double precisionTipo){
        nombre = nombreTipo;
        defensa = defensaTipo;
        precision = precisionTipo;
    }

    public int indice(){
        int posicionLibre=0;
        for(int j=0;j<ataques.length;j++){
            if(ataques[j] == null){
            posicionLibre = j;
            break;
            }
        }
        return posicionLibre;
    }


    
}
