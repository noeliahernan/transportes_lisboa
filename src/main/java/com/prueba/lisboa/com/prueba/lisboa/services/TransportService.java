package com.prueba.lisboa.com.prueba.lisboa.services;

import com.prueba.lisboa.com.prueba.lisboa.models.Transport;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TransportService {
    /**
     * Creamos un cliente para conectarnos a la url que recupera los transportes filtrados por unos parámetros indicados
     * @return
     */
    public Transport[] getTransport(){
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl ="https://apidev.meep.me/tripplan/api/v1/routers/lisboa/resources?\n" +
                "lowerLeftLatLon=38.711046,-9.160096&upperRightLatLon=38.739429,-\n" +
                "9.137115&companyZoneIds=545,467,473";
        ResponseEntity<Transport[]> response =restTemplate.getForEntity(resourceUrl, Transport[].class);
        Transport[] transportList = response.getBody();
        return transportList;
    }
}
