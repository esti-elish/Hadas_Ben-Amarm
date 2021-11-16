package com.example.springboot;

import org.apache.commons.lang3.StringUtils;

public class textUtil{
   
    public static String getText(){
        String[] arr = {"my","func","return","the","string"};
        return StringUtils.join(arr,' ');// 16);
    }
}