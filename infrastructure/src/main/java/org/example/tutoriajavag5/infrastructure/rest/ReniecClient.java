package org.example.tutoriajavag5.infrastructure.rest;

import org.example.tutoriajavag5.domain.response.ResponseReniec;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "client-reniec", url = "https://api.apis.net.pe/v2/reniec/dni")
public interface ReniecClient {
    @GetMapping
    //metodo para consultar a la api
    ResponseReniec getInfoReniec(@RequestParam("numero") String numero, @RequestHeader("Authorization") String token);
}
