public class Insertion_Sort {
 public static void insertion_Sort ( int [] arr )
    {
         int n = arr . length ;

         for ( int i = 1; i < n; i ++) {
         int key = arr [i ];
         int j = i - 1;

         // Shift elements of arr [0..i -1]
         while (j >= 0 && arr [j] > key ) {
             arr [j + 1] = arr [j ];
             j--;
         }

         // Insert the key at its correct  position

         arr [j + 1] = key;
         }
         }

       public static void printArray ( int [] arr ) {
       for ( int num : arr ) {
         System . out . print ( num + " ") ;
         }
       System . out . println () ;
       }

       public static void main ( String [] args ) {
       int [] arr = {54 , 26 , 93 , 17 , 77 , 31 , 44 ,
              55 , 20};
       System . out . println (" Original Array :");
       printArray ( arr ) ;

       insertion_Sort ( arr );

       System . out . println (" Sorted Array :") ;
       printArray ( arr ) ;
       }
 }
