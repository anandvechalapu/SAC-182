

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JiraActivationService {

    private static final String JIRA_API_ENDPOINT = "https://jira.endpoint.com/api";

    public void activateJira(String username, String password, String jiraUrl) {
        // Validate the user credentials against the JIRA API
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(JIRA_API_ENDPOINT + "/validate/" + username + "/" + password, String.class);
        
        // If the response was valid, then proceed with activation
        if (response.equals("valid")) {
            // Make API call to JIRA API to activate the user account
            String activationResponse = restTemplate.getForObject(JIRA_API_ENDPOINT + "/activate/" + username + "/" + password + "/" + jiraUrl, String.class);
            
            // If the response was valid, then the activation was successful.
            if (activationResponse.equals("success")) {
                System.out.println("Jira activation successful");
            } else {
                System.out.println("Jira activation failed");
            }
        } else {
            System.out.println("Invalid Jira credentials");
        }
    }

}