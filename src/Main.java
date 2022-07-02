import java.util.ArrayList;
import java.util.Scanner;
/*
* main function
* */
public class Main {

    public static void main(String[] args) {
        char[][] tx = {{' ', ' ', ' '},
                       {' ', ' ', ' '},
                       {' ', ' ', ' '}};
        Scanner input = new Scanner(System.in);
        test ab=new test();
        ArrayList<Integer> reptable=new ArrayList<>();
        int i=1;
        boolean fl=false;
        while (fl||i<10)
         {
            if(i%2!=0){
                System.out.print("PLAYER 1 :");
            }else {
                System.out.print("PLAYER 2 :");
            }
            int n = input.nextInt();
            if(reptable.contains(n)==false){



            switch (n) {
                case 1:
                    tx[0][0] = giver.icon(i);
                    break;
                case 2:
                    tx[0][1] = giver.icon(i);
                    break;
                case 3:
                    tx[0][2] = giver.icon(i);
                    break;
                case 4:
                    tx[1][0] = giver.icon(i);
                    break;
                case 5:
                    tx[1][1] = giver.icon(i);
                    break;
                case 6:
                    tx[1][2] = giver.icon(i);
                    break;
                case 7:
                    tx[2][0] = giver.icon(i);
                    break;
                case 8:
                    tx[2][1] = giver.icon(i);
                    break;
                case 9:
                    tx[2][2] = giver.icon(i);
                    break;
                default:
                    System.out.println("invalid number");
            }
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tx[k][j] + ", ");
                }
                System.out.println(" ");
            }
             if(ab.check(i,n)){

                 break;
             }
                reptable.add(n);
             i++;}
            else{

                continue;
            }


        }
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tx[k][j] + ", ");
            }
            System.out.println(" ");

    }
    }}
