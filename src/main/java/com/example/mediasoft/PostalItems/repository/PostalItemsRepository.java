package com.example.mediasoft.PostalItems.repository;

import com.example.mediasoft.PostalItems.model.PostalItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostalItemsRepository extends JpaRepository<PostalItems, Long> {
}
