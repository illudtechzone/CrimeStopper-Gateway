package com.illud.crimestopper.client.crimestopper.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.illud.crimestopper.client.crimestopper.ClientConfiguration;

@FeignClient(name="${crimestopper.name:crimestopper}", url="${crimestopper.url:localhost:8082/}", configuration = ClientConfiguration.class)
public interface MediaResourceApiClient extends MediaResourceApi {
}