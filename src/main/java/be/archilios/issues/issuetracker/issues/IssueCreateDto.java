package be.archilios.issues.issuetracker.issues;

public record IssueCreateDto(
        String title,
        String severity
) {
    public Issue toIssue() {
        IssueType type = switch(severity.toUpperCase()) {
            case "LOW" -> IssueType.LOW;
            case "MEDIUM" -> IssueType.MEDIUM;
            case "SEVERE"  -> IssueType.SEVERE;
            default -> throw new IllegalArgumentException("Invalid severity: " + severity);
        };
        return new Issue(title,"Nick" , type);
    }
}
