@Repository
public class JiraActivationRepository {

  private String username;
  private String password;
  private String jiraUrl;

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getJiraUrl() {
    return this.jiraUrl;
  }

  public void setJiraUrl(String jiraUrl) {
    this.jiraUrl = jiraUrl;
  }

  public boolean validateCredentials() {
    // Validate the provided Jira credentials through a JAVA API that hits the Jira API.
  }

  public boolean authenticateUser() {
    // Use the Jira provided endpoint to authenticate the user and return the response.
  }

  public String getErrorMessage() {
    // If the Jira credentials are invalid, the system must display an error message.
  }

}