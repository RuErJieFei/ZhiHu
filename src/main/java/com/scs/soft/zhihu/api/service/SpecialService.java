package com.scs.soft.zhihu.api.service;

import java.util.List;
import java.util.Map;
/**
 * @ClassName SpecialMapper
 * @Description 专题服务层
 * @Author xiaobinggan
 * @Date 2020/1/15 12:41 下午
 * @Version 1.0
 **/
public interface SpecialService {
    /**
     * 查询所有标签
     *
     * @return
     */
    List<Map> selectAll();

    /**
     * 查询最近专题
     *
     * @return
     */
    List<Map> selectRecent();
}
