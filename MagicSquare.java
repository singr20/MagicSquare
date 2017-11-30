import java.util.*;

public class MagicSquare{
    boolean play = true;
    public MagicSquare()
    {
        while(play){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Odd Number");
        int squareNumber = scan.nextInt();
        int[][] magicSquare = new int[squareNumber][squareNumber];
        
        for(int r = 0; r < squareNumber; r++){
            for(int c = 0; c < squareNumber; c++){
                magicSquare[r][c] = 0;
            }
        }
        
        int middle = squareNumber/2;
        
        //middle top row = 1
        magicSquare[0][middle] = 1;
        
        int max = squareNumber * squareNumber;
        
        int number = 2;
        int ogRow = 0;
        int ogCol = middle;
        int row = 0;
        int col = middle;
        
        while(number <= max){
            row -= 1;
            col += 1;
            if(row < 0){
                row = squareNumber - 1;
            }
            if(col > squareNumber - 1){
                col = 0;
            }
            
            if(magicSquare[row][col] == 0){
               magicSquare[row][col] = number;
               ogRow = row;
               ogCol = col;
            } else {
               ogRow += 1;
               if(ogRow > squareNumber - 1){
                  ogRow = 0;
               }
               magicSquare[ogRow][ogCol] = number;
               row = ogRow;
               col = ogCol;
            }
            
            number ++;
        }
        
        for(int r = 0; r <  magicSquare.length; r++){
            for(int c = 0; c <  magicSquare.length; c++){
                System.out.print(magicSquare[r][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        }
    }
}
