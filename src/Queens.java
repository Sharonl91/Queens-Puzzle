import java.util.ArrayList;
public class Queens {
    private int n;
    private int row = 0;
    private int col = 0;
    public String[][] chessboard;
    public ArrayList<String[][]> solution;
    public Queens(int n){
        this.n = n;
        chessboard = new String[n][n];
    }
    public void play(){
        solution = new ArrayList<>();
        for(int r = 0; r < chessboard.length;r++){
            for (int c = 0; c < chessboard[0].length;c++){
                chessboard[r][c] = "Q";
                if (chessboard[r][c] == "Q"){
                    row = r;
                    col = c;
                    for (int i = 0;i<r;i++){
                        chessboard[i][col] = "-";
                    }
                    for (int i = r + 1;i < chessboard.length;i++){
                        chessboard[i][col] = "-";
                    }
                    for (int i = 0;i < c;i++){
                        chessboard[row][i] = "-";
                    }
                    for (int i = c + 1;i < chessboard[0].length;i++){
                        chessboard[row][i] = "-";
                    }
                }
            }
        }
        printChess(chessboard);
    }
    public void printChess(String[][]chessboard){
        for (int i = 0; i < chessboard.length;i++){
            for (int j = 0; j < chessboard[0].length;j++){
                System.out.println(chessboard[i][j]);
            }
        }
    }
}
