public class gameOfLife {

    int size;
    int [][] board;
    int [][] previous;

    public gameOfLife(){}

    public gameOfLife(int size){
        this.size = size;
        board = new int [size][size];
        previous = new int [size][size];
    }

    public gameOfLife(int [][] arr){
        this.size = arr.length;
        board = arr;
        previous = new int [size][size];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                previous[i][j] = arr[i][j];
            }
        }
    }

    public int[][] getBoard(){
        return board;
    }

    public void oneStep(){

       for(int i=0; i<board.length; i++){
           for(int j=0; j<board[i].length; j++){

               if(previous[i][j] == 1 && neighbors(i, j) < 2)
                   board[i][j] = 0;

               else if(previous[i][j] == 1 && (neighbors(i, j) > 1 && neighbors(i, j) < 4))
                   board[i][j] = 1;

               else if(previous[i][j] == 1 && neighbors(i, j) >= 4)
                   board[i][j] = 0;

               else if(previous[i][j] == 0 && neighbors(i, j) == 3)
                   board[i][j] = 1;
           }
       }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                previous[i][j] = board[i][j];
            }
        }
    }

    public int neighbors(int R, int C){
        int counter = 0;

        if(((C-1) >=0) && ((C-1) < size) && ((R-1) >=0) && ((R-1) < size) && previous[R-1][C-1] == 1)
            counter ++;

        if(((C-1) >=0) && ((C-1) < size) && (R >=0) && (R < size) && previous[R][C-1] == 1)
            counter ++;

        if(((C-1) >=0) && ((C-1) < size) && ((R+1) >=0) && ((R+1) < size) && previous[R+1][C-1] == 1)
            counter ++;

        if((C >=0) && (C < size) && ((R-1) >=0) && ((R-1) < size) && previous[R-1][C] == 1)
            counter ++;

        if((C >=0) && (C < size) && ((R+1) >=0) && ((R+1) < size) && previous[R+1][C] == 1)
            counter ++;

        if(((C+1) >=0) && ((C+1) < size) && ((R-1) >=0) && ((R-1) < size) && previous[R-1][C+1] == 1)
            counter ++;

        if(((C+1) >=0) && ((C+1) < size) && (R >=0) && (R < size) && previous[R][C+1] == 1)
            counter ++;

        if(((C+1) >=0) && ((C+1) < size) && ((R+1) >=0) && ((R+1) < size) && previous[R+1][C+1] == 1)
            counter ++;

        return counter;
    }

    public void evolution(int e){
        while(e > 0){
            oneStep();
            e--;
        }
    }

    public void printBoard(){
        for(int i=0; i<board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println(board[i][j]);
            }
        }
    }

}