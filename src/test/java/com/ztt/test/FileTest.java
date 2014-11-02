package com.ztt.test;

import java.io.*;

/**
 * Created by noudisan on 2014/11/2.
 */
public class FileTest {
    public static void main(String[] args) {

    }


    public static void copyByBuffered(File sourceFile, File targetFile) {
        final int BUFFER_SIZE = 1024;
        BufferedInputStream input = null;
        BufferedOutputStream output = null;
        try {
            input = new BufferedInputStream(new FileInputStream(sourceFile));
            output = new BufferedOutputStream(new FileOutputStream(targetFile));

            byte[] b = new byte[BUFFER_SIZE];
            int len;
            while ((len = input.read(b)) != -1) {
                output.write(b, 0, len);
            }
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}