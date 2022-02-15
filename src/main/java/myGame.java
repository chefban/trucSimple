import exception.NotValidParameterException;

public class myGame {
    public static void main(String[] args) {
        GameOfLife myGameOfLife = new GameOfLife();

        try {
            System.out.println("********My beautiful Game of life**************");
            System.out.println(myGameOfLife.play(3,3,5,2,1));
            System.out.println("***********************************************");
        } catch (NotValidParameterException e) {
            e.printStackTrace();
        }
    }
}
