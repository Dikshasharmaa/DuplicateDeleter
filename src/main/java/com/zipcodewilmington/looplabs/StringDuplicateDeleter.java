package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Arrays.sort(array);
        int tempIndex =0;
        int i =0;
        String[] temp = new String[array.length];
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Arrays.sort(array);
        int tempIndex =0;
        int i =0;
        String[] temp = new String[array.length];
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
