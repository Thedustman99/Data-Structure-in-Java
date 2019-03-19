/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author sourav
 */
public class Selection {
    
    public static void main(String[] args){
        
        int[] intArray = {12, 21, -32, 36, 18, -9, 7, 3, -19};
        System.out.println("This is a selection sort");
        
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex -- ){
// Here at begining we are assuming that the value at index 0 is the largest value in the array. But when we find
// that there is even bigger value than this, then we consider the new bigger value as the largest. We do this
// till the lastUnsortedIndex and then we swap them.
            int largest = 0;

// Instead of looping till the index before lastUnsortedIndex, we will loop till lastUnsortedIndex which does not
// happen in Bubble Sort. We will be starting the loop from index 1 rather than 0, so that when the value of
// lastUnsortedIndex reaches 1 it will be sorted.
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
// After each and every loop we will be swaping the largest found value with the lastUnsortedIndex.            
            swap(intArray, largest, lastUnsortedIndex);            
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
