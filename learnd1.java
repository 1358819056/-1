package hh;
import java.util.Scanner;

public class learnd1 {
    public static void main(String[] args) {
        int a[][]=new int[7][8];
        for(int i=0;i<8;i++){
            a[0][i]=1;
            a[6][i]=1;
        }
        for(int i=0;i<7;i++){
            a[i][0]=1;
            a[i][7]=1;
        }
        a[3][1]=1;
        a[3][2]=1;

        for(int i=0;i<7;i++){
            for (int j=0;j<8;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        A(a,1,1);
        for(int i=0;i<7;i++){
            for (int j=0;j<8;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

 }
    public static boolean A(int a[][],int c,int d){
      if(a[5][6]==2){
          return true;
      }else {if(a[c][d]==0){
          a[c][d]=2;
          if(A(a,c+1,d)){
              return true;
          }else if (A(a,c,d+1)){
              return true;
          } else if(A(a,c-1,d)){
              return true;
          }else if(A(a,d,d-1)){
              return true;
          }else{
              a[c][d]=3;
              return false;
          }
      }
      else {return false;}
      }
    }
}
