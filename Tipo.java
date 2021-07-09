public class Tipo{
    int tipo; //1=Agua, 2=Fuego, 3=Planta, 4=Electrico, 5=Volador
    int debilidad; 
    int debilidad2; 

    public Tipo(int tipo){
        this.tipo = tipo;
        if(tipo==1){
            debilidad = 2;
            debilidad2 = 0;
        } else if (tipo == 2){
            debilidad = 3;
            debilidad2 = 0;
        } else if (tipo == 3){
            debilidad = 1;
            debilidad2 = 0;
        } else if (tipo == 4){
            debilidad = 1;
            debilidad2 = 5;
        } else if (tipo == 5){
            debilidad = 3;
            debilidad2 = 0;
        }
    }

    public int getTipo(){
        return tipo;
    }

    public String getTipoString(){
        String tipoPokemon="";
        if(tipo == 1){
            tipoPokemon = "Agua";
        } else if (tipo == 2){
            tipoPokemon = "Fuego";
        } else if (tipo == 3){
            tipoPokemon = "Planta";
        } else if (tipo == 4){
            tipoPokemon = "Electrico";
        } else if (tipo == 5){
            tipoPokemon = "Volador";
        }
        return tipoPokemon;
    }



}