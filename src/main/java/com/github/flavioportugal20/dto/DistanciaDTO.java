package com.github.flavioportugal20.dto;

import com.github.flavioportugal20.domain.enums.EarthRadius;

import java.io.Serializable;

public class DistanciaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Double resultado;
    private String unidade;
    private String formatado;

    public DistanciaDTO(){
    }

    public DistanciaDTO(Double resultado, String unidade, String formatado) {
        this.resultado = resultado;
        this.unidade = unidade;
        this.formatado = formatado;
    }

    public DistanciaDTO(Double resultado, EarthRadius earthRadius) {
        this.resultado = resultado;
        this.unidade = earthRadius.toString();
        this.formatado = String.format("%.2f ", resultado)
                        .concat(earthRadius.getUnit())
                        .replace(',','.');
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getFormatado() {
        return formatado;
    }

    public void setFormatado(String formatado) {
        this.formatado = formatado;
    }
}
