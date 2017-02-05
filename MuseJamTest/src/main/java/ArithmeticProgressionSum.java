import org.apache.log4j.Logger;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by prabh on 05/02/17.
 */
public class ArithmeticProgressionSum {

    Logger logger = Logger.getLogger(ArithmeticProgressionSum.class.getName());

    public int getAPSum(int start, int diff, int n) {

        try {
            ExecutorService executorService = Executors.newFixedThreadPool(5);

            if (n > 5) {
                Future<Integer> future1 = executorService.submit(() ->
                        getAPSum(start, (start + ((n / 5) - 1) * diff), diff, (n / 5)));
                int sum1 = future1.get();

                Future<Integer> future2 = executorService.submit(() ->
                        getAPSum((start + ((n / 5) - 1) * diff) + 1, (start + (2 * (n / 5) - 1) * diff), diff, (n / 5)));
                int sum2 = future2.get();

                Future<Integer> future3 = executorService.submit(() ->
                        getAPSum((start + (2 * (n / 5) - 1) * diff) + 1, (start + (3 * (n / 5) - 1) * diff), diff, (n / 5)));
                int sum3 = future3.get();

                Future<Integer> future4 = executorService.submit(() ->
                        getAPSum((start + (3 * (n / 5) - 1) * diff) + 1, (start + (4 * (n / 5) - 1) * diff), diff, (n / 5)));
                int sum4 = future4.get();

                Future<Integer> future5 = executorService.submit(() ->
                        getAPSum((start + (4 * (n / 5) - 1) * diff) + 1, (start + (5 * (n / 5) - 1) * diff), diff, (n / 5)));
                int sum5 = future5.get();

                return sum1 + sum2 + sum3 + sum4 + sum5;
            }
            return n * (2 * start + (n - 1) * diff) / 2;

        } catch (InterruptedException | ExecutionException e) {
            logger.error("error", e);
        }
        return 0;
    }

    private int getAPSum(int start, int end, int diff, int n) {
        logger.debug(start);
        logger.debug(end);
        logger.debug(n);
        return n * (start + end) / 2;
    }


}
