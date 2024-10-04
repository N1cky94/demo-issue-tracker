package be.archilios.issues.issuetracker.issues;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueJpaRepository extends JpaRepository<Issue, Long> {

}
