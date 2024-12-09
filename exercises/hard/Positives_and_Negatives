package com.ecld.java.hard;

public class PositiveNegative
{
    public static void main(String[] args)
    {
       System.out.println(alternateSign(new int[]{3, -2, 5, -5, 2, -8}));
       System.out.println(alternateSign(new int[]{-6, 1, -1, 4, -3}));
       System.out.println(alternateSign(new int[]{4, 4, -2, 3, -6, 10}));
       System.out.println(alternateSign(new int[]{0}));


    }
        public static boolean alternateSign(int[] arr)
        {
            for(int i=1; i<arr.length; i++)
            {
                if(arr[i] * arr[i-1] >= 0) return false;
            }
            return arr.length>1 || arr[0] != 0;
        }
}
