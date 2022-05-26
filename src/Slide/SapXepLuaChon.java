package Slide;

import java.io.File;

public class SapXepLuaChon {
    public static void sortSelect(int list[]) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int indexMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                list[indexMin] = list[i];
                list[i] = currentMin;
            }
        }
        for(int e:list){
            System.out.println("list:"+e+" ");
        }
    }
    public static void sort(int array[]){
        int temp;
        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int a:array){
            System.out.println("Array:"+a+" ");
        }
    }
    public static void main(String[] args) {
        File file=new File(fileName);
        int newArray[]= {1,3,8,2,0,12,10,77,66,42,41,87,99,100,19,34,21,87,65,98};
        sortSelect(newArray);
        double start = System.currentTimeMillis();
        sort(newArray);
        double end = System.currentTimeMillis();
        System.out.println("tg list:"+(end-start));
    }
}
