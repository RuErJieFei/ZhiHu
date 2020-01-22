package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.domain.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableServiceTest {
    @Resource
    private RoundTableService roundTableService;

    @Test
    void selectAll() {
    }

    @Test
    void selectRecent() {
    }

    @Test
    void selectByPage() throws Exception {
        List<RoundTable> list = roundTableService.selectByPage(2, 9);
        list.forEach(System.out::println);
    }
}