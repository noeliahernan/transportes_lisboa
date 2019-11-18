package com.prueba.lisboa.com.prueba.lisboa.task;

import com.prueba.lisboa.com.prueba.lisboa.models.Transport;
import com.prueba.lisboa.com.prueba.lisboa.services.TransportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

@Component
public class Task {
    private static  final Logger  LOG = LoggerFactory.getLogger(Task.class);
    static HashSet<Transport> previousTransports = null;
    /**
     * Método que se ejecuta cada 60 segundos para comprobar si están disponibles nuevos transportes o se han desconectado algunos que ya estaban disponibles
     */
    @Autowired
    TransportService service;
    @Scheduled(fixedDelay = 60000)
    public void changesTransportScheduled(){
        HashSet<Transport> currentTransports = new HashSet<>(Arrays.asList(service.getTransport()));
        if(this.previousTransports != null){
            getChangesTransports(currentTransports, this.previousTransports).forEach(t-> System.out.println("El transporte con identificador: " + t +" ya no está disponible"));
            getChangesTransports(this.previousTransports, currentTransports).forEach(t-> System.out.println("El transporte con identificador: " + t +" se encuentra disponible"));
        }
        this.previousTransports = currentTransports;
    }

    /**
     * Compara la lista actual con la recuperada en la petición anterior, para comprobar los cambios
     * @param listTransport
     * @param listTransportAux
     * @return
     */
    private HashSet<String> getChangesTransports(HashSet<Transport> listTransport, HashSet<Transport> listTransportAux) {
        HashSet<String> similares =new HashSet<String>();
        HashSet<String> result = new HashSet<String>();
        listTransportAux.stream().forEach(t -> {
            similares.add(t.getId());
            result.add(t.getId());
        });
        similares.retainAll(listTransport.stream().map(x -> x.getId()).collect(Collectors.toList()));
        result.removeAll(similares);
        return result;
    }
}
