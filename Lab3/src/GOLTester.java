import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GOLTester {
    //GAME OF LIFE NEIGHBORS TESTER
    @Test
    public void neighbors1() {
        int [][] arr = {{0,0,0},{0,1,0},{0,0,0}};
        int R = 1;
        int C = 1;
        gameOfLife sol = new gameOfLife(arr);

        assertEquals(0, sol.neighbors(R, C) );
    }

    @Test
    public void neighbors2() {
        int [][] arr = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
        int R = 1;
        int C = 2;
        gameOfLife sol = new gameOfLife(arr);

        assertEquals(3, sol.neighbors(R, C) );
    }

    @Test
    public void neighbors3() {
        int [][] arr = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0,},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        int R = 2;
        int C = 1;
        gameOfLife sol = new gameOfLife(arr);

        assertEquals(3, sol.neighbors(R, C) );
    }

    @Test
    public void neighbors4() {
        int [][] arr = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,0,0,1,1,0},{0,0,0,1,1,0},{0,0,0,0,0,0}};
        int R = 3;
        int C = 2;
        gameOfLife sol = new gameOfLife(arr);

        assertEquals(4, sol.neighbors(R, C) );
    }

    @Test
    public void neighbors5() {
        int [][] arr = {{0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0}};
        int R = 4;
        int C = 4;
        gameOfLife sol = new gameOfLife(arr);

        assertEquals(6, sol.neighbors(R, C) );
    }
    //GAME OF LIFE ONE STEP TESTER
    @Test
    public void oneStep1(){
        int [][] arr = {{0,0,0},{0,1,0},{0,0,0}};
        int [][] testArr = {{0,0,0},{0,0,0},{0,0,0}};

        gameOfLife sol = new gameOfLife(arr);
        sol.oneStep();
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void oneStep2(){
        int [][] arr = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,0,0,0}};

        gameOfLife sol = new gameOfLife(arr);
        sol.oneStep();
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void oneStep3(){
        int [][] arr = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0,},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0,0},{0,0,0,1,0,0},{0,1,0,0,1,0},{0,1,0,0,1,0,},{0,0,1,0,0,0},{0,0,0,0,0,0}};

        gameOfLife sol = new gameOfLife(arr);
        sol.oneStep();
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void oneStep4(){
        int [][] arr = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,0,0,1,1,0},{0,0,0,1,1,0},{0,0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,0,0,0,0},{0,0,0,0,1,0},{0,0,0,1,1,0},{0,0,0,0,0,0}};

        gameOfLife sol = new gameOfLife(arr);
        sol.oneStep();
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void oneStep5(){
        int [][] arr = {{0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,1,0,0,0,1,0,0,0},
                            {0,0,0,1,0,0,0,1,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,1,0,0,0,1,0,0,0},
                            {0,0,0,1,0,0,0,1,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0}};

        gameOfLife sol = new gameOfLife(arr);
        sol.oneStep();
        assertArrayEquals(testArr, sol.getBoard());
    }
    //TOURUS GAME OF LIFE NEIGHBORS TESTER
    @Test
    public void torusNeighbors1() {
        int [][] arr = {{1,0,0,1,0},{1,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0},{1,0,0,0,1}};
        int R = 0;
        int C = 4;
        torusGameOfLife sol = new torusGameOfLife(arr);

        assertEquals(7, sol.neighbors(R, C) );
    }

    @Test
    public void torusNeighbors2() {
        int [][] arr = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
        int R = 0;
        int C = 0;
        torusGameOfLife sol = new torusGameOfLife(arr);

        assertEquals(0, sol.neighbors(R, C) );
    }

    @Test
    public void torusNeighbors3() {
        int [][] arr = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0,},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        int R = 3;
        int C = 4;
        torusGameOfLife sol = new torusGameOfLife(arr);

        assertEquals(3, sol.neighbors(R, C) );
    }

    @Test
    public void torusNeighbors4() {
        int [][] arr = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,0,0,1,1,0},{0,0,0,1,1,0},{0,0,0,0,0,0}};
        int R = 1;
        int C = 1;
        torusGameOfLife sol = new torusGameOfLife(arr);

        assertEquals(3, sol.neighbors(R, C) );
    }

    @Test
    public void torusNeighbors5() {
        int [][] arr = {{0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0}};
        int R = 6;
        int C = 3;
        torusGameOfLife sol = new torusGameOfLife(arr);

        assertEquals(2, sol.neighbors(R, C) );
    }

    //GAME OF LIFE ONE STEP TESTER
    @Test
    public void torusOneStep1(){
        int [][] arr = {{1,0,0},{1,0,0},{1,0,0}};
        int [][] testArr = {{1,1,1},{1,1,1},{1,1,1}};

        torusGameOfLife sol = new torusGameOfLife(arr);
        sol.oneStep();
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void torusOneStep2(){
        int [][] arr = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,0,0,0}};

        torusGameOfLife sol = new torusGameOfLife(arr);
        sol.oneStep();
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void torusOneStep3(){
        int [][] arr = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0,},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0,0},{0,0,0,1,0,0},{0,1,0,0,1,0},{0,1,0,0,1,0,},{0,0,1,0,0,0},{0,0,0,0,0,0}};

        torusGameOfLife sol = new torusGameOfLife(arr);
        sol.oneStep();
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void torusOneStep4(){
        int [][] arr = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,0,0,1,1,0},{0,0,0,1,1,0},{0,0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,0,0,0,0},{0,0,0,0,1,0},{0,0,0,1,1,0},{0,0,0,0,0,0}};

        torusGameOfLife sol = new torusGameOfLife(arr);
        sol.oneStep();
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void torusOneStep5(){
        int [][] arr = {{0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,1,0,0,0,1,0,0,0},
                            {0,0,0,1,0,0,0,1,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,1,0,0,0,1,0,0,0},
                            {0,0,0,1,0,0,0,1,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0}};

        torusGameOfLife sol = new torusGameOfLife(arr);
        sol.oneStep();
        assertArrayEquals(testArr, sol.getBoard());
    }
    //TORUS GAME OF LIFE EVOLUTION TESTER
    @Test
    public void evo1(){
        int [][] arr = {{0,0,1},{0,0,1},{0,0,1}};
        int [][] testArr = {{0,0,0},{0,0,0},{0,0,0}};

        torusGameOfLife sol = new torusGameOfLife(arr);
        sol.evolution(2);
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void evo2(){
        int [][] arr = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,0,0,0}};

        torusGameOfLife sol = new torusGameOfLife(arr);
        sol.evolution(3);
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void evo3(){
        int [][] arr = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0,},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0,},{0,0,0,0,0,0},{0,0,0,0,0,0}};

        torusGameOfLife sol = new torusGameOfLife(arr);
        sol.evolution(6);
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void evo4(){
        int [][] arr = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,0,0,1,1,0},{0,0,0,1,1,0},{0,0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,0,0,0,0},{0,0,0,0,1,0},{0,0,0,1,1,0},{0,0,0,0,0,0}};

        torusGameOfLife sol = new torusGameOfLife(arr);
        sol.evolution(5);
        assertArrayEquals(testArr, sol.getBoard());
    }

    @Test
    public void evo5(){
        int [][] arr = {{0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,1,0,1,0,1,0,0,0},
                        {0,0,0,0,1,1,1,0,0,0,0},
                        {0,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0}};
        int [][] testArr = {{0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,1,0,0,0,0,0},
                            {0,0,0,0,0,1,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,1,0,0,0,0,0},
                            {0,0,0,0,0,1,0,0,0,0,0},
                            {0,0,0,0,0,1,0,0,0,0,0},
                            {0,0,0,0,0,1,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,1,1,1,0,0,0,0},
                            {0,0,0,0,0,1,0,0,0,0,0},
                            {0,0,0,0,0,1,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0,0}};

        torusGameOfLife sol = new torusGameOfLife(arr);
        sol.evolution(2);
        assertArrayEquals(testArr, sol.getBoard());
    }

}
