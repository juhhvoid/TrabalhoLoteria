
package classes;

import java.util.ArrayList;

public abstract class Loterias {
    
    public abstract boolean validacao(int valida); //verifica se números digitados estão dentro dos parâmetros
    public abstract void setDezenas(int dezenas); //seta as dezenas
    public abstract int confere(ArrayList<Integer> aposta, ArrayList<Integer> jogo); //Confere o jogo do apostador
    
    
    
    
}
