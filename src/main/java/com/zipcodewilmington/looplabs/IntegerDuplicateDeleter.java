package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        for (int i = 0; i <intArray.length ; i++) {
            this.array[i] = intArray[i];
        }
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int returnArrLen = getLength(maxNumberOfDuplications);
        Integer[] returnArray = new Integer[returnArrLen];
        int returnArrIndex = 0;
        int currentCount;

        for (int i = 0; i <array.length ; i++) {
            currentCount = 0;
            for (int j = 0; j <array.length  ; j++) {
                if (array[i].equals(array[j])){
                    currentCount++;
                }
            }
            if(currentCount < maxNumberOfDuplications){
                returnArray[returnArrIndex] = array[i];
                returnArrIndex++;
            }
        }
        return returnArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int returnArrLen = getLengthExact(exactNumberOfDuplications);
        Integer[] returnArray = new Integer[returnArrLen];
        int returnArrIndex = 0;
        int currentCount;

        for (int i = 0; i <array.length ; i++) {
            currentCount = 0;
            for (int j = 0; j <array.length  ; j++) {
                if (array[i].equals(array[j])){
                    currentCount++;
                }
            }
            if(currentCount != exactNumberOfDuplications){
                returnArray[returnArrIndex] = array[i];
                returnArrIndex++;
            }
        }
        return returnArray;
    }

    public Integer getLength(int maxNumberOfDuplications){
        int DuplicateCount = 0 ;
        int currentCount;

        for (int i = 0; i <array.length ; i++) {
            currentCount =0;
            for (int j = 0; j <array.length ; j++) {
                if (array[i].equals(array[j])){
                    currentCount++;
                }
            }
            if(currentCount >= maxNumberOfDuplications ){
                DuplicateCount++;
            }
        }
        return array.length - DuplicateCount;
    }

    public Integer getLengthExact(int exactNumberOfDuplications){
        int tripleCount = 0 ; // rename
        int currentCount;

        for (int i = 0; i <array.length ; i++) {
            currentCount =0;
            for (int j = 0; j <array.length ; j++) {
                if (array[i].equals(array[j])){
                    currentCount++;
                }
            }
            if(currentCount == exactNumberOfDuplications ){
                tripleCount++;
            }
        }
        return array.length -tripleCount;
    }
}
