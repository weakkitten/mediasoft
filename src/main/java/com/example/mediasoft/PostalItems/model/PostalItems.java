package com.example.mediasoft.PostalItems.model;

import com.example.mediasoft.Utility.ItemType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostalItems {
    private long id;
    private ItemType itemType;
    private long recipientId;
    private String recipientAddress;
    private String recipientName;
}
