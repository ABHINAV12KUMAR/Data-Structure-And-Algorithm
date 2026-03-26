package com.pac.string;
// Output: 0  → 'l' appears only once, at index 0


import java.util.HashMap;

public class First_Not_repeating {
    public static int Firstuniquechar(String s){
        char[] ch =s.toCharArray();
        int n = ch.length;
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(ch[i])==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String  s = "eetcode";
        System.out.println(Firstuniquechar(s));
    }
}
