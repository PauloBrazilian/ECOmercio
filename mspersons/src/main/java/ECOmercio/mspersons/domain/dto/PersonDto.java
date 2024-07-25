package ECOmercio.mspersons.domain.dto;

import ECOmercio.mspersons.domain.enums.RoleEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public record PersonDto(

        @NotBlank(message = "The name is null")
        @Size(min = 4, message = "FirstName should have at least 4 characters")
        String name,

        @Email(message = "Invalid Email.")
        @Pattern(regexp = "\\w.@gmail.com", message = "Invalid Email format. It should be xxx@gmail.com")
        String email,

        @NotBlank(message = "The password is null")
        @Size(min = 8, message = "Password should have at least 8 characters")
        String password,

        @NotBlank(message = "roles must be either 'AUTHORIZED' or 'UNAUTHORIZED'")
        RoleEnum roles,

        @NotBlank(message = "The phoneNumber is null")
        @Size(min = 4, message = "phoneNumber should have at least 4 characters")
        String phoneNumber,

        @NotBlank(message = "The imgUrl is null")
        String imgUrl,

        @CPF(message = "Invalid CPF.")
        @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "Invalid CPF format. It should be xxx.xxx.xxx-xx")
        String cpf
) {
}
