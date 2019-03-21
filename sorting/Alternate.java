/**
 *
 * @author sourav
 */
class apples{
    
    public static void main(String[] args){
        
        int[] intArray = {12, 21, -32, 36, 18, -9, 7, 3, -19, 15, 30, -4, 11, 39, -17};
        System.out.println("This is a quick sort");
        
        
        quickSort(intArray, 0, intArray.length);
        
        
        System.out.println("In this array all value at even number will appear");
        for(int i = 0; i < intArray.length; i++){
            if(i%2 == 0){
                System.out.println(intArray[i]);
            }
        }
        System.out.println("In this array all value at odd number will appear");
        for(int i = 0; i < intArray.length; i++){
            if(i%2 != 0){
                System.out.println(intArray[i]);
            }
        }
    }
    
    public static void quickSort(int[] input, int start, int end){
        
        if(end - start < 2){
            return;
        }
        
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
        
    }
    
    public static int partition(int[] input, int start, int end){
        
        int pivot = input[start];
        int i = start;
        int j = end;
        
        while(i < j){
// This empty loop is iterating from right to left            
            while(i < j && input[--j] >= pivot);
            if(i < j){
               input[i] = input[j];
            }
// This empty loop is iterating from left to right            
            while(i < j && input[++i] <= pivot);
            if(i < j){
               input[j] = input[i];
            }
            
        }
        input[j] = pivot;
        return j;
    }    
}
