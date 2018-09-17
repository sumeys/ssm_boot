package com.sumey.o2o.service;

import com.sumey.o2o.entity.ShopCategory;

import java.util.List;

/**
 * @author sumey
 * @date 2018/9/14 上午9:29
 */
public interface ShopCategoryService {
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);

}
