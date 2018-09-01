package com.sumey.o2o.dto;

import com.sumey.o2o.entity.Shop;
import com.sumey.o2o.enums.ShopStateEnum;

import java.util.List;

/**
 * create by
 *
 * @author sumey
 * @date 2018/9/1 下午10:05
 */
public class ShopExecution {
    private int state; //结果状态
    private String stateInfo; // 状态标识
    private int count;  // 店铺数量
    private Shop shop;  //操作的店铺（增删改的时候用到）
    private List<Shop> shopList;  //shop列表，查询shop的时候用

    public ShopExecution() {

    }

    //店铺操作失败时候使用的构造器
    public ShopExecution(ShopStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    // 店铺操作成功时候的构造器
    public ShopExecution(ShopStateEnum stateEnum, Shop shop) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shop = shop;
    }

    //店铺操作成功时候的构造器
    public ShopExecution(ShopStateEnum stateEnum, List<Shop> shopList) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shopList = shopList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }
}
