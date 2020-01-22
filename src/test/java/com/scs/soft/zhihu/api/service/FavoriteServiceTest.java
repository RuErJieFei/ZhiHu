package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.domain.entity.Favorite;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = ZhihuApiApplication.class)
class FavoriteServiceTest {
    @Resource
    private FavoriteService favoriteService;

    @Test
    void selectByPage() {
        List<Favorite> list = favoriteService.selectByPage(1, 4);
        list.forEach(System.out::println);
    }
}