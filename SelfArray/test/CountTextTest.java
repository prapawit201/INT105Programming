/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static int105.CountText.CountText.countCharInText;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tisanai.Cha
 */
public class CountTextTest {

    String sentence = "Java application";
    char[] char4count = {'a', 'I', 'c'};

    public CountTextTest() {
    }

    @Test
    public void checkResult() {
        int[] expectResult = {4, 2, 1};
        int[] result = countCharInText(sentence, char4count);
        assertArrayEquals(expectResult, result);
    }

    @Test
    public void checkLenght() {
        int expectResult = 3;
        int result = countCharInText(sentence, char4count).length;
        assertEquals(expectResult, result);
    }
}
