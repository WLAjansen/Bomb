public class Bomb
{

    public static void main(String[] args)  throws InterruptedException {

        {
            int counter = 10;
            do
            {
                System.out.println(counter + " Seconden");
                counter--;
                Thread.sleep(1000);
            } while (counter !=0);
            System.out.println("\nBOOM!");
        }
    }
}