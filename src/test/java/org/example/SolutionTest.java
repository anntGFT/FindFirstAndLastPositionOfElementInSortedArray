package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    int[] result, array;
    int target;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void givenEmptyArray(){

        target = 0;
        result = new int[] {-1,-1};
        array = new int[] {};

        assertEquals(Arrays.toString(result), Arrays.toString(solution.searchRange(array, target)));

    }

    @Test
    public void targetNotMatchingAnyNumberOfTheArray(){

        target = 0;
        result = new int[] {-1,-1};
        array = new int[] {1,2,3,4,5,6,7,8,9};

        assertEquals(Arrays.toString(result), Arrays.toString(solution.searchRange(array, target)));

    }

    @Test
    public void targetMatchingOnlyOneNumberOfTheArray(){

        target = 3;
        result = new int[] {2,2};
        array = new int[] {1,2,3,4,5,6,7,8,9};

        assertEquals(Arrays.toString(result), Arrays.toString(solution.searchRange(array, target)));

    }

    @Test
    public void targetMatchingTwoNumbersOfTheArray(){

        target = 3;
        result = new int[] {2,6};
        array = new int[] {1,2,3,4,5,6,3,8,9};

        assertEquals(Arrays.toString(result), Arrays.toString(solution.searchRange(array, target)));

    }

    @Test
    public void targetMatchingFourNumbersOfTheArray(){

        target = 5;
        result = new int[] {0,8};
        array = new int[] {5,3,3,4,5,5,3,8,5,9};

        assertEquals(Arrays.toString(result), Arrays.toString(solution.searchRange(array, target)));

    }
}

