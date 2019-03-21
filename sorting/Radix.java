/**
 *
 * @author sourav
 */
class apples{
    
    public static void main(String[] args){

// It says that it can sort the numbers faster but you need to enter radix and width to it.
// Radix: --> for decimal it is 10, binary it is 2, alphabet it is 26 and so on.
// Width: --> It means length. 	
        int[] intArray = {2134, 3314, 1354, 4231, 5132, 1234, 2453, 5820, 1790};
        System.out.println("This is a Radix Sort");
        
        radixSort(intArray, 10, 4);
        
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        
    }
    
    public static void radixSort(int[] input, int radix, int width){
        
        for(int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
        
    }

    public static void radixSingleSort(int[] input, int position, int radix) {
        
        int numItems = input.length;
        
        int[] countArray = new int[radix];
        
        for(int value: input){
            countArray[getDigit(position, value, radix)]++;
        }
        
// Adjusts the countArray array.        
        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j-1];
        }
        
        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }
        
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
        
    }
    
    public static int getDigit(int position, int value, int radix){
        
        return value / (int) Math.pow(radix, position) % radix;
        
    } 
}
