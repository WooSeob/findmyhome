package com.ws.findmyhome.remote.lh;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ws.findmyhome.remote.lh.dto.LeasePostResponse;
import feign.FeignException;
import feign.Logger;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import io.micrometer.core.instrument.util.IOUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.lang.reflect.Type;

@Slf4j
public class LhApiConfiguration {
    @Bean
    public Decoder decoder() {
        return new LhDecoder();
    }

    @Bean
    public Logger.Level logger() {
        return Logger.Level.FULL;
    }

    static class LhDecoder implements Decoder {
        @Override
        public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
            if (LeasePostResponse.class.getTypeName().equals(type.getTypeName())) {
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(response.body().asInputStream());
                if (jsonNode.isArray() && jsonNode.size() == 2) {
                    JsonNode reallllResult = jsonNode.get(1);
                    return objectMapper.treeToValue(reallllResult, LeasePostResponse.class);
                }
            }
            try {
                return new Decoder.Default().decode(response, type);
            } catch (DecodeException de) {
                log.error("Fail to decode response. response body is: \n{}", IOUtils.toString(response.body().asInputStream()), de);
                throw de;
            }
        }
    }
}
