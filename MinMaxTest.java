/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import self.model.MyArray;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tisanai.Cha
 */
public class MinMaxTest {

    private int[] score = {100, 30, 60, 1, 80};
    private int[] scoreOutRange={-1, 1, 3, 50};

    public MinMaxTest() {
    }

    @Test
    public void NumberLessthanZeroOrMorethanOneHundredReturnNull() { //0-100
        int[] result = MyArray.findMinMax(scoreOutRange);
        assertNull(result);
        
    }

    @Test
    public void findMinZeroInArray() { // min check
        int[] score={2, 1, 0, 50};
        int expectResult = 0;
        int[] result = MyArray.findMinMax(score);
        assertEquals(expectResult, result[0]);
    }
    
    @Test
    public void findMinInArray() { // min check
        int expectResult = 1;
        int[] result = MyArray.findMinMax(score);
        assertEquals(expectResult, result[0]);
    }
   
    @Test
    public void findMaxInArray() { // max check
        int expectResult = 100;
        int[] result = MyArray.findMinMax(score);
        assertEquals(expectResult, result[1]);
    }

    @Test
    public void arrayLength() { //min an max
        int expectResult = 2;
        int result = MyArray.findMinMax(score).length;
        assertEquals(expectResult, result);
    }

}
