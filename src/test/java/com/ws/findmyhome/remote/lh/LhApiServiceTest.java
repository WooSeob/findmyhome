package com.ws.findmyhome.remote.lh;

import com.ws.findmyhome.remote.lh.dto.LeasePostResponse;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class LhApiServiceTest {
    @Autowired
    private LhApiService lhApiService;
    @Test
    public void apiCallTest() {
        LeasePostResponse response = lhApiService.findByPostStartDate("20230520");
        log.info("res: {}", response);
        Assertions.assertThat(response).isNotNull();
    }
}
