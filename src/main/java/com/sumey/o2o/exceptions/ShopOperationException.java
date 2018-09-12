package com.sumey.o2o.exceptions;

/**
 * @author sumey
 * @date 2018/9/12 下午10:15
 */

//运行时异常，在发生错误时可以保证事务性，执行失败就回滚
public class ShopOperationException extends RuntimeException {
    //为什么需要序列化
    private static final long serialVersionUID = 2361446884822298905L;

    public ShopOperationException(String msg) {
        super(msg);

    }
}
