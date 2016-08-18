package ru.sbertech.test.lesson11.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Daria on 18.08.2016.
 */

public class MyExecutorService {
    public static int calcLettersInList(int poolSize, List<String> words) {

        ExecutorService executor = Executors.newFixedThreadPool(poolSize);
        List<Future<Integer>> futureList = new ArrayList<>();
        int lettersSum = 0;

        int interval;
        int startPos = 0;
        int endPos = 0;

        if (words.size() <= poolSize)
        {
            poolSize = words.size();
            interval = 1;
        }
        else {
            interval = words.size() / poolSize;
            int modi = words.size() % poolSize;
            endPos = modi;
        }
        endPos += interval;


        for (int i = 0; i < poolSize; ++i){
            Future<Integer> tmpFuture = executor.submit(new LettersCalculator(words.subList(startPos, endPos)));
            futureList.add(tmpFuture);

            try {
                lettersSum += tmpFuture.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            startPos = endPos;
            endPos += interval;
        }
        return lettersSum;
    }
}
