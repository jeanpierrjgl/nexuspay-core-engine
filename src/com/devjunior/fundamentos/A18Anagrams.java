package com.devjunior.fundamentos;
//anagrama es cuando dos palabras tienen las mismas letras no importando el orden
//se hace con el metodom de la frecuencia
public class A18Anagrams {
   public static  boolean esAnagram(String a, String b){
       if (a==null || b==null || a.length() != b.length()){
           return false;
       }
       a = a.toLowerCase();
       b = b.toLowerCase();
       int[] frecuencia = new int[26];

       for (int i=0;i<a.length();i++) {
           frecuencia[a.charAt(i) - 'a']++;
           frecuencia[b.charAt(i) - 'a']--;
       }
       for (int balance : frecuencia){
           if (balance != 0){
               return false;
           }
       }
       return true;
   }
}
