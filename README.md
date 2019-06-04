# Utils 项目介绍
    各类方法
# Gradle
    allprojects {
      repositories {
        jcenter()
      }
    }

    dependencies {
        implementation 'cn.edu.caztc:utilslibrary:1.0.4'
    }
    
    注意：Android Studio gradle版本大于3.0则为implementation，低于3.0compile 
# 目录
### 数据加密解密
#### 1.MD5加密（没解密）
#### 2.RC4加密/解密
#### 3.Authcode加密/解密
#### 4.DES加密/解密
### 编码转换
##### 1.通用编码转换
##### 2.URL编码转换
##### 3.BASE64编码/解码

##### 1.MD5加密（没解密）
    方法：String md5(String inStr)
    介绍：md5加密，返回32位md5码。参数1，欲加密文本
    例子： System.out.println("MD5后="+ md5("1179307527"));
          System.out.println("双MD5后="+ md5(md5("1179307527")));
##### 2.
