import java.util.*;
public class ArraysInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int marks[]=new int [size];

        // for taking input
        for(int i =0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        //output
        for(int i =0 ;i<size;i++){
            System.out.println(marks[i]);

        }
        sc.close();
    }
    
}
