@Service
public class JiraActivationService {
    private final JiraService jiraService;

    public JiraActivationService(JiraService jiraService) {
        this.jiraService = jiraService;
    }

    public boolean activateJira(String username, String password, String jiraUrl) {
        boolean isValidCredentials = jiraService.validateJiraCredentials(username, password, jiraUrl);
        if (isValidCredentials) {
            jiraService.authenticateUser(username, password, jiraUrl);
            return true;
        } else {
            return false;
        }
    }
}