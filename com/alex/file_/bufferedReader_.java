package com.alex.file_;

import java.io.*;

public class bufferedReader_ {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\hello.txt");//这是创建了一个File对象
        FileReader fileReader = new FileReader(file);//创建了一个字符输入节点流fileReader，并将file传入
        BufferedReader bufferedReader = new BufferedReader(fileReader);//创建一个带缓冲的字符输入处理流，将节点流作为参数传入
        //接下来就可以使用处理流方便高效的文件进行操作
        String s;
        while((s = bufferedReader.readLine())!=null){
            System.out.println(s);
        }
        //使用完毕关闭处理流 内层的节点流会自动关闭
        bufferedReader.close();

    }
}
