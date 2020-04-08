package cn.train.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * 生成文件的hashcode
 */
public class MD5Util {

    public static String getHashCode(String filePath){
        String md5HashCode32= null;
        try {
            md5HashCode32 = md5HashCode32(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return md5HashCode32;
    }

    /**
     * 获取文件MD5值
     */
    public static String md5HashCode(String filePath) throws FileNotFoundException{
        FileInputStream fis=new FileInputStream(filePath);
        return md5HashCode(fis);
    }

    /**
     * 保证文件MD5值为32位
     */
    public static String md5HashCode32(String filePath) throws FileNotFoundException{
        FileInputStream fis=new FileInputStream(filePath);
        return md5HashCode32(fis);
    }
    /**
     * java获取文件的MD5值
     */
    public static String md5HashCode(InputStream fis){
        try {
            //MD5转换器
            MessageDigest messageDigest=MessageDigest.getInstance("MD5");

            //分多次读入一个文件 占用内存较少
            byte[] buffer=new byte[1024];
            int length=-1;
            //当输入流不为空
            while ((length=fis.read(buffer,0,1024))!=-1){
                messageDigest.update(buffer,0,length);
            }
            fis.close();

            byte[] md5Bytes =messageDigest.digest();
            BigInteger bigInt=new BigInteger(1,md5Bytes);
            //转换为16进制
            return bigInt.toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    /**
     * java计算文件32位MD5值
     */
    public static String md5HashCode32(InputStream fis){
        try {
            //MD5转换器
            MessageDigest messageDigest=MessageDigest.getInstance("MD5");

            //分多次读入一个文件 占用内存较少
            byte[] buffer=new byte[1024];
            int length=-1;
            //当输入流不为空
            while ((length=fis.read(buffer,0,1024))!=-1){
                messageDigest.update(buffer,0,length);
            }
            fis.close();

            byte[] md5Bytes =messageDigest.digest();
            StringBuffer stringBuffer=new StringBuffer();
            for (int i=0;i<md5Bytes.length;i++){
                int val=((int)md5Bytes[i]) & 0xff;//解释见下方
                //若
                if (val<16){
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(val));
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 方法md5HashCode32 中     ((int) md5Bytes[i]) & 0xff   操作的解释：
     * 在Java语言中涉及到字节byte数组数据的一些操作时，经常看到 byte[i] & 0xff这样的操作，这里就记录总结一下这里包含的意义：
     * 1、0xff是16进制（十进制是255），它默认为整形，二进制位为32位，最低八位是“1111 1111”，其余24位都是0。
     * 2、&运算: 如果2个bit都是1，则得1，否则得0；
     * 3、byte[i] & 0xff：首先，这个操作一般都是在将byte数据转成int或者其他整形数据的过程中；使用了这个操作，最终的整形数据只有低8位有数据，其他位数都为0。
     * 4、这个操作得出的整形数据都是大于等于0并且小于等于255的
     */
}
