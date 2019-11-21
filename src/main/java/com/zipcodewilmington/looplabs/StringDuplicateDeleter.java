package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String [] stringArray) {
        super(stringArray);
        for (int i = 0; i <stringArray.length ; i++) {
            this.array[i] = stringArray[i];
        }
    }

 @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int returnArrLen = getLength(maxNumberOfDuplications);
        String[] returnArray = new String[returnArrLen];
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int returnArrLen = getLengthExact(exactNumberOfDuplications);
        String[] returnArray = new String[returnArrLen];
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
