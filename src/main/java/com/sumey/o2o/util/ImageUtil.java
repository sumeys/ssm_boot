package com.sumey.o2o.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * create by
 *
 * @author sumey
 * @date 2018/9/1 下午8:47
 */
public class ImageUtil {
    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();

    public static String generateThumbnail(CommonsMultipartFile thumbnail, String targetAddr) {
        //用户传来的图片名字可能会重复，这里要随机生成名字
        String realFileName = getRandomFileName();
        String extension = getFileExtension(thumbnail);
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
        try {
            Thumbnails.of(thumbnail.getInputStream()).size(200, 200)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.png")), 0.5f)
                    .outputQuality(0.8f).toFile(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return relativeAddr;
    }

    //获取目标路径所涉及的目录，如/didi/sumey/img/1.jpg
    //则 didi sumey img 这三个文件夹都得自动创建出来
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }

    }

    //获取输入文件的扩展名
    private static String getFileExtension(CommonsMultipartFile cFile) {
        String originFileName = cFile.getOriginalFilename();
        return originFileName.substring(originFileName.lastIndexOf("."));

    }

    //生成随机文件名，当前年月日时分秒+五位随机数
    private static String getRandomFileName() {
        int ranNum = r.nextInt(89999) + 10000;
        String nowTimeStr = simpleDateFormat.format(new Date());
        return nowTimeStr + ranNum;
    }
}
