package GrupoB.LocaFacil.Entity;

import java.util.Calendar;

public class Locacao 
{
    int id;
    Calendar retirada;
    Calendar entrega;
    Veiculo veiculo;
    Locador locador;
    PlanoLocacao plano;
    Double valor;
    Double kmRetirada;
    Double kmEntrega;
}
