// Q.1
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// solution:-

// public class patterns {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }

// import java.util.Scanner;
// public class patterns {

//     public static void main(String[] args) {
//         int i,row;
//         int j,col;
//         Scanner sc=new Scanner (System.in);
//         System.out.println("enter the no of rows");
//         row=sc.nextInt();
//          System.out.println("enter the no of col");
//         col=sc.nextInt();
//         for( i=0;i<row;i++){
//             for( j=0;j<col;j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");

//         }

//     }
// }

// Q.2
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// using increment operator
// public class patterns {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }
// using decrement operator 

// public class patterns {
//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for(int j=5;j>=i;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }

// using increment decrement operator ;

// public class patterns {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=i;j>=1;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }
// Q.3
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

// // using increment  operator 

// public class patterns {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=i;j<=5;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// using Decrement operator 

// public class patterns {
//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for(int j=i;j>=1;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// using increment-Decrement operator 

// public class patterns {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// Q.4
//      * 
//     ** 
//    *** 
//   **** 
//  ***** 
// ****** 
//  public class patterns {
  
//     public static void main(String[] args) {
//         for(int i=0;i<=5;i++){
//             for(int j=i;j<5;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
//   }
// USING DECREMENT OPERATOR
//    public class patterns {
  
//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for(int j=i;j>1;j--){
//                 System.out.print(" ");
//             }
//             for(int k=5;k>=i;k--){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
//   }
// Q.5
//     *  
//    * *  
//   * * *  
//  * * * *  
// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<5;i++){
//             for(int j=5;j>i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

