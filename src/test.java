import java.util.*;

/*
* check  weather the game over or to keep playing
* return the winner of the game if the game is over
* */

public class test {
  public static boolean flag=false;
    public List player_1= new ArrayList<>(5);
   public List player_2=new ArrayList<>(5);
    public boolean check(int k, int n) {

//input from main function the sequence player(odd play or even player) and the index they put...
         if(k%2!=0){
             player_1.add(n);
         }else{
             player_2.add(n);
         }

         List<List> w=new ArrayList<List>();
         List one=Arrays.asList(1,2,3);
         List two=Arrays.asList(4,5,6);
         List three=Arrays.asList(7,8,9);
         List four=Arrays.asList(1,4,7);
         List five=Arrays.asList(2,5,8);
         List six=Arrays.asList(3,6,9);
         List seven=Arrays.asList(1,5,9);
         List eight=Arrays.asList(3,7,5);
         w.add(one);
         w.add(two);
         w.add(three);
         w.add(four);
         w.add(five);
         w.add(six);
         w.add(seven);
         w.add(eight);
// the rule to win in the game if the symbol("O" OR "X") are arrange in the above matrix...
        for(List l :w){
//check whether the player input is match the matrix....
            if(player_1.containsAll(l)){

                System.out.println("WINNER 1");
                flag=true;
                break;
            }
            if(player_2.containsAll(l)){

                System.out.println("WINNER 2");
                flag=true;
                break;
            }
            else if(player_1.size()+ player_2.size()==9){

                System.out.println("tie");
                flag=true;
                break;
            }
        }

       return flag;
// return the boolean and the winners name;
    }

}
