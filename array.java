package JC.Day62;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import JC.Day56.inputstream;

/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        
    //     int min_index = 0;
    //     int temp = 0;
    //     int [] array = {7,5,9,0,3,1,6,2,4,8};

    //     for (int i = 0; i < array.length; i++) {
    //         min_index = i;
    //             for (int j = i+1; j < array.length; j++) {
    //                 if(array[min_index]>array[j]) min_index = j;

    //             }
    //     temp  = array[i];
    //     array[i] = array[min_index];
    //     array[min_index] = temp;
    //     }

    // System.out.println(Arrays.toString(array));

    //homework



    Scanner sc = new Scanner(System.in);
    System.out.print("몇 개를 입력하시겠습니까? ");
    int count = sc.nextInt();
    System.out.println("숫자를 입력하세요.");
    
    int [] num = new int[count];

    for (int i = 0; i < num.length; i++) {
        num[i] = sc.nextInt();
        
    }

    Arrays.sort(num);
    System.out.println(Arrays.toString(num));
    
    
    
        

    }
}
