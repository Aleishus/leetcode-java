package other;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Test {

    // select depart_no from salse where sales_amount >10000000 order by sales_amount desc;

    //select from 、
    // 哪个字段重复
    //select * from sales
    //where employee_no  in (select employee_no   from  sales  group by   employee_no having count(employee_no) > 1)

    //select * from sales where employee_no  in (select employee_no   from employee_no   group by   employee_no having count(employee_no) > 1)
    public int count( String str, String filePath )  {
        int count = 0;
        Pattern p = Pattern.compile(str);
        try {
            File f = new File(filePath);
            if(f.isDirectory()){
                return 0;
            }
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = null;
            while (( line = reader.readLine() ) != null) {
                Matcher m = p.matcher(line);
                while (m.find()) {
                    count++;
                }
                //可以统计多次啊
            }
        } catch (FileNotFoundException e) {
            count = 0 ;
        } catch (IOException e) {
           count = 0;
        }
        return count;
    }


    public boolean mov( String s1, String s2 ) {


        for (int i = 1; i < s1.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s1.substring(i)).append(s1.substring(0, i));
            if (sb.toString().contains(s2)) {
                return true;
            }
        }
        return false;
    }


    public static void main( String[] args ) {
        String s ="abcsdsdsdabc";
        Pattern p = Pattern.compile("abc");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println("hah");
        }

    }


}
