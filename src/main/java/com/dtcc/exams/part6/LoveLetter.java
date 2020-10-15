package com.dtcc.exams.part6;

public class LoveLetter {

    public Integer[] mystery(String[] input){
        int length = input.length;
        Integer[] result = new Integer[length];

        for(int i = 0; i< length; i++){
            String str = input[i];
            int count = 0;

            int left = 0;
            int right = str.length() -1;

            while (left < right){
                count += Math.abs(str.charAt(left) - str.charAt(right));
                left++;
                right--;
            }
            result[i] = count;
        }
        return result;
    }
}
