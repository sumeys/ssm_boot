package com.sumey.o2o.dao;

import com.sumey.o2o.BaseTest;
import com.sumey.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author sumey
 * @date 2018/9/14 上午9:07
 */
public class ShopCategoryDaoTest extends BaseTest {
    @Autowired
    private ShopCategoryDao shopCategoryDao;

    @Test
    public void testQueryShopCategory() {
        ShopCategory shopCategory = new ShopCategory();
        ShopCategory parentShopCategory = new ShopCategory();
        parentShopCategory.setShopCategoryId(1L);

        shopCategory.setParent(parentShopCategory);

        List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(shopCategory);
        //assertEquals(1, shopCategoryList.size());
//        for (ShopCategory s:shopCategoryList
//             ) {
//            System.out.println(s);
//        }
        System.out.println(shopCategoryList.get(0).getShopCategoryName());
    }

}
