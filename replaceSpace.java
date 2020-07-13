import java.util.*;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < length; i++){
            if(iniString.charAt(i)==' '){
                str.append("%20");
            }else{
                str.append(iniString.charAt(i));
            }
        }
        return str.toString();
    }
}