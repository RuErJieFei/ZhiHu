package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName FavortieController
 * @Description 收藏
 * @Author xiaobinggan
 * @Date 2020/1/20 6:32 下午
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/collection")
public class FavortieController {
    @Resource
    private FavoriteService favoriteService;

    @PostMapping(value = "/page")
    public Result getByPage(int currentPage, int count) {
        return Result.success(favoriteService.selectByPage(currentPage, count));
    }
}
