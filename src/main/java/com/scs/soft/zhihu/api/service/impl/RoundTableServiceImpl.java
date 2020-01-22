package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.domain.entity.RoundTable;
import com.scs.soft.zhihu.api.mapper.RoundTableMapper;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName RoundTableServiceImpl
 * @Description 圆桌
 * @Author xiaobinggan
 * @Date 2020/1/18 9:26 上午
 * @Version 1.0
 **/
@Service
public class RoundTableServiceImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;

    @Override
    public List<RoundTable> selectAll() {
        return roundTableMapper.selectAll();
    }

    @Override
    public List<RoundTable> selectByPage(int currentPage, int count) {
        int dealCount = (currentPage - 1) * count;
        return roundTableMapper.selectByPage(dealCount, count);
    }

    @Override
    public List<RoundTable> selectRecent() {
        return roundTableMapper.selectRecent();
    }
}
