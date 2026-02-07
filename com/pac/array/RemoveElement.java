package com.pac.array;

public class RemoveElement {
    public static int removeElement(int [] arr, int val){
        int n = arr.length;
        int temp=0;
       for(int i=0;i< n;i++){
           if(arr[i]!=val){
               arr[temp]=arr[i];
               temp++;
           }
       }
       return temp;
    }
    public static void main(String[] args) {
        int [] arr={3,2,2,3};
        int val =3;
        System.out.println(removeElement(arr,val));
    }
}
