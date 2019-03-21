/**
 *
 * @author sourav
 */
class apples{
    
    public static void main(String[] args){

// We will be using Radix sort to arrange strings	
        String[] stringArray = {"defa", "cade", "cemu", "babi", "acid", "soka", "abol", "zimo", "bbod"};
        System.out.println("This is a Radix Sort");
        
        radixSort(stringArray, 26, 4);
        
        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }
        
    }
    
    public static void radixSort(String[] input, int radix, int width){
        
        for(int i = width - 1; i >= 0; i--){
            radixSingleSort(input, i, radix);
        }
        
    }

    public static void radixSingleSort(String[] input, int position, int radix) {
        
        int numItems = input.length;
        
        int[] countArray = new int[radix];
        
        for(String value: input){
            countArray[getIndex(position, value)]++;
        }
                
        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j-1];
        }
        
        String[] temp = new String[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }
        
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
        
    }
    
    public static int getIndex(int position, String value){
        
        return value.charAt(position) - 'a';
        
    }    
}
