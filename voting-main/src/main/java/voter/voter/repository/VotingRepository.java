package voter.voter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import voter.voter.model.Voting;

import java.util.List;

@Repository
public interface VotingRepository extends JpaRepository<Voting, Long> {
    @Query("SELECT v.candidate.id, COUNT(v.id) FROM Voting v GROUP BY v.candidate.id")
    List<Object[]> countCandidatesPerId();



}
