package projecto1;


import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped

public class Login implements Serializable{

	

private String name;

public Login() {
}

public String getName() {
    return name;
}

public void setName(String user_name) {
    this.name = user_name;
}
	

}
