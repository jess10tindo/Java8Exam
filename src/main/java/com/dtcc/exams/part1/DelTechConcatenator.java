package com.dtcc.exams.part1;

public class DelTechConcatenator {

    Integer valueToTest;

    public DelTechConcatenator(){
        this.valueToTest = null;
    }

    public DelTechConcatenator(Integer value){
        this.valueToTest = value;
    }

    public boolean isDel(){
        boolean result = false;
        if(valueToTest % 3 == 0){
            result = true;
        }
        return result;
    }

    public boolean isTech(){
        boolean result = false;
        if(valueToTest % 5 == 0){
            result = true;
        }
        return result;
    }

    public boolean isDelTech(){
        boolean result = false;
        if(isDel() == true && isTech() == true){
            result = true;
        }
        return result;
    }

}
