package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.mapper.SpecialMapper;
import com.scs.soft.zhihu.api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName SpecialServiceImpl
 * @Description 专题服务层实现类
 * @Author xiaobinggan
 * @Date 2020/1/15 3:46 下午
 * @Version 1.0
 **/
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    private SpecialMapper specialMapper;

    @Override
    public List<Map> selectAll() {
        return specialMapper.selectAll();
    }

    @Override
    public List<Map> selectRecent() {
        return specialMapper.selectRecent();
    }
}
