package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.domain.vo.ExploreVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = ZhihuApiApplication.class)
class ExploreServiceTest {
    @Resource
    private ExploreService exploreService;
    @Test
    void selectByPage() {
        ExploreVo exploreVo = exploreService.selectByPage(1,2);
        System.out.println(exploreVo);
    }
}