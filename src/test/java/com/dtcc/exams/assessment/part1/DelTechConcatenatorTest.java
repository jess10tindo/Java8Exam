package com.dtcc.exams.assessment.part1;

import com.dtcc.exams.part1.DelTechConcatenator;
import org.junit.Assert;
import org.junit.Test;

public class DelTechConcatenatorTest {

    @Test
    public void testFive() {
        Integer input = 5;
        DelTechConcatenator delTechConcatenator = new DelTechConcatenator(input);

        boolean isDel = delTechConcatenator.isDel();
        boolean isTech = delTechConcatenator.isTech();
        boolean isDelTech = delTechConcatenator.isDelTech();

        Assert.assertFalse(isDel); // multiple of 3
        Assert.assertTrue(isTech); // multiple of 5
        Assert.assertFalse(isDelTech); // multiple of 15
    }

    @Test
    public void testThree() {
        Integer input = 3;
        DelTechConcatenator delTechConcatenator = new DelTechConcatenator(input);

        boolean isDel = delTechConcatenator.isDel();
        boolean isTech = delTechConcatenator.isTech();
        boolean isDelTech = delTechConcatenator.isDelTech();

        Assert.assertTrue(isDel); // multiple of 3
        Assert.assertFalse(isTech); // multiple of 5
        Assert.assertFalse(isDelTech); // multiple of 15
    }


    @Test
    public void testTen() {
        Integer input = 10;
        DelTechConcatenator delTechConcatenator = new DelTechConcatenator(input);

        boolean isDel = delTechConcatenator.isDel();
        boolean isTech = delTechConcatenator.isTech();
        boolean isDelTech = delTechConcatenator.isDelTech();

        Assert.assertFalse(isDel); // multiple of 3
        Assert.assertTrue(isTech); // multiple of 5
        Assert.assertFalse(isDelTech); // multiple of 15
    }


    @Test
    public void testSix() {
        Integer input = 6;
        DelTechConcatenator delTechConcatenator = new DelTechConcatenator(input);

        boolean isDel = delTechConcatenator.isDel();
        boolean isTech = delTechConcatenator.isTech();
        boolean isDelTech = delTechConcatenator.isDelTech();

        Assert.assertTrue(isDel); // multiple of 3
        Assert.assertFalse(isTech); // multiple of 5
        Assert.assertFalse(isDelTech); // multiple of 15
    }


    @Test
    public void testFifteen() {
        Integer input = 15;
        DelTechConcatenator delTechConcatenator = new DelTechConcatenator(input);

        boolean isDel = delTechConcatenator.isDel();
        boolean isTech = delTechConcatenator.isTech();
        boolean isDelTech = delTechConcatenator.isDelTech();

        Assert.assertTrue(isDel); // multiple of 3
        Assert.assertTrue(isTech); // multiple of 5
        Assert.assertTrue(isDelTech); // multiple of 15
    }

}
