/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import java.util.ArrayList;

/**
 *
 * @author laboratorio
 */
public class Ordenacao {
    
    public static boolean emHeapMaximo(ArrayList<Integer> lista){
        int i = 0;
        int fe, fd;
        
        while ((i * 2) + 1 < lista.size()){
            fe = (i * 2) + 1;
            fd = (i * 2) + 2;
            
            if(lista.get(i) < lista.get(fe)){
                return false;
            }
            
            if(fd < lista.size()){
                if(lista.get(i) < lista.get(fd)){
                    return false;
                }
            }
            
            i += 1;
        }
        
        return true;
    }
}
