@RestController
@RequestMapping("/jira")
public class JiraController {

    @PostMapping("/activation")
    public ResponseEntity<Object> activateJira(@RequestBody JiraCredentials jiraCredentials) {

        boolean isValidCredentials = validateCredentials(jiraCredentials);

        if (isValidCredentials) {
            // Authenticate user with the jira provided endpoint
            // Return the response
            return ResponseEntity.ok().build();
        } else {
            // Display error message
            return ResponseEntity.badRequest().body("Invalid Jira credentials");
        }
    }

    private boolean validateCredentials(JiraCredentials jiraCredentials) {
        // Validate the provided Jira credentials through a JAVA API that hits the Jira API
        // Return true/false
        return true;
    }

}