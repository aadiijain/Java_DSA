import java.sql.Time;
import java.util.*;
public class Backtracking {
   

    //Backtracking is finding all possible solutions and use the one you want
    //Backtracking is sometimes applied in recursion
     /*public static void printPermutation(String str, String perm, int index){//Time Complexity O(n*n!)
          if(str.length()==0){
                System.out.println(perm);
                return;
            }
            for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPermutation(newStr, perm+currChar, index+1);
        }
     }

     }
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }

    //N-Queens Problem Solved Using Backtracking Time Complexity O(n^n)
     public boolean issafe(int row,int col, char[][] board){
        //checking horizontal safety
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        //checking vertical safety
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //checking diagonal upper left safety
       
        for(int c=col;int r = row;c>=0 && r>=0;c--;r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //checking diagonal upper right safety
        for(int c=col;int r=row; c<board.length&&r>=0;r--;c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //checking diagonal lower left safety
        for(int c=col;int r=row;c>=0&&r<board.length;r++;c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //checking diagonal lower right safety
        for(int c=col;c<board.length&&r<board.length;c++;r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
     }
     public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q')
                row+='Q';
                else
                row+='.';
            }
            newBoard.add(row);
        }
        allBoards.add(row);
    }
    public void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col==board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,allBoards,col+1);
                board[row][col]='.';
            }
        }
    }
    public List<List<string>> solveQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;

    }*/
   

//N-Queens
//Time complexity - O(n^n)
//https://leetcode.com/problems/n-queens/submissions/986741215/
class Solution {
   public boolean isSafe(int row, int col, char[][] board) {
       //horizontal
       for(int j=0; j<board.length; j++) {
           if(board[row][j] == 'Q') {
               return false;
           }
       }
      
       //vertical
       for(int i=0; i<board.length; i++) {
           if(board[i][col] == 'Q') {
               return false;
           }
       }
      
       //upper left
       int r = row;
       for(int c=col; c>=0 && r>=0; c--, r--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //upper right
       r = row;
       for(int c=col; c<board.length && r>=0; r--, c++) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //lower left
       r = row;
       for(int c=col; c>=0 && r<board.length; r++, c--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //lower right
       for(int c=col; c<board.length && r<board.length; c++, r++) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       return true;
   }
  
   public void saveBoard(char[][] board, List<List<String>> allBoards) {
       String row = "";
       List<String> newBoard = new ArrayList<>();
      
       for(int i=0; i<board.length; i++) {
           row = "";
           for(int j=0; j<board[0].length; j++) {
               if(board[i][j] == 'Q')
                   row += 'Q';
               else
                   row += '.';
           }
           newBoard.add(row);
       }
      
       allBoards.add(newBoard);
   }
  
   public void helper(char[][] board, List<List<String>> allBoards, int col) {
       if(col == board.length) {
           saveBoard(board, allBoards);
           return;
       }
      
       for(int row=0; row<board.length; row++) {
           if(isSafe(row, col, board)) {
               board[row][col] = 'Q';
               helper(board, allBoards, col+1);
               board[row][col] = '.';
           }
       }
   }
  
   public List<List<String>> solveNQueens(int n) {
       List<List<String>> allBoards = new ArrayList<>();
       char[][] board = new char[n][n];
      
       helper(board, allBoards, 0);
       return allBoards;
   }
}
}