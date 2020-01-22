package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.domain.entity.Favorite;

import java.util.List;

/**
 * @ClassName FavoriteService
 * @Description 收藏服务层
 * @Author xiaobinggan
 * @Date 2020/1/20 6:26 下午
 * @Version 1.0
 **/
public interface FavoriteService {
    /**
     * 按页获取收藏
     *
     * @param currentPage
     * @param count
     * @return
     */
    List<Favorite> selectByPage(int currentPage, int count);
}