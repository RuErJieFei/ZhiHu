package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = ZhihuApiApplication.class)
class SpecialMapperTest {
    @Resource
    private SpecialMapper specialMapper;

    @Test
    void selectAll() {
        List<Map> list = specialMapper.selectAll();
        list.forEach(System.out::println);
    }

    @Test
    void selectRecent() {
        List<Map> list = specialMapper.selectRecent();
        list.forEach(System.out::println);
    }
}