package com.fest;


import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        boolean isAnagram = false;

        boolean[] visited = new boolean[b.length()];

        if(a.length() ==b.length()) {

            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                isAnagram = false;
                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }
        }
        if(isAnagram){
            System.out.println("String is Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
