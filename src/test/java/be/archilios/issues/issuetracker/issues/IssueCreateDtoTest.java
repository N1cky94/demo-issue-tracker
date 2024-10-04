package be.archilios.issues.issuetracker.issues;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("unit-tests")
class IssueCreateDtoTest {
    
    @Test
    @DisplayName("GIVEN valid dto WHEN requested to map to domain model THEN mapping happens correct")
    void givenValidDto_whenRequestedToMapToDomainModel_thenMappingHappensCorrect() {
        // given
        IssueCreateDto dto = new IssueCreateDto("Severe breakdown", "SEVERE");
        
        // when
        Issue issue = dto.toIssue();
        
        // then
        assertNotNull(issue);
        assertNull(issue.getId());
        assertEquals("Severe breakdown", issue.getTitle());
        assertEquals("Nick", issue.getAssignee());
        assertEquals(IssueType.SEVERE, issue.getType());
    }
    
    @Test
    @DisplayName("GIVEN invalid type WHEN request for mapping happens THEN exception is thrown")
    void givenInvalidType_whenRequestForMappingHappens_thenExceptionIsThrown() {
        // given
        IssueCreateDto dto = new IssueCreateDto("Severe breakdown", "INVALID");
        
        // when
        assertThrows(IllegalArgumentException.class, dto::toIssue);
    }
    
}