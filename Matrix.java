package matrix;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args)  {
         Scanner read=new Scanner (System.in);
         System.out.print("Put the number of line of M1 : ");
         int l1=read.nextInt() ; 
         System.out.print("Put the number of colons of M1 : ");
         int c1=read.nextInt() ;
                 int m1 [][] = new int [l1][c1] ;
                 for (int i =0 ; i<l1 ; i++){ 
                     for (int j =0 ; j<c1 ; j++){
                        System.out.print("M1["+i+"]["+j+"]=" ) ;
                         m1[i][j]=read.nextInt();
                     }
                 }
            display(m1,l1,c1);
                     System.out.print("Put the number of line of T : ");
         int l2=read.nextInt() ; 
         System.out.print("Put the number of colons of T : ");
         int c2=read.nextInt() ;
                          int t [][] = new int [l2][c2];
             for (int i =0 ; i<l2 ; i++){ 
                     for (int j =0 ; j<c2 ; j++){
                        System.out.print("M1["+i+"]["+j+"]=" ) ;
                         t[i][j]=read.nextInt();
                     }
                 }
            display (t,l2,c2);
            AddOfTwoMatrix(m1,t,l1,c1,l2,c2);
            multi2Matrix( m1 , t, l1 , c1, l2 , c2);
      }
    static void display (int a[][],int l ,int c) {
        System.out.println("----------------------") ;
        for (int i =0 ; i<l ; i++){ 
                     for (int j =0 ; j<c ; j++){
                        System.out.print(" "+a[i][j] ) ; 
                     }
                System.out.println() ;     
        }
    }
    static void AddOfTwoMatrix (int m1[][],int m2[][] ,int l1 ,int c1 ,int l2 , int c2) { 
        if (l1==l2 && c1==c2) {
            System.out.println("Somme : ") ;
            int s[][] =new int [l1][c1];
        for (int i =0 ; i<c1 ; i++){ 
                     for (int j =0 ; j<l1 ; j++){
                         s[i][j]=m1[i][j]+m2[i][j] ; 
                         System.out.print(" "+s[i][j] ) ;
                     }
                     System.out.println();
        }
    }else System.out.println("The matrix should be a double matrix !");
    }
    static void trans(int a[][],int b[][],int l,int c ){
        if (l==c) {
                    for (int i =0 ; i<l ; i++){ 
                     for (int j =0 ; j<c ; j++){
                         a[i][j]=b[j][i] ;
                     }   
            }
        }else System.out.println("The matrix should be a double matrix !");
    }
    static void multi2Matrix (int a[][] , int b[][],int l1 , int c1,int l2 , int c2) {
         if (l1!=c2 && l2!=c1) System.out.println("colons & lines are difrrent !!!");else {
          if (l2!=c1) multi2Matrix( b , a, l2 , c2, l1 , c1);
          else {
              int mult [][] = new int [l1][c2] ;
              for (int i =0 ; i<l1 ; i++){ 
                      for (int j =0 ; j<c2 ; j++){
                            for (int k =0 ; k<l2 ; k++){          
                                mult[i][j]+=a[i][k]*b[k][j] ;
                     }
                  }
               }
              System.out.println("M * T = ") ;
                            display(mult,l1,c2);
           }                    
       }
    }
}
