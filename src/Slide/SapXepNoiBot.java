package Slide;

import java.util.LinkedList;

public class SapXepNoiBot {
    public static void bubbleSort(int list[]){
        boolean needNextPass=true;
        for (int k=1;k< list.length && needNextPass ;k++){
            needNextPass=false;
            for (int i=0;i< list.length-k;i++){
                if(list[i]> list[i+1]){
                    int temp= list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    needNextPass=true;
                }
//                else
//                    needNextPass=false;
            }
        }

    }
    public static void main(String[] args) {
        int list[]= {1,5,2,7,2,9,12,-2,8,77};
        bubbleSort(list);
        System.out.print("Ham sau sap xep: ");
        for (Integer i:list) {
            System.out.print(i+" ");
        }
    }
}
