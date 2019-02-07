package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes) {

        ImageReader imageReader = null;

        if (imageTypes == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        if (imageTypes.equals(ImageTypes.JPG)) {
            imageReader = new JpgReader();
        }
        if (imageTypes.equals(ImageTypes.PNG)) {
            imageReader = new PngReader();
        }
        if (imageTypes.equals(ImageTypes.BMP)) {
            imageReader = new BmpReader();
        }




        return imageReader;
    }
}
