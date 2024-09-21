package com.example.mediasoft.PostOffice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Table(name = "PostOffice", schema = "public",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "index")
        })
public class PostOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;
    private String name;
    private String address;
}
