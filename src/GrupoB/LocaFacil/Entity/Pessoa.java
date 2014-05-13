package GrupoB.LocaFacil.Entity;

import java.util.ArrayList;
import java.util.Calendar;

public class Pessoa
{
    int id;
    String nome;
    boolean fisica;
    String cnp;
    Calendar nascimento;
    ArrayList<Contato> contatos;
    ArrayList<Endereco> enderecos;
}
