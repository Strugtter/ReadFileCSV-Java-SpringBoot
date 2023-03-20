package com.example.Procesamiento.Controller;

public class ResponseFile {
    private Integer lineasValidas;
    private Integer lineasInvalidas;

    public ResponseFile(Integer lineasValidas, Integer lineasInvalidas) {
        this.lineasValidas = lineasValidas;
        this.lineasInvalidas = lineasInvalidas;
    }

    public Integer getLineasValidas() {
        return lineasValidas;
    }

    public Integer getLineasInvalidas() {
        return lineasInvalidas;
    }
}
