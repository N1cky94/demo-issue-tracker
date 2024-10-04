package be.archilios.issues.issuetracker.issues;

public record IssueFetchAllDto(
        Long id,
        String title,
        IssueType type
) {
    public static IssueFetchAllDto from(Issue issue) {
        return new IssueFetchAllDto(
                issue.getId(),
                issue.getName(),
                issue.getType()
        );
    }
}
