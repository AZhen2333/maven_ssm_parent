package com.itcast.ssm;

import com.itcast.ssm.dao.ItemsMapper;
import com.itcast.ssm.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsMapperTest {

    @Test
    public void testFindItemsById() {
        //获取spring 容器
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
        //获取Mapper
        ItemsMapper itemsMapper =
                applicationContext.getBean(ItemsMapper.class);
        //调用Mapper 方法
        Items items = itemsMapper.findById(1);
        System.out.println(items);
    }
}
