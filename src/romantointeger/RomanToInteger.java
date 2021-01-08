/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romantointeger;

import java.util.Scanner;

/**
 *
 * @author zukhruf
 */
public class RomanToInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input roman number:");
        String s = sc.nextLine();
        System.out.println("Result is = " + romanToInteger(s));
        
    }
    
    static int romanToInteger(String s){
        int result = 0;
        for(int i = 0; i < s.length();i++){
            int s1 = value(s.charAt(i));
            if(i + 1 < s.length()){
               int s2 = value(s.charAt(i+1));
               if(s1 < s2){
                   result = result + s2 - s1;
                   i++;
               }else{
                   result = s1 + result;
               }
            }else{
                result = s1 + result;
            }
        }
        return result;
    }
    
    static int value(char r){
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    
}
