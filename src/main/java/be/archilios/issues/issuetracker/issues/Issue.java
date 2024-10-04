package be.archilios.issues.issuetracker.issues;

import jakarta.persistence.*;

@Entity
@Table(name = "issues")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "assignee")
    private String assignee;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private IssueType type;
    
    public Issue() {
    }
    
    public Issue(String title, String assignee, IssueType type) {
        this.title = title;
        this.assignee = assignee;
        this.type = type;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAssignee() {
        return assignee;
    }
    
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
    
    public IssueType getType() {
        return type;
    }
    
    public void setType(IssueType type) {
        this.type = type;
    }
}
