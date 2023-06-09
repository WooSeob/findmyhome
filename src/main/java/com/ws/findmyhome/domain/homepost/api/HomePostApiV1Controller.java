package com.ws.findmyhome.domain.homepost.api;

import com.ws.findmyhome.core.annotations.ServiceV1Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@ServiceV1Api
@RequiredArgsConstructor
public class HomePostApiV1Controller {
    @GetMapping("/test")
    public String test() {
        return "hi";
    }
}
