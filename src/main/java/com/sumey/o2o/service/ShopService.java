package com.sumey.o2o.service;

import com.sumey.o2o.dto.ShopExecution;
import com.sumey.o2o.entity.Shop;

import java.io.File;

/**
 * @author sumey
 * @date 2018/9/12 下午12:38
 */
public interface ShopService {
    ShopExecution addShop(Shop shop, File shopImg);
}
