package com.yuqiliu.feign.impl;

import com.yuqiliu.entity.Student;
import com.yuqiliu.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author yuqiliu
 * @create 2020-04-14  21:54
 */

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}
