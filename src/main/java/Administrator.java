/**
 * Created by Wouter on 3/11/2016.
 */
import javax.persistence.*;

@Entity
@DiscriminatorValue("Administrator")
public class Administrator extends Rol {

    public Administrator(){}

    public Administrator(String status, String usernaam, Persoon persoon){
        super(status,usernaam,persoon);
    }

    public Administrator(int id, String status, String usernaam, Persoon persoon){
        super(id,status,usernaam,persoon);
    }

    @Override
    public String getType() {
        return "Administrator";
    }

}
