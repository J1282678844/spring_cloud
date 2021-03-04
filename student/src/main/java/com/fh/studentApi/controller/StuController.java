package com.fh.studentApi.controller;

import com.fh.studentApi.service.StuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName StuController
 * @Author 阳
 * @Date 2021/3/4 15:07
 * @Version 1.0
 **/
@RestController
@RequestMapping("/student")
public class StuController {

    @Resource
    private StuService stuService;

}
