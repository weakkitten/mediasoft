package com.example.mediasoft.PostOffice.model.Dto;

import com.example.mediasoft.PostOffice.model.PostOffice;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PostOfficeMapper {
    public static PostOffice toPostOffice(NewPostOffice newPostOffice) {
        return PostOffice.builder()
                         .address(newPostOffice.getAddress())
                         .name(newPostOffice.getName())
                         .build();
    }
}
