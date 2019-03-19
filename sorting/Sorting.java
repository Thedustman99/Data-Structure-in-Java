import java.util.Arrays;

/**
 *
 * @author sourav
 */
class apples {
    public static void main(String[] args) {        
        int[] intArray = {12, 21, -32, 36, 18, -9, 7, 3, -19};
        Arrays.sort(intArray);
        
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        
    }
    
}
