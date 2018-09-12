package com.sumey.o2o.util;

/**
 * create by
 *
 * @author sumey
 * @date 2018/9/1 下午9:05
 */
public class PathUtil {
    private static String separator = System.getProperty("file.separator");

    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/projectdev/image";
        } else {
            basePath = "/Users/didi/Pictures/";
        }

        basePath = basePath.replace("/", separator);
        return basePath;
    }

    public static String getShopImgPath(long shopId) {
        String imgPath = "upload/item/shop" + shopId + "/";
        return imgPath.replace("/", separator);
    }
}
