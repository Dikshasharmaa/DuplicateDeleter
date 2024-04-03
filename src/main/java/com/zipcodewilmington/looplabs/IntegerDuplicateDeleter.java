package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Arrays.sort(array);
        int tempIndex =0;
        int i =0;
        Integer[] temp = new Integer[array.length];
        while (i < array.length) {
            int count = 1;
            int current = i + 1;
            while( current< array.length && array[i].equals(array[current])){
                count++;
                current++;
            }
            if(count < maxNumberOfDuplications){
                for(int j =0; j<count; j++){
                    temp[tempIndex] = array[i];
                    tempIndex++;
                }
            }
            i = current;
        }
        return Arrays.copyOf(temp, tempIndex);
    }



    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Arrays.sort(array);
        int tempIndex =0;
        int i =0;
        Integer[] temp = new Integer[array.length];
        while (i < array.length) {
            int count = 1;
            int current = i + 1;
            while( current< array.length && array[i].equals(array[current])){
                count++;
                current++;
            }
            if(count != exactNumberOfDuplications){
                for(int j =0; j<count; j++){
                    temp[tempIndex] = array[i];
                    tempIndex++;
                }
            }
            i = current;
        }
        return Arrays.copyOf(temp, tempIndex);
    }
}
