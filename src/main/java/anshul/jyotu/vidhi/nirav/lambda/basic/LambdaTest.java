package anshul.jyotu.vidhi.nirav.lambda.basic;

/**
 * Created by akd on 28/11/2014.
 */
public class LambdaTest {

    public static void main(String[] args) {

        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run 1 old school");
            }
        };

        run1.run();

        Runnable run2 = () -> System.out.println("run2 new style");

        run2.run();
    }
}