//          * 
//         *** 
//        ***** 
//       ******* 
//      ********* 
//     *********** 
//    ************* 
//   *************** 

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<9;i++){
//             for(int j=9;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

//          * 
//         * * 
//        *   * 
//       *     * 
//      *       * 
//     *         * 
//    *           * 
//   *************** 


// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<9;i++){
//             for(int j=9;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//     if(k==1 || k==2*i-1 || i==8){
//            System.out.print("*");
//     }
//     else{
//         System.out.print(" ");
//     }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// * * * * *  
//  * * * *  
//   * * *  
//    * *  
//     *  
// public class patterns {

//     public static void main(String[] args) {
        
//         for(int i=1;i<=6;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=i;k<6;k++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


// ********* 
//  ******* 
//   ***** 
//    *** 
//     * 
// public class patterns {

//     public static void main(String[] args) {
        
//         for(int i=1;i<=8;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=12;k>2*i-1;k--){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// same pattern different code 
// public class patterns {

//     public static void main(String[] args) {
        
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// ********* 
//  *     * 
//   *   * 
//    * * 
//     * 

// public class patterns {

//     public static void main(String[] args) {
        
//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 if(k==1||k==2*i-1||i==5){
//                 System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }


// Q.6

//      *  
//     * *  
//    * * *  
//   * * * *  
//  * * * * *  
// * * * * * *  
// * * * * * *  
//  * * * * *  
//   * * * *  
//    * * *  
//     * *  
//      *  
// solution 

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=0;i<6;i++){
//             for(int j=i;j<6-1;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<=i;k++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//            for(int i=0;i<=6;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=i;k<6;k++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
        
//     }
// }

// Q.7

// *  
// * *  
// * * *  
// * * * *  
// * * * * *  
// * * * *  
// * * *  
// * *  
// *  
// solution:-
// public class patterns {

//     public static void main(String[] args) {
//         for(int i=0;i<5;i++){
//             for( int j=0;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//          for(int i=0;i<4;i++){
//             for( int j=i;j<4;j++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.8
// ****** 
// *    * 
// *    * 
// *    * 
// *    * 
// ****** 
// solution:-

// public class patterns {

//     public static void main(String[] args) {
//         int n=6;
//         for (int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0 ||j==0 ||i==n-1 ||j==n-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;

// public class patterns{
//     public static void main(String[] args) {
//         int i,row;
//         int j,col;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the no.of rows you want:");
//         row=sc.nextInt();
//          System.out.println("enter the no.of column you want:");
//         col=sc.nextInt();

//         for(i=0;i<row;i++){
//             for(j=0;j<col;j++){
//                 if (i==0||j==0||i==row-1||j==col-1){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.8 
// ************** 
// *            * 
// *            * 
// ************** 

// public class patterns {

//     public static void main(String[] args) {
//         // int n=6;
//         for (int i=0;i<4;i++){
//             for(int j=0;j<14;j++){
//                 if(i==0 ||j==0 ||i==4-1 ||j==14-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.9
// ****** 
// *    * 
// ****** 
// *    * 
// *    * 
// *    * 
// solution:-

// public class patterns {

//     public static void main(String[] args) {
//         int n=6;
//         for (int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0 ||j==0 ||i==(n-1)/2 ||j==n-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;

// public class patterns{
//     public static void main(String[] args) {
//         int i,row;
//         int j,col;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the no.of rows you want:");
//         row=sc.nextInt();
//          System.out.println("enter the no.of column you want:");
//         col=sc.nextInt();

//         for(i=0;i<row;i++){
//             for(j=0;j<col;j++){
//                 if (i==0||j==0||i==row/2||j==col-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.10
// *    * 
// *    * 
// ****** 
// *    * 
// *    * 
// *    * 
// solutioin:-
// public class patterns {

//     public static void main(String[] args) {
//         int n=6;
//         for (int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if( j==0 ||i==(n-1)/2 ||j==n-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.11
//  ****       
// *    *      
// *    *      
// *    *      
// *    *      
// ******      
// *    *      
// *    *      
// *    *      
// *    *      
// *    *  
// soluton:-

// public class patterns {

//     public static void main(String[] args) {
//         int n=12;
//         for(int i=0;i<n-1;i++){
//             for( int j=0;j<n-1;j++){
//                 if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0  || i==(n-1)/2 && j<=(n-1)/2 ||  j==(n-1)/2 && i>0  ){
//                    System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.12
// *               
//  *              
//   *             
//    *            
//     *           
//      *          
//       *         
//        *        
//         *       
//          *   
// public class patterns{
//     public static void main(String[] args) {
//         int n=12;
//         for (int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if (i==j){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }
// Q.13
//           * 
//          *  
//         *   
//        *    
//       *     
//      *      
//     *       
//    *        
//   *         
//  *  
// public class patterns{
//     public static void main(String[] args) {
//         int n=12;
//         for (int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if (i+j==n-1){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.14
// *         * 
//  *       *  
//   *     *   
//    *   *    
//     * *     
//      *      
//     * *     
//    *   *    
//   *     *   
//  *       *  
// *         * 

//  public class patterns{
//     public static void main(String[] args) {
//         int n=11;
//         for (int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if ( i==j||i+j==n-1 ){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.15

// *         * 
// **       ** 
// * *     * * 
// *  *   *  * 
// *   * *   * 
// *    *    * 
// *   * *   * 
// *  *   *  * 
// * *     * * 
// **       ** 
// *         * 
//  public class patterns{
//     public static void main(String[] args) {
//         int n=11;
//         for (int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if ( i==j||i+j==n-1||j==0|| j==n-1 ){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.16
// ************ 
// **        ** 
// * *      * * 
// *  *    *  * 
// *   *  *   * 
// *    **    * 
// *    **    * 
// *   *  *   * 
// *  *    *  * 
// * *      * * 
// **        ** 
// ************ 
// public class patterns {

//     public static void main(String[] args) {
//         int n=12;
//         for(int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if ( j==0||j==n-1||i==j||i+j==n-1||i==0||i==n-1){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.17

// *********** 
// *   * *   * 
// *  *   *  * 
// * *     * * 
// **       ** 
// *         * 
// **       ** 
// * *     * * 
// *  *   *  * 
// *   * *   * 
// *********** 
// solution:
// public class patterns {

//     public static void main(String[] args) {
//         int n=11; 
//     //    (n) iska odd even se figure teeda meeda ho jaata hai 
//         for(int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if (i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||i+j==(n-1)+(n-1)/2||i==0||i==n-1||j==0||j==n-1){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.18
//      *      
//     * *     
//    *   *    
//   *     *   
//  *       *  
// *         * 
//  *       *  
//   *     *   
//    *   *    
//     * *   
//      * 
// public class patterns {

//     public static void main(String[] args) {
//         int n=11;
//         // n even likhe se value odd ho jayegi kyuki n 0 se start hai or figure gadbada jayega
//         for(int i=0;i<n;i++){
//             for (int j=0;j<n;j++){
//                 if(i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||i+j==(n-1)+(n-1)/2){
//                   System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// Q.19
  
// * * * * * *  * * * * * * 
// * * * * *      * * * * * 
// * * * *          * * * * 
// * * *              * * * 
// * *                  * * 
// *                      * 
// *                      * 
// * *                  * * 
// * * *              * * * 
// * * * *          * * * * 
// * * * * *      * * * * * 
// * * * * * *  * * * * * * 
// solution 
//   public class patterns {
  
//     public static void main(String[] args) {
  
   
//     // upper half of the pattern
//     for(int i = 0; i < 6; i++) 
//     {
//         for(int j = 0; j < (2 * 6); j++)
//         { 
//             if(i + j <= 6 - 1)  // upper left triangle
//               System.out.print("*");
//             else
//                 System.out.print(" ");
//             if((i + 6) <= j)  // upper right triangle
//               System.out.print("*");
//             else
//                System.out.print(" ");
//         }
//         System.out.println(" ");
//     }
//     // bottom half of the pattern
//     for(int i = 0; i < 6; i++)
//     {
//         for(int j = 0; j < (2 * 6); j++)
//         {
//             if(i >= j)  //bottom left triangle
//                 System.out.print("*");
//             else
//                 System.out.print(" ");
//             if(i >= (2 * 6 - 1) - j)  // bottom right triangle
//               System.out.print("*");
//             else
//                System.out.print(" ");
//         }
//         System.out.println(" ");
//     }

//     }
// }

// Q.1
// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5 
// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 1 0 1 0 1  
// 1 0 1 0 1  
// 1 0 1 0 1  
// 1 0 1 0 1  
// 1 0 1 0 1 
// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print(j%2+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }































// 1 1 1 1 1  
// 2 2 2 2 2  
// 3 3 3 3 3  
// 4 4 4 4 4  
// 5 5 5 5 5 

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5  
// 1 2 3 4 5  
// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 5 5 5 5 5  
// 4 4 4 4 4  
// 3 3 3 3 3  
// 2 2 2 2 2  
// 1 1 1 1 1 

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for(int j=5;j>=1;j--){
//                 System.out.print(i+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// 5 4 3 2 1  
// 5 4 3 2 1  
// 5 4 3 2 1  
// 5 4 3 2 1  
// 5 4 3 2 1  

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for(int j=5;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }



// 1  
// 1 2  
// 1 2 3  
// 1 2 3 4  
// 1 2 3 4 5  
// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// 5 4 3 2 1  
// 4 3 2 1  
// 3 2 1  
// 2 1  
// 1  

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for (int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 5 5 5 5 5  
// 4 4 4 4  
// 3 3 3  
// 2 2  
// 1  

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for (int j=i;j>=1;j--){
//                 System.out.print(i+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


// 1  
// 2 2  
// 3 3 3  
// 4 4 4 4  
// 5 5 5 5 5  



// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 5
// 5 4 
// 5 4 3 
// 5 4 3 2 
// 5 4 3 2 1 


// public class patterns {

//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for (int j=5;j>=i;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


// 1
// 2 1
// 3 2 1 
// 4 3 2 1 
// 5 4 3 2 1
// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


// 5 4 3 2 1
// 5 4 3 2
// 5 4 3 
// 5 4 
// 5

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


// 1 2 3 4 5 
// 2 3 4 5 
// 3 4 5 
// 4 5 
// 5 
// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for (int j=i;j<=5;j++){
//                 System.out.print(j +" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


// 1 1 1 1 1  
// 2 2 2 2  
// 3 3 3  
// 4 4  
// 5 

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for (int j=i;j<=5;j++){
//                 System.out.print(i +" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
// public class patterns {

//     public static void main(String[] args) {
//         for(int i=5;i>=1;i--){
//             for (int j=1;j<=i;j++){
//                 System.out.print(j +" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 1  
// 1 2  
// 1 2 3  
// 1 2 3 4  
// 1 2 3 4 5  
// 1 2 3 4 5 6  
// 1 2 3 4 5 6 7  
// 1 2 3 4 5 6 7 8  
// 1 2 3 4 5 6 7 8 9  
// 1 2 3 4 5 6 7 8 9 10  
// 1 2 3 4 5 6 7 8 9 10 11  
// 1 2 3 4 5 6 7 8 9 10 11 12  
// 1 2 3 4 5 6 7 8 9 10 11 12 13  
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14  
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=15;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print(j +" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// 1 0 1 0 1  
// 1 0 1 0 1 0  
// 1 0 1 0 1 0 1  
// 1 0 1 0 1 0 1 0  
// 1 0 1 0 1 0 1 0 1  
// 1 0 1 0 1 0 1 0 1 0  
// 1 0 1 0 1 0 1 0 1 0 1  
// 1 0 1 0 1 0 1 0 1 0 1 0  
// 1 0 1 0 1 0 1 0 1 0 1 0 1  
// 1 0 1 0 1 0 1 0 1 0 1 0 1 0  
// 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 
// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1;i<=15;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print(j%2 +" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// public class patterns {

//     public static void main(String[] args) {
//         int k=1;
//         for(int i=1;i<=5;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print(k++ +" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// wrong
//         1  
//       1 2  
//     1 2 3  
//   1 2 3 4  
// 1 2 3 4 5 
// public class patterns {

//     public static void main(String[] args) {

//         for(int i=1;i<=5;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print(k+"");
//             }
//             System.out.println(" ");
//         }
//     }

// } 
//      1  
//     1 2  
//    1 2 3  
//   1 2 3 4  
//  1 2 3 4 5 
//  public class patterns {

//     public static void main(String[] args) {

//         for(int i=1;i<=5;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print(k+" ");
//             }
//             System.out.println(" ");
//         }
//     }

// }