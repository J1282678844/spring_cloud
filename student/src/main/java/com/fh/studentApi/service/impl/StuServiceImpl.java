package com.fh.studentApi.service.impl;

import com.fh.studentApi.mapper.StuMapper;
import com.fh.studentApi.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName StuServiceImpl
 * @Author 阳
 * @Date 2021/3/4 15:18
 * @Version 1.0
 **/
@Service
public class StuServiceImpl implements StuService {

    @Resource
    private StuMapper stuMapper;

}
