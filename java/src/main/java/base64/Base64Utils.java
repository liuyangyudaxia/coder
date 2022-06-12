package base64;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.*;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * @author yuwei
 * @date 2022/6/13 00:29
 */
public class Base64Utils {
    public static String getPicFormat(String path) {
        String fileType = "";
        try (InputStream in = new BufferedInputStream(Files.newInputStream(Paths.get(path)))) {
            fileType = URLConnection.guessContentTypeFromStream(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileType;
    }


    public static String getImageFormat(Object obj) {
        try {
            ImageInputStream iis = ImageIO.createImageInputStream(obj);
            Iterator<ImageReader> iterator = ImageIO.getImageReaders(iis);
            while (iterator.hasNext()) {
                ImageReader reader = iterator.next();
                return reader.getFormatName();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
