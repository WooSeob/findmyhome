package com.ws.findmyhome.remote.lh;

import com.ws.findmyhome.remote.lh.dto.LeasePostRequest;
import com.ws.findmyhome.remote.lh.dto.LeasePostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LhApiService {
    private final LhApiClient lhApiClient;

    public LeasePostResponse findByPostStartDate(String startDate) {
        LeasePostRequest request = LeasePostRequest.builder()
                .pageSize(10)
                .pageNum(1)
                .postedDate(startDate)
                .build();
        return lhApiClient.getLeasePostByPostDate(
                request.getServiceKey(),
                request.getPageSize(),
                request.getPageNum(),
                request.getPostedDate(),
                request.getPostCloseDate()
        );
    }
}
