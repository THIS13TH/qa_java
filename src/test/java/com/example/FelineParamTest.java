package com.example;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {
    private final int countKittens;

    public FelineParamTest(int countKittens) {
        this.countKittens = countKittens;

    }

    @Parameterized.Parameters
    public static Object[][] getKittens() {
        return new Object[][]{
                {10},
                {3},
                {-1},
                {-7},
        };
    }

    @Test
    public void quantityMatchingKittens() {
        //arrange
        Feline feline = new Feline();
        //act
        int actual = feline.getKittens(countKittens);
        //assert
        assertEquals("Количество не соответствует", countKittens, actual);
    }
}
