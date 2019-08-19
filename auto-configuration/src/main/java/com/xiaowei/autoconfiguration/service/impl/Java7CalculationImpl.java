package com.xiaowei.autoconfiguration.service.impl;

import com.xiaowei.autoconfiguration.service.Calculation;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @ClassName Java7CalculationImpl
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/19 10:44
 **/
@Profile("java7")
@Service
public class Java7CalculationImpl implements Calculation {

    @Override
    public Integer sum(Integer... num) {
        System.out.println("Java7实现");
        int res = 0;
        for (Integer aNum : num) {
            res += aNum;
        }
        return res;
    }
}
