package voter.voter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voter.voter.model.Voter;

@Repository
//public interface VoterRepository  extends JpaRepository <Voter,Integer> {
//}
public interface VoterRepository extends JpaRepository <Voter,Long>{


}
