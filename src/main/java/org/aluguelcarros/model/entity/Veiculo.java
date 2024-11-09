package org.aluguelcarros.model.entity;

import java.util.Date;
import java.util.List;

public class Veiculo {
    private long id;
    private String placa;
    private String chassi;
    private Date anoFabricacao;
    private String cor;
    private Marca marca;
    private Modelo modelo;
    private String status;
    private List<Manutencao> manutencaoList;

}
