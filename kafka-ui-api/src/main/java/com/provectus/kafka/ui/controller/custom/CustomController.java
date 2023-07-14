package com.provectus.kafka.ui.controller.custom;

import com.provectus.kafka.ui.controller.AbstractController;
import com.provectus.kafka.ui.custom.api.CustomClustersApi;
import com.provectus.kafka.ui.custom.model.CustomResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CustomController extends AbstractController implements CustomClustersApi {

  @Override
  public Mono<ResponseEntity<Flux<CustomResponseDTO>>> getCustomClusters(ServerWebExchange exchange) {
    return null;
  }
}
