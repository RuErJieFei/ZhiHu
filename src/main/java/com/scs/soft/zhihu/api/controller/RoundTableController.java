package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName RoundTableController
 * @Description 圆桌
 * @Author xiaobinggan
 * @Date 2020/1/18 9:28 上午
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/roundtable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping(value = "/all")
    public Result getAll() {
        return Result.success(roundTableService.selectAll());
    }

    @GetMapping
    public Result getRecent() {
        return Result.success(roundTableService.selectRecent());
    }

    @PostMapping(value = "/page")
    public Result getByPage(int currentPage, int count) {
        return Result.success(roundTableService.selectByPage(currentPage, count));
    }
}
