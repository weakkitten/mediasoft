package com.example.mediasoft.PostItemsTrace.repository;

import com.example.mediasoft.Utility.TraceAction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostItemsTraceRepository extends JpaRepository<TraceAction, Long> {
}
