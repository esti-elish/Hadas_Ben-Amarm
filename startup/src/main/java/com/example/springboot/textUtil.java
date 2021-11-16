package com.example.springboot;

import org.apache.commons.lang3.StringUtils;

public class textUtil{
   
    public String getText(){
        String[] arr = {"my","func","return","the","string"};
        return StringUtils.abbreviate(arr, 16);
    }
}