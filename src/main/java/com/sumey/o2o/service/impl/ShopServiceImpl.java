package com.sumey.o2o.service.impl;

import com.sumey.o2o.dao.ShopDao;
import com.sumey.o2o.dto.ShopExecution;
import com.sumey.o2o.entity.Shop;
import com.sumey.o2o.enums.ShopStateEnum;
import com.sumey.o2o.exceptions.ShopOperationException;
import com.sumey.o2o.service.ShopService;
import com.sumey.o2o.util.ImageUtil;
import com.sumey.o2o.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Date;

/**
 * @author sumey
 * @date 2018/9/12 下午12:39
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    //添加店铺事务
    @Override
    @Transactional
    public ShopExecution addShop(Shop shop, File shopImg) {
        //空值判断
        if (null == shop) {
            return new ShopExecution(ShopStateEnum.NULL_SHOP);
        }
        try {
            //设置店铺状态
            shop.setEnableStatus(0);//审核中
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());
            int effectedNum = shopDao.insertShop(shop);  //添加
            if (effectedNum <= 0) {
                throw new ShopOperationException("店铺创建失败");
            } else {
                if (shopImg != null) {
                    try {
                        addShopImg(shop, shopImg);  //存储图片
                    } catch (Exception e) {
                        throw new ShopOperationException("addShopImg error:" + e.getMessage());
                    }
                    //更新店铺的图片地址
                    effectedNum = shopDao.updateShop(shop);
                    if (effectedNum <= 0) {
                        throw new ShopOperationException("更新图片地址失败");
                    }
                }

            }
        } catch (Exception e) {
            throw new ShopOperationException("add shop error:" + e.getMessage());
        }
        return new ShopExecution(ShopStateEnum.CHECK, shop);
    }

    private void addShopImg(Shop shop, File shopImg) {
        //获取shop图片目录的相对值路径
        String dest = PathUtil.getShopImgPath(shop.getShopId());
        String shopImgAddr = ImageUtil.generateThumbnail(shopImg, dest);
        shop.setShopImg(shopImgAddr);
    }
}
