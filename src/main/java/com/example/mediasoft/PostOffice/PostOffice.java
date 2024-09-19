package com.example.mediasoft.PostOffice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostOffice {
    private int index;
    private String name;
    private String address;
}
