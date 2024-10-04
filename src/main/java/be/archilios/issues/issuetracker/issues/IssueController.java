package be.archilios.issues.issuetracker.issues;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issues")
@RequiredArgsConstructor
public class IssueController {
    private final IssueJpaRepository issueRepo;
    
    @GetMapping
    public List<IssueFetchAllDto> getIssues() {
        List<Issue> issues = issueRepo.findAll();
        return issues.stream().map(IssueFetchAllDto::from).toList();
    }
    
    @PostMapping
    public void createIssue(IssueCreateDto issueCreateDto) {
        Issue issue = issueCreateDto.toIssue();
        issueRepo.save(issue);
    }
}
