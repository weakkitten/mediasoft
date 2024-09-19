package com.example.mediasoft.PostOffice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostOffice {
    private long index;
    private String name;
    private String address;
}
