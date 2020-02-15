public class torusGameOfLife extends gameOfLife{

    public torusGameOfLife(){}

    public torusGameOfLife(int size){
        this.size = size;
        board = new int [size][size];
        previous = new int [size][size];
    }

    public torusGameOfLife(int [][] arr){
        this.size = arr.length;
        board = arr;
        previous = new int [size][size];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                previous[i][j] = arr[i][j];
            }
        }
    }
    //inherit: neighbors, oneStep, evolution

    @Override
    public int neighbors(int R, int C){

        int counter = 0;

        if(previous[((R+size)-1) % size][((C+size)-1) % size] == 1)
            counter ++;

        if(previous[(R + size) % size][((C + size)-1) % size] == 1)
            counter ++;

        if(previous[((R + size)+1) % size][((C + size)-1) % size] == 1)
            counter ++;

        if(previous[((R + size)-1) % size][(C + size) % size] == 1)
            counter ++;

        if(previous[((R + size)+1) % size][(C + size) % size] == 1)
            counter ++;

        if(previous[((R + size)-1) % size][((C + size)+1) % size] == 1)
            counter ++;

        if(previous[(R + size) % size][((C + size)+1) % size] == 1)
            counter ++;

        if(previous[((R + size)+1) % size][((C + size)+1) % size] == 1)
            counter ++;

        return counter;
    }
}
