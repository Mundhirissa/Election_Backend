package voter.voter.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voter.voter.model.Form;

@Repository
public interface FormRepository  extends JpaRepository<Form,Long> {
}
