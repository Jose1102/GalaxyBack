package escuelaing.arsw.galaxy.appgalaxy.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import escuelaing.arsw.galaxy.appgalaxy.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario,Integer>{

}
