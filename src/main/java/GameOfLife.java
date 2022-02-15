import exception.NotValidParameterException;

import java.util.Random;

public class GameOfLife {



    public int play(int lines, int columns, int iterations, int x, int y) throws NotValidParameterException {
        verifyConstraint(lines,columns,iterations);
        int[][] myMatrix = generateMatrix(lines, columns);
        displayMatrix(myMatrix);
        iterate(myMatrix, iterations);

        return myMatrix[x][y];
    }


    public boolean verifyConstraint(int n, int m , int p) throws NotValidParameterException {
        if(n < 1 || n <=0 )
            throw new NotValidParameterException();
        if(m > 1000 || m <=0)
            throw new NotValidParameterException();
        if(p > 100000 || p <=0)
            throw new NotValidParameterException();
        return true;
    }

    public int[][] generateMatrix(int n, int m) {
        Random random = new Random();
        int[][] matrix = new int[n][m];
        for(int t =0; t<n; t++){
            for(int u =0; u<n; u++){
                matrix[t][u] = random.nextBoolean() ? 1 : 0;
            }
        }
        System.out.println("Welcome the matrix is generated");

        return matrix;
    }

    public int[][] iterate(int[][] tab, int iteration) throws NotValidParameterException {
        int[][] tab2 = tab;
        for(int k =0; k<iteration; k++){
            System.out.println("*** Iteration: "+ k+" ***");
            for (int i=0; i<tab.length; i++){
                for(int j=0; j<tab[0].length; j++){
                    if(sameColorAdjacent(tab, i, j))
                        tab2[i][j]= (tab[i][j]==1?0:1);
                }
            }
            tab= tab2.clone();
            displayMatrix(tab2);
        }

        return tab2;
    }

    public boolean sameColorAdjacent(int[][] tab, int i, int j) throws NotValidParameterException {
        if(i>= tab.length || j >= tab[0].length)
            throw new NotValidParameterException("Coordonnées incorrectes");
        if(j+1 < tab[0].length){
            if(tab[i][j+1]==tab[i][j])
                return true;
        }
        if(j-1 > 0){
            if(tab[i][j-1]==tab[i][j])
                return true;
        }
        if(i+1 < tab.length){
            if(tab[i+1][j]==tab[i][j])
                return true;
        }
        if(i-1 > 0){
            if(tab[i-1][j]==tab[i][j])
                return true;
        }
        return false;
    }

    public void displayMatrix(int[][] tab){
        for (int i=0; i<tab.length; i++){
            for (int j=0; j<tab.length; j++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
