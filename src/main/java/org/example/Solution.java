package org.example;

public class Solution {
    public Solution(){

    }

    public int[] searchRange(int[] nums, int target) {

        int[] result;
        int startingPosition = -1;
        int endingPosition = -1;
        boolean aux = true;


        for(int i = 0; i< nums.length;i++){

            if (nums[i] == target && aux){

                startingPosition = i;

                aux = false;
            }

            if ( nums[i] == target){

                endingPosition = i;
            }

        }

        result = new int[] {startingPosition, endingPosition};

        return result;
    }
}