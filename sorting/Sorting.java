/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;

/**
 *
 * @author sourav
 */
class apples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] intArray = {12, 21, -32, 36, 18, -9, 7, 3, -19};
        Arrays.sort(intArray);
        
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        
    }
    
}
