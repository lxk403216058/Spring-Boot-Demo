package com.huazi.rmssecurity.utils;


import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.time.LocalDate;

public class FileUtil {
    public static String saveFile(MultipartFile file, String pathName){
        try {
            File targetFile = new File(pathName);
            if (targetFile.exists()){
                return pathName;
            }
            if (!targetFile.getParentFile().exists()){
                targetFile.getParentFile().mkdir();
            }
            file.transferTo(targetFile);
            return pathName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static boolean deleteFile(String pathName){
        File file = new File(pathName);
        if (file.exists()){
            boolean flag = file.delete();

            if (flag){
                File[] files = file.getParentFile().listFiles();
                if (files == null || files.length == 0){
                    file.getParentFile().delete();
                }
            }
            return flag;
        }
        return false;
    }
    public static String fileMd5(InputStream inputStream){
        try {
            return DigestUtils.md5Hex(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String getPath(){
        return "/" + LocalDate.now().toString().replace("-","/") + "/";
    }
    public static void saveTextFile(String value, String path){
        FileWriter writer = null;
        try{
            File file = new File(path);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdir();
            }

            writer = new FileWriter(file);
            writer.write(value);
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                        if (writer != null){
                            writer.close();
                        }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static String getText(String path){
        File file = new File(path);
        if (!file.exists()){
            return null;
        }

        try {
            return getText(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String getText(InputStream inputStream) {
        InputStreamReader isr = null;
        BufferedReader bufferedReader = null;
        try {
            isr = new InputStreamReader(inputStream, "utf-8");
            bufferedReader = new BufferedReader(isr);
            StringBuilder builder = new StringBuilder();
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                string = string + "\n";
                builder.append(string);
            }

            return builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
