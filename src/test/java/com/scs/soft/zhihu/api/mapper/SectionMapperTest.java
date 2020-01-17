package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.domain.entity.Section;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = ZhihuApiApplication.class)
class SectionMapperTest {
    @Resource
    private SectionMapper sectionMapper;

    @Test
    void getSectionsBySpecialId() {
        List<Section> list = sectionMapper.getSectionsBySpecialId("19591091");
        list.forEach(System.out::println);
    }
}