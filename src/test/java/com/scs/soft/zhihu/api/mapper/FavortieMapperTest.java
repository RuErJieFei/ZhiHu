package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.domain.entity.Favorite;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

@SpringBootTest(classes = ZhihuApiApplication.class)
class FavortieMapperTest {

    @Resource
    private FavoriteMapper favortieMapper;
    @Test
    void selectByPage() {
        List<Favorite> list = favortieMapper.selectByPage(0,4);
        list.forEach(System.out::println);
    }
}