/**
 *
 * @author sourav
 */
class apples{
    
    public static void main(String[] args){
// We can use Counting Sort to perform sorting faster, but it comes with a large drawback, that the range of numbers or
// the value of (max - min) should be less.        
        int[] intArray = {11,17,16,14,13,12,19,20,12,18,15,14,11,19,17,11,12,20,16,14,15,20};
        
        countSort(intArray, 10, 20);
        
        System.out.println("This is counting sort");
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        
    }
    
    public static void countSort(int[] input, int min, int max){

//As the first index is 0 for an array so we have to create an array of length [(max - min) + 1]        
        int[] countArray = new int[(max - min) + 1];
        
// This is just a counter, we know that 14 appears 3 time in the array, so it conunt should be 3.
        for(int i = 0; i < input.length; i++){
            countArray[input[i] - min]++;
        }

// This loop iterates through min to max here it is 11 to 20. Here frequency of 14 is 3, so it should show 3 times.
// At first j = 0, then [(14 - 11) = 3] will be index where 14 will be present. In countArray[i - min]--  frequency of
// 14 will decrease from 3 to 2 in one loop. It will process till the value of i reaches max(20).        
        int j =0;
        for(int i = min; i <= max; i++){
            while(countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }
        
    }
    
}
