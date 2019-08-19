package com.xiaowei.autoconfiguration.service.impl;

import com.xiaowei.autoconfiguration.service.Calculation;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @ClassName Java8CalculationImpl
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/19 10:47
 **/
@Profile("java8")
@Service
public class Java8CalculationImpl implements Calculation {


    @Override
    public Integer sum(Integer... num) {
        System.out.println("Java8 实现");
        return Stream.of(num).reduce(0, Integer::sum);
    }
}
