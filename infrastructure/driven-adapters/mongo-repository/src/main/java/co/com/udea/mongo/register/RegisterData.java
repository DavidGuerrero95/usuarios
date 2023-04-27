package co.com.udea.mongo.register;

import co.com.udea.model.common.RoleIds;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "COL_REGISTER")
@NoArgsConstructor
@AllArgsConstructor
public class RegisterData {

    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String password;
    @Indexed(unique = true)
    private String email;
    @Indexed(unique = true)
    private String cellPhone;
    private String code;
    private Long minutes;
    private List<RoleIds> roles;

}
