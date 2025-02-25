package Feb25;

public class wordSearchLT79 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[][] board = {                                                         
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCS";
        boolean exists = sol.exist(board, word);
        System.out.println("Word exists: " + exists);
    }
}

class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length , col = board[0].length;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(board[i][j] == word.charAt(0) && dfs(board , i , j , word , 0)) return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board , int i , int j , String word , int index){
        if(index == word.length()) return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) return false;
        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board , i+1 , j , word , index+1) ||
                        dfs(board , i-1 , j , word , index+1) ||
                        dfs(board , i , j+1 , word , index+1) ||
                        dfs(board , i , j-1 , word , index+1);
        board[i][j] = temp;
        return found;
    }
}