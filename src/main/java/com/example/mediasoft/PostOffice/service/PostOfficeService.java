package com.example.mediasoft.PostOffice.service;

import com.example.mediasoft.PostOffice.model.Dto.NewPostOffice;
import com.example.mediasoft.PostOffice.model.Dto.PostOfficeMapper;
import com.example.mediasoft.PostOffice.model.PostOffice;
import com.example.mediasoft.PostOffice.repository.PostOfficeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PostOfficeService {
    private final PostOfficeRepository repository;

    public void createPostOffice(NewPostOffice newPostOffice) {
        PostOffice postOffice = PostOfficeMapper.toPostOffice(newPostOffice);
        repository.save(postOffice);
    }
}
