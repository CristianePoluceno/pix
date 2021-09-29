package matera.bootcamp.pix.domain.model;

import lombok.Data;
import org.hibernate.id.CompositeNestedGeneratedValueGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class ContaCorrente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

//(nullable = false) = significa que não pode ser nulo
    @Column(nullable = false)
    private Long agencia;

    @Column(nullable = false)
    private Long conta;

    @Column(precision = 10,scale=2, nullable = false)
    private BigDecimal saldo;

//    @OneToOne(mappedBy = "contaCorrente")
//    private Usuario usuario;

}
