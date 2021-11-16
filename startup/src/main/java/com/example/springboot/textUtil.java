package com.example.springboot;

import org.apache.commons.lang3.StringUtils;

public class textUtil{
   
    public string getText(){
        String[] arr = {"my","func","return","the","string"};
        return StringUtils.abbreviate(sentence, 16);
    }
}