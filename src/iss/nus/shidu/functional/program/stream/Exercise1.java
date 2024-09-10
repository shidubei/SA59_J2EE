package iss.nus.shidu.functional.program.stream;

import java.util.stream.IntStream;

public class Exercise1 {
    public static void main(String[] args) {
//        orderedSequenceStream();
        orderedEvenNaturalSequenceStream();
    }
    public static void orderedSequenceStream(){
        IntStream.rangeClosed(1,100).forEach(System.out::println);
    }
    public static void orderedEvenNaturalSequenceStream(){
        IntStream.rangeClosed(1,100).filter(x->x%2==0).forEach(System.out::println);
    }
}
