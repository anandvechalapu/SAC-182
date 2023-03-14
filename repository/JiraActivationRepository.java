import org.springframework.data.jpa.repository.JpaRepository;

public interface JiraActivationRepository extends JpaRepository<JiraActivation, Long> {

	public JiraActivation findByUsernameAndPasswordAndUrl(String username, String password, String url);
	
	public boolean validateJiraCredentials(String username, String password, String url);
	
	public String authenticateUser(String username, String password, String url);
	
	public String displayErrorMessage(String username, String password, String url);
	
}