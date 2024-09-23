package com.example.mediasoft.PostalItems.service;

import com.example.mediasoft.PostalItems.repository.PostalItemsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostalItemsService {
    private final PostalItemsRepository repository;
}
