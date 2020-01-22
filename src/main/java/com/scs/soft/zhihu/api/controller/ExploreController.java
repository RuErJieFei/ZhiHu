package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.domain.vo.ExploreVo;
import com.scs.soft.zhihu.api.service.ExploreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName ExploreController
 * @Description 发现
 * @Author xiaobinggan
 * @Date 2020/1/22 11:08 上午
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/explore")
public class ExploreController {
    @Resource
    private ExploreService exploreService;

    @PostMapping(value = "/page")
    ExploreVo selectByPage(int currentPage, int count) {
        return exploreService.selectByPage(currentPage, count);
    }
}
