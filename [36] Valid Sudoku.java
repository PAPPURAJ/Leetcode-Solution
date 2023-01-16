class Solution {

    boolean getV(char[][] b,int ii, int jj){
        HashSet<Character> s=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(b[i+ii][j+jj]=='.') continue;
                if(s.contains(b[i+ii][j+jj]))
                    return false;
                 s.add(b[i+ii][j+jj]);
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        HashSet<Character> s=new HashSet<>();

        for(int i=0;i<9;i++){
            s.clear();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(s.contains(board[i][j]))
                    return false;
                 s.add(board[i][j]);
            }                       
        }
        for(int i=0;i<9;i++){
            s.clear();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(s.contains(board[j][i]))
                    return false;
                 s.add(board[j][i]);
            }                       
        }

        for(int i=0;i<9;i+=3)
            for(int j=0;j<9;j+=3)
                if(getV(board, i, j)==false)
                    return false;

        

    return true;
    }
}
