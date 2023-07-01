package voter.voter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voter.voter.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
