package com.example.mediasoft.PostOffice.service;

import com.example.mediasoft.PostOffice.repository.PostOfficeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PostOfficeService {
    private final PostOfficeRepository repository;
}
