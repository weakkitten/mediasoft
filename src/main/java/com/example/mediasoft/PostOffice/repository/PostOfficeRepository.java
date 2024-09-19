package com.example.mediasoft.PostOffice.repository;

import com.example.mediasoft.PostOffice.model.PostOffice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostOfficeRepository extends JpaRepository<PostOffice, Long> {
}
