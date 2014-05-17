package GrupoB.LocaFacil.Entity;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "locador", schema = "locafacil")
public class Locador extends Usuario
{
    
    String cartao;
    Calendar cadastro;
    Habilitacao habilitacao;
}
