package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.domain.entity.RoundTable;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName RoundTableService
 * @Description 圆桌
 * @Author xiaobinggan
 * @Date 2020/1/18 9:24 上午
 * @Version 1.0
 **/
public interface RoundTableService {
    /**
     * 获取所有圆桌
     * @return
     */
    List<RoundTable> selectAll();

    /**
     * 获取最近圆桌
     * @return
     */
    List<RoundTable> selectRecent();

    /**
     * 按页获取圆桌
     * @param currentPage
     * @param count
     * @return
     */
    List<RoundTable> selectByPage(int currentPage,int count);
}
