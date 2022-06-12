package base64;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author yuwei
 * @date 2022/6/13 00:46
 */
class Base64UtilsTest {

    @Test
    void getPicFormat() {
        System.out.println(Base64Utils.getPicFormat("/Users/yuwei/Pictures/123.png"));
    }

    @Test
    void getImageFormat() {
        System.out.println(Base64Utils.getImageFormat(new File("/Users/yuwei/Pictures/123.png")));
    }
}