package com.ws.findmyhome.domain.homepost.api;

import com.ws.findmyhome.core.annotations.InternalV1Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@InternalV1Api
@RequiredArgsConstructor
public class PostBatchApiV1Controller {
    @PostMapping("/collect/daily/lh")
    public void collectDailyLhPost() {

    }
}
