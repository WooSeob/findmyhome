package com.ws.findmyhome.remote.lh;

import com.ws.findmyhome.remote.lh.dto.LeasePostResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "lhApiClient", url = "http://apis.data.go.kr/B552555/lhLeaseNoticeInfo1", configuration = LhApiConfiguration.class)
public interface LhApiClient {
    @GetMapping(value = "/lhLeaseNoticeInfo1", consumes = MediaType.APPLICATION_JSON_VALUE)
    LeasePostResponse getLeasePostByPostDate(
            @RequestParam("serviceKey") String serviceKey,
            @RequestParam("PG_SZ") int pageSize,
            @RequestParam("PAGE") int pageNum,
            @RequestParam("PAN_NT_ST_DT") String postedDate,
            @RequestParam("CLSG_DT") String postCloseDate
    );

    // ex)
    // http://apis.data.go.kr/B552555/lhLeaseNoticeInfo1/lhLeaseNoticeInfo1?serviceKey=인증키(URL Encode)&PG_SZ=10&PAGE
}
