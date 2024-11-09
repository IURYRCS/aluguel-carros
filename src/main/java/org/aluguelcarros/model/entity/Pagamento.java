package org.aluguelcarros.model.entity;

import java.util.Date;


public class Pagamento {

    private long id;
    private Date data;
    private float valorPago;
    private String formaPagamento;
    private ContratoLocacao contratoLocacao;
}
