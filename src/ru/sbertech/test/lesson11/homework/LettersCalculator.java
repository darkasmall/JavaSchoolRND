package ru.sbertech.test.lesson11.homework;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by Daria on 18.08.2016.
 */
public class LettersCalculator implements Callable<Integer> {
    private List<String> words;

    @Override
    public Integer call() throws Exception {
        int result = 0;
        for(String word : words){
            for(char c : word.toCharArray()){
                if(Character.isLetter(c))
                    result++;
            }
        }
        return result;
    }

    public LettersCalculator(List<String> words) {
        this.words = words;
    }
}
