package com.fest;

import java.util.Scanner;

public class ReverseWordString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String S = sc.nextLine();

        String ans =  reverseWords(S);
        System.out.println(ans);

    }
    public static String reverseWords(String S){
        int i = S.length()-1;
        String ans = "";
        while(i>=0){
            while(i >=0 && S.charAt(i) == ' ')
                i--;
            int j = i;
            if(i < 0)
                break;
            while(i >= 0 && S.charAt(i)!= ' ')
                i--;
            if(ans.isEmpty())
                ans = ans.concat(S.substring(i+1, j+1));
            else
                ans = ans.concat(" " + S.substring(i+1, j+1));
        }
        return ans;
    }
}
