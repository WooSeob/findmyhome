package com.ws.findmyhome.remote.lh.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeasePostResponse {
    @JsonProperty("resHeader")
    private List<ResponseInfo> responseInfo;
    @JsonProperty("dsList")
    private List<LhLeasePost> posts;

    @Getter
    @ToString
    public static class ResponseInfo {
        @JsonProperty("SS_CODE")          // 결과코드
        private String resultCode;
        @JsonProperty("RS_DTTM")          // 출력일시
        private String resultDateTime;
    }

    @Getter
    @ToString
    public static class LhLeasePost {
        @JsonProperty("PAN_SS")             // 공고상태
        private String postStatus;
        @JsonProperty("RNUM")               // 데이터순번
        private String postNum;
        @JsonProperty("PAN_NT_ST_DT")       // 공고 게시일
        private String postedDate;
        @JsonProperty("AIS_TP_CD")          // 매물유형 코드
        private String leaseItemTypeCode;
        @JsonProperty("SPL_INF_TP_CD")      // 공급정보구분코드
        private String supplyInfoTypeCode;
        @JsonProperty("CNP_CD_NM")          // 지역명
        private String regionName;
        @JsonProperty("PAN_ID")             // 공고 id
        private String postId;
        @JsonProperty("UPP_AIS_TP_NM")      // 공고유형명
        private String postTypeName;
        @JsonProperty("AIS_TP_CD_NM")       // 공고세부유형명
        private String postDetailTypeName;
        @JsonProperty("CLSG_DT")            // 공고 마감일
        private String postCloseDate;
        @JsonProperty("PAN_DT")             // 모집 공고일 << 공고일? == 청약 지원 시작일 ??
        private String applyStartDate;
        @JsonProperty("UPP_AIS_TP_CD")      // 상위 매물 유형 코드
        private String parentLeaseItemTypeCode;
        @JsonProperty("PAN_NM")             // 데이터 조회를 위한 키값
        private String postName;
        @JsonProperty("ALL_CNT")            // 전체조회건수
        private String totalCount;
        @JsonProperty("DTL_URL")            // 공고상세 URL
        private String postDetailUrl;
        @JsonProperty("DTL_URL_MOB")        // 모바일 공고상세 URL
        private String mwPostDetailUrl;
        @JsonProperty("CCR_CNNT_SYS_DS_CD") // 고객센터연계시스템구분코드
        private String csCenterLinkSystemTypeCode;
    }
}
