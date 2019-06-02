package cn.edu.caztc.utils;

import static cn.edu.caztc.utilslibrary.MD5Util.convertMD5;
import static cn.edu.caztc.utilslibrary.MD5Util.md5;
import static cn.edu.caztc.utilslibrary.MD5Util.md5Decode;

public class test {
    public static void main(String[] args) {
        String s="17717798115";
        System.out.println((md5Decode("a6aeb3ffa55fc7d664406af9c3bd0f1b")));
        System.out.println("原始="+s);
        System.out.println("MD5后="+md5(s));
        System.out.println("加密后="+convertMD5(s));
        System.out.println("解密="+convertMD5(convertMD5(s)));
        System.out.println(md5("17717798115"));
    }
}
