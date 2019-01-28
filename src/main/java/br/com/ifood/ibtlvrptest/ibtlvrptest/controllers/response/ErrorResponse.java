package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorResponse {

    private LocalDateTime time;
    private String message;
    private String details;

    public ErrorResponse(LocalDateTime time, String message, String details) {
        super();
        this.time = time;
        this.message = message;
        this.details = details;
    }

}
