package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.domain.entity.Column;
import com.scs.soft.zhihu.api.domain.vo.ExploreVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = ZhihuApiApplication.class)
class ColumnMapperTest {
    @Resource
    private ColumnMapper columnMapper;

    @Test
    void selectByPage() {
        List<Column> list = columnMapper.selectByPage(2, 2);
        list.forEach(System.out::println);
    }
}