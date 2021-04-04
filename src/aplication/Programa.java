/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import com.sun.corba.se.spi.oa.OADefault;
import entities.Forca;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.StringBuilder;

/**
 *
 * @author Marcio
 */
public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> palavra_secrete = Arrays.asList("B", "A", "N", "A", "N", "A");
        ArrayList<String> palavra_descoberta = new ArrayList<>();

        for (int i = 0; i < palavra_secrete.size(); i++) {
            palavra_descoberta.add(i, "_");

        }

        int qtd_tentativas = 10;

        while (qtd_tentativas != 0) {
            
            ArrayList<String> digitadas = new ArrayList<>();
            

            System.out.println(palavra_descoberta);

            System.out.print("DigiTe uma letra: ");
            String letra = sc.nextLine();
            
            digitadas.add(letra);
            
            
            qtd_tentativas--;
     
            
            ArrayList <Integer> v = new ArrayList<>();
            
            
            
            if(palavra_secrete.contains(letra)){
              
                            
            for(int i = 0;  i < palavra_secrete.size(); i++) {
                if(palavra_secrete.get(i).equals(letra)){
                    v.add(i);
                }
            }
            
            }else if(digitadas.contains(letra)){
                System.out.println("Já existe");
            }
            
            else{
                System.out.println("Não existe");
            }

            
            for (int i = 0 ; i<v.size() ; i++){
                int teste = v.get(i);
                palavra_descoberta.set(teste, letra);
            }
            
            
        }

    }

}// FIM MAIN

