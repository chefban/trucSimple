import exception.NotValidParameterException;

public class myGame {
    public static void main(String[] args) {
        GameOfLife myGameOfLife = new GameOfLife();

        try {
            System.out.println("********My beautiful Game of life**************");
            myGameOfLife.play(3,3,5);
            System.out.println("***********************************************");
        } catch (NotValidParameterException e) {
            e.printStackTrace();
        }
    }
}
