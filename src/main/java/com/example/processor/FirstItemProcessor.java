package com.example.processor;

import org.springframework.batch.item.*;
import org.springframework.stereotype.Component;

@Component
public class FirstItemProcessor implements ItemProcessor<Integer, Long> {


    @Override
    public Long process(Integer item) throws Exception {
        System.out.println("Inside Item processor");
        return Long.valueOf(item + 20);// conversion of integer to long and add 20 to item input
    }
}
