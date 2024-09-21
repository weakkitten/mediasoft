package com.example.mediasoft.PostOffice.model.Dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewPostOffice {
    private String name;
    private String address;
}
