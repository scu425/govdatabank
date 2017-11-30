package gov.data.bank.stringutil;

import java.util.UUID;

/**
 * Created by zhc on 2017/11/29
 */
public class StringUtil {
    public static String getUUID(){
        String id = UUID.randomUUID().toString();
        id = id.replace("-","");
        return id;
    }
}
