

import org.springframework.data.jpa.repository.JpaRepository;
 
public interface JiraActivationRepository extends JpaRepository<JiraActivation, Long> { 
 
    public JiraActivation findByCredentials(String username, String password, String url);
    
    public boolean validateCredentials(String username, String password, String url);
    
    public boolean authenticateUser(String username, String password, String url);
    
    public void displayErrorMessage();
    
    public boolean featureImplementedAndTested();
    
    public boolean validateAuthenticationProcess();
    
    public boolean validateErrorMessage();
    
    public boolean codeReviewed();
    
    public boolean codeCheckedInRepository();
 
}