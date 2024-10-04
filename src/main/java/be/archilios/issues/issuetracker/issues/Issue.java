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
    private String name;
    @Column(name = "assignee")
    private String assignee;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private IssueType type;
    
    public Issue() {
    }
    
    public Issue(String name, String assignee, IssueType type) {
        this.name = name;
        this.assignee = assignee;
        this.type = type;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String title) {
        this.name = title;
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
