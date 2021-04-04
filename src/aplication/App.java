package aplication;
import entities.Forca;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marcio
 */
public class App {

    public static void main(String[] args) {

        Forca f = new Forca();
        Scanner sc = new Scanner(System.in);
       

        List<String> palavra_secreta = Arrays.asList("C", "A", "S" , "A");
        
        int sizePS = palavra_secreta.size();
        List<String> palavra_descoberta = new ArrayList<>(); 
        
        List<String> letras_digitadas= new ArrayList<>(); 
        
        
        for(int i = 0 ; i < palavra_secreta.size() ; i++){
            palavra_descoberta.add("_");
        }
        
        int indice_forca = 0;
        int qtd_tentativas = 7; 
        double score = 0;
        
        
        while(qtd_tentativas != 0) {
            
            List<Integer> indices = new ArrayList<>();
            
      
                            
            System.out.println("---------------JOGA DA FORCA---------------");
            System.out.println("                                SCORE: " + score);
            System.out.println(f.forcas(indice_forca)); 
            System.out.println("");
            System.out.println("Palavra: "  + palavra_descoberta);
            System.out.println("-------------------------------------------");
            
            
            if(palavra_secreta.equals(palavra_descoberta)){
                break;
            }

            System.out.println("É uma fruta de casca amarela");
            
            System.out.println("Letras digitadas: " + letras_digitadas);
            
            System.out.print("Letra: ");
            String letra_digitada = sc.nextLine();
            
            
            
            if (!palavra_secreta.contains(letra_digitada)){ 
                indice_forca = indice_forca + 1;
                System.err.println("Não Existe");
                qtd_tentativas --;
                
            }else if(letras_digitadas.contains(letra_digitada)){
                System.out.println("Letra ja digitada");
            }
            
            else if(palavra_secreta.contains(letra_digitada)){
                for(int j = 0 ;  j < palavra_secreta.size() ; j++){
                    if(palavra_secreta.get(j).equals(letra_digitada)){
                        indices.add(j);
                        score = score + 10;
                    }
                    
                }
                
               
                
            }
            
         
            
            letras_digitadas.add(letra_digitada);
            
            int indiceLetraDescberta = 0;
            for(int v = 0 ; v < indices.size() ; v++){
                indiceLetraDescberta = indices.get(v);
                palavra_descoberta.set(indiceLetraDescberta, letra_digitada);
            }
            
        }
        
        System.out.println("Fim de Jogo");  
     

        sc.close();

    }

}
