package com.sumey.o2o.dao;

import com.sumey.o2o.BaseTest;
import com.sumey.o2o.entity.Area;
import com.sumey.o2o.entity.PersonInfo;
import com.sumey.o2o.entity.Shop;
import com.sumey.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * create by
 *
 * @author sumey
 * @date 2018/9/1 下午7:53
 */
public class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;

   /* @Test
    public void testInsertShop() {
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
        shop.setShopName("测试的店铺");
        shop.setShopDesc("test描述");
        shop.setShopAddr("test地址");
        shop.setPhone("test电话号码");
        shop.setShopImg("test图片");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("test建议");

        int effectedNum = shopDao.insertShop(shop);
        assertEquals(1, effectedNum);
    }*/

    @Test
    public void testUpdateShop() {
        Shop shop = new Shop();
        shop.setShopId(1L);
        shop.setShopDesc("test描述更改");
        shop.setShopAddr("test地址更改");
        shop.setLastEditTime(new Date());
        int effectedNum = shopDao.updateShop(shop);
        assertEquals(1, effectedNum);
    }
}
