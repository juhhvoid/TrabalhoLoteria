
package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MegaSena extends Loterias {
 
    
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
        if (valida < 1 || valida > 60){
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

    @Override
    public void randomicos() {
        int find = 0;
        int c, i = 0; 
        ArrayList num = new ArrayList();
        Random rdm = new Random();

//construindo o array sem repetição
        for (i = 0; i < 6; i++) {
            find = rdm.nextInt(60) + 1;
            if (i == 0) {
                num.add(find);
            } else {
                c = 0;
                while (c < i) {
                    if (num.get(c).equals(find)) {
                        find = rdm.nextInt(6) + 1;
                        c = 0;
                    } else {
                        c++;
                    }
                }
                num.add(find);
            }
            //Ordenando a lista
            Collections.sort(num);
        }
        //imprimindo a lista
        System.out.println("AQUI ESTÁ SEU JOGO ALEATORIO DA MEGA SENA");
        System.out.print(num);
        System.out.println("");
        System.out.println("");
    }

    
}
