
package trabalholoteria;

import classes.Jogos;
import classes.MegaSena;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TrabalhoLoteria {

    public static void main(String[] args) throws FileNotFoundException {
         Scanner scn = new Scanner(System.in); 
        
        
        
        
        //Fazendo leitura dos arquivos CSV
        File megaCSV = new File("C:\\Users\\juhh\\Downloads\\mega.csv");
        File quinaCSV = new File("C:\\Users\\juhh\\Downloads\\quina.csv");
        File lotofacilCSV = new File("C:\\Users\\juhh\\Downloads\\lotofacil.csv");
        BufferedReader buffMega = new BufferedReader(new FileReader(megaCSV)); 
                
        ArrayList<Jogos> mList = new ArrayList(); //Array de Objetos do tipo Jogos MegaSena
        String line = "";
       
        //Split nas linhas do CSV, salvando no objeto e carregando lista de objetos MegaSena
        try {
           while((line = buffMega.readLine()) != null){
                
                Jogos mega = new Jogos();
                String[] c = line.split(","); //Array de String para separar cada linha do arquivo CSV
                mega.setConcurso(Integer.parseInt(c[0]));
                mega.setData(c[1]);
                for(int i = 2; i < 8; i++){
                mega.adcionar(Integer.parseInt(c[i]));
                }                       
                mList.add(mega);
            }
      } catch (Exception e) {
       }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        int opc = 0, opc1 = 0;
        boolean booAux;
        
        do {
            System.out.println("*****JOGOS LOTERICOS*****");
            System.out.println("***SELECIONE UMAS DAS OPÇÕES***");
           System.out.println("");
            System.out.println("1..........Mega Sena");
            System.out.println("2..........Quina");
            System.out.println("3..........Lotofácil");
            System.out.println("9..........Sair");
            System.out.println("");
            
            opc = scn.nextInt();
            System.out.println("");
            
            //OPÇÃO MEGA SENA/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (opc == 1){
                
                MegaSena jogoMega = new MegaSena(); //TESTE!!!! AQUI DEVE SER O FACTORY
                
                System.out.println("*****SELECIONE UMA DAS OPÇÕES*****");
                System.out.println("1..........5 números que mais sairam.");
                System.out.println("2..........5 números que menos sairam.");
                System.out.println("3..........Gerar números randomicos.");
                System.out.println("4..........Escolher minhas dezenas.");
                System.out.println("");
                
                opc1 = scn.nextInt();
                System.out.println("");
                
                //OPÇÃO 5 NUMEROS QUE MAIS SAIRAM
                if (opc1 == 1){
                    
                }
                
                //OPÇÃO 5 NUMEROS QUE MENOS SAIRAM
                if (opc1 == 2 ){
                    
                }
                
                //OPÇÃO GERAR RANDOMICOS
                if (opc1 == 3){
                    
                }
                
                //OPÇÃO ESCOLHER E TESTAR DEZENAS
                if (opc1 == 4){
                    int aux = 0;
                    System.out.println("JOGO SELECIONADO: MEGA SENA");
                    System.out.println("AS DEZENAS DEVEM ESTAR ENTRE 1 E 60");
                    System.out.println("");
                    
                    for(int i = 0; i < 6; i++){
                        System.out.println((i + 1) +"ª Dezena: ");
                        aux = scn.nextInt();
                        booAux = jogoMega.validacao(aux);
                        if(booAux){
                        jogoMega.setDezenas(aux);
                        }else {
                            System.out.println("ERRO: SUAS DEZENAS DEVEM ESTAR ENTRE 1 E 60");
                            System.out.println("INFORME NOVAMENTE A DEZENA");
                            i--;
                        }
                       
                    }
                    
                    System.out.println(jogoMega.getDezenas());
                    
                }
               int acerto = 0; 
                for(int i = 0; i < mList.size(); i++){
                    acerto = jogoMega.confere(jogoMega.getDezenas(), mList.get(i).getDezenas());
                    
                    switch (acerto){
                        case 4:
                            System.out.println("No concurso de número: " + mList.get(i).getConcurso());
                            System.out.println("Data: " + mList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou na QUADRA!!");
                            System.out.println("");
                            break;
                            case 5:
                            System.out.println("No concurso de número: " + mList.get(i).getConcurso());
                            System.out.println("Data: " + mList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou na QUINA!!");
                            System.out.println("");
                            break;
                            case 6:
                            System.out.println("No concurso de número: " + mList.get(i).getConcurso());
                            System.out.println("Data: " + mList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou na MEGA!!");
                            System.out.println("");
                            break;
                    }
                    
                    
                  }
                
                
            }
            
            //OPÇÃO QUINA/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (opc == 2){
                
            }
           
            //OPÇÃO LOTOFACIL/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (opc == 3){
                
            }
            
            if (opc == 9){
                System.out.println("*****JOGO FINALIZADO*****");
            }
            
        }while(opc != 9);
        
        
        
   }
  
}

