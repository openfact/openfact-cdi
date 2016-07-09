package org.openfact.models;


public interface HistorialEmisorModel extends Model{

    String getId();
    String getResolucionAutorizacion();

    void setResolucionAutorizacion(String resolucionAutorizacion);

    String getMensajeRepresentacionImpresa();

    void setMensajeRepresentacionImpresa(String mensajeRepresentacionImpresa);

    String getMensajeServicioGratuito();

    void setMensajeServicioGratuito(String mensajeServicioGratuito);

    boolean isEstado();
    void setEstado(boolean estado);

    EmisorModel getEmisor();

    void setEmisor(EmisorModel emisor);

/*
    private String resolucionAutorizacion;

    private String mensajeRepresentacionImpresa;
    private String mensajeServicioGratuito;

    private EmisorModel emisor;*/

}
