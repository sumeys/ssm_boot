package com.sumey.o2o.service;

import com.sumey.o2o.BaseTest;
import com.sumey.o2o.dto.ShopExecution;
import com.sumey.o2o.entity.Area;
import com.sumey.o2o.entity.PersonInfo;
import com.sumey.o2o.entity.Shop;
import com.sumey.o2o.entity.ShopCategory;
import com.sumey.o2o.enums.ShopStateEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author sumey
 * @date 2018/9/12 下午10:24
 */
public class ShopServiceTest extends BaseTest {
    @Autowired
    private ShopService shopService;

    @Test
    public void TestAddShop() {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(1);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺111");
        shop.setShopDesc("test描述111");
        shop.setShopAddr("test地址111");
        shop.setPhone("test电话号码111");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());
        shop.setAdvice("test建议111l");

        File shopImg = new File("/Users/didi/Desktop/dw.JPG");
        ShopExecution se = shopService.addShop(shop, shopImg);
        assertEquals(ShopStateEnum.CHECK.getState(), se.getState());
    }

}
