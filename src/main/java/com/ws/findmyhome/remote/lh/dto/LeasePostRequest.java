package com.ws.findmyhome.remote.lh.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LeasePostRequest {
    @JsonProperty("ServiceKey")
    private String serviceKey;      // [필] 공공데이터포털에서 받은 인증키
    @JsonProperty("PG_SZ")
    private int pageSize;           // [필] 한 페이지 결과 수
    @JsonProperty("PAGE")
    private int pageNum;            // [필] 페이지 번호
    @JsonProperty("PAN_NM")
    private String PAN_NM;          // 공고명으로 조회
    @JsonProperty("UPP_AIS_TP_CD")
    private String UPP_AIS_TP_CD;   // 공고유형코드
    @JsonProperty("CNP_CD")
    private String CNP_CD;          // 지역코드
    @JsonProperty("PAN_SS")
    private String PAN_SS;          // 공고상태코드
    @JsonProperty("PAN_NT_ST_DT")
    private String postedDate;      // [필] 공고게시일
    @JsonProperty("CLSG_DT")
    private String postCloseDate;   // [필] 공고마감일
}
