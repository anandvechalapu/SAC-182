@RestController
public class JiraActivationController {

    @PostMapping("/activate-jira")
    public ResponseEntity<?> activateJira(@RequestBody JiraCredentials jiraCredentials) {
        if (validateJiraCredentials(jiraCredentials)) {
            //authenticate the user and return response
            return ResponseEntity.ok().build();
        } else {
            //display an error message
            return ResponseEntity.badRequest().body("Invalid Jira credentials");
        }
    }

    private boolean validateJiraCredentials(JiraCredentials jiraCredentials) {
        //validate the provided Jira credentials through a JAVA API that hits the Jira API.
        return true;
    }
}