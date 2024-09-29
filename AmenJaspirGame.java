
// import java.util.Scanner;

// public class AmenJaspirGame {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the total");
//         int total = sc.nextInt();
//         int arr[] = new int[total];

//         for(int i =0; i<total; i++){
//             arr[i]=sc.nextInt();
//         }
//         if(total == 1)
//             System.out.println("Amen Wins");
//         for(int i=0; i<total; i++){
//             if(total==2){
//             int xor = arr[i]^arr[i+1];
//             if(xor==0)
//                 System.out.println("Jaspir Wins");
            
//             else
//                 System.out.println("Amen Wins");     
//         }
//             if(total>2){ 
//                     int xor = arr[i];
//                     for(int j=1;j<total;j++){
//                         xor = xor^arr[j];
//                         if(xor==0){
//                             System.out.println("Jaspir Wins");
//                         }
//                         else
//                             System.out.println("Amen Wins");
//                     }
                    
                
//             }
        
//     }
//     }
// }

import java.util.Scanner;

public class AmenJaspirGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int arr[] = new int[total];
        for(int i=0; i<total; i++){
            arr[i]=sc.nextInt();
        }
        int xor = arr[0];
        for(int i=1 ; i<total; i++){
            xor = xor^arr[i];
        }
        String result = (xor==0)? "Jaspir" : "Amen";
        System.out.println(result);
    }
}