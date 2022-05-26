package Slide;

import java.io.PrintWriter;

public class SapXepChen {
    public static void sortInsert(int list[]){
        int pos,x;
        for(int i=1;i<list.length;i++){
            pos=i;
            x=list[i];
            while (pos>0 && x<list[pos-1]){
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos]=x;
        }
        for(int e:list){
            System.out.println("list:"+e+" ");
        }
    }

    public static void main(String[] args) {
        PrintWriter printWriter= new PrintWriter()
        int list[]= {1,5,2,7,2,9,12,-2,8,77};
        sortInsert(list);
    }
}
