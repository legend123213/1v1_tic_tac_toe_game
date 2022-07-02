import java.util.*;
/* used to assign the "X" and "O" in the game field*/
public class giver {
    int c;

     public static char icon(int c){

         if(c%2==0){
             //for player 2 it assigns "X".......
             return('X');
         }
         else {
             //for player 1 it assigns "O".......
             return ('O');
         }
     }

    }

