
package classes;

import java.util.ArrayList;

public class Quina extends Loterias {
 
    
    //Atributos
    public ArrayList<Integer> dezenas = new ArrayList();
    
    
    //Getters and Setters
    
      public ArrayList<Integer> getDezenas() {
        return dezenas;
    }

    public void setDezenas(ArrayList<Integer> dezenas) {
        this.dezenas = dezenas;
    }
     
  
    @Override
    public boolean validacao(int valida) {
        if (valida < 1 || valida > 80){
            return false;
        }
        return true;
    }

    @Override
    public void setDezenas(int dezenas) {
        this.dezenas.add(dezenas);
    }

    @Override
    public int confere(ArrayList<Integer> aposta, ArrayList<Integer> jogo) {
        int cont = 0;
        for(int i = 0; i < aposta.size(); i++){
            for(int j = 0; j < jogo.size(); j++ ){
                if (aposta.get(i) == jogo.get(j)){
                    cont++;
                    
                }
            }
        }
        return cont;       
    }

    
}
