/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sourav
 */
class apples {
    
    public static void main(String[] args){
        
        int[] intArray = {12, 21, -32, 36, 18, -9, 7, 3, -19};
        System.out.println("This is a bubble sort");

// Here we are initialising lastUnsortedIndex with the last index of the array, which is (intArray.length-1).
// We arerunning the outer loop from last index(intArray.length-1) to the first index(0).
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){            

// Now we will be sorting the array till the index where array is unsorted, in first loop every element will be unsorted
// so the loop will run till the end, but during second loop it will run till the second last index of the array
// and so on till the value of lastUnsortedIndex becomes 0 which will be the last loop. Then the array will be sorted.
            for(int i = 0; i < lastUnsortedIndex; i++){
                
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        
    }
    
    public static void swap(int[] array, int i, int j){
        
        if (i == j){
            return;
        }
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        
    }
    
}
