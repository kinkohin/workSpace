
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
    　　//outputされるファイル指定　
        File file = new File("in.txt");
        convertFile(file);

    }

    public static void convertFile(File inFile) throws IOException {
        //outputファイル名指定
        File outFile = new File("out.txt");
        try(BufferedReader b_reader = new BufferedReader(new InputStreamReader(new FileInputStream(inFile),"Shift_jis"));
            PrintWriter p_writer    = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile),"UTF-8")))){
            String s;
            while((s = b_reader.readLine())!=null){
                if(s.contains("ABC_DEF")){
                    p_writer.println(s);
                    System.out.println(s);
                }
//                if(s.contains("ABC_DEF_COLUM")){
//                    p_writer.println(s);
//                    System.out.println(s);
//                }
//                System.out.println(s);
            }
        }
    }
}
