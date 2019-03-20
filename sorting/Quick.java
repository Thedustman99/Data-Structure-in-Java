/**
 *
 * @author soura
 */
class apples{
    
    public static void main(String[] args){
        
        int[] intArray = {12, 21, -32, 36, 18, -9, 7, 3, -19};
        System.out.println("This is a quick sort");
        
        quickSort(intArray, 0, intArray.length);
        
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    
    public static void quickSort(int[] input, int start, int end){
        
        if(end - start < 2){
            return;
        }

// In order to make a subarray such that on the left side of the pivot all the elements are smaller and on the right side every
// element is larger we use these 3 recursions. 1st one will be making a new partion(subarray) everytime we use this.
// 2nd and 3rd is defining the indexes of the elements it will be storing.
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
        
    }
    
    public static int partition(int[] input, int start, int end){

// I am considering pivot as the first index of the array        
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
