package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.domain.vo.ExploreVo;

import java.util.List;

/**
 * @ClassName ExploreService
 * @Description 发现服务层
 * @Author xiaobinggan
 * @Date 2020/1/22 10:44 上午
 * @Version 1.0
 **/
public interface ExploreService {
    /**
     * 获取发现视图对象
     * @param currentPage
     * @param count
     * @return
     */
   ExploreVo selectByPage(int currentPage,int count);
}