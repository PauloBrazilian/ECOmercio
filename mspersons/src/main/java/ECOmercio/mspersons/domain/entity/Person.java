package ECOmercio.mspersons.domain.entity;

import ECOmercio.mspersons.domain.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private RoleEnum roles;

    private String phoneNumber;

    private String imgUrl;

    @Column(name = "CPF", unique = true)
    private String cpf;

}