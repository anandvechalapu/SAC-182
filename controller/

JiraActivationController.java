

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/jira-activation")
public class JiraActivationController {

    /**
     * Endpoint to prompt the user to provide their Jira credentials
     * @return a response entity containing the required credentials
     */
    @RequestMapping(value = "/prompt", method = RequestMethod.GET)
    public ResponseEntity<Object> promptUserForCredentials() {

        // TODO: Return response entity containing the required credentials

        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Endpoint to validate the provided Jira credentials
     * @param credentials the credentials to validate
     * @return a response entity containing the validation result
     */
    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    public ResponseEntity<Object> validateCredentials(@RequestBody JiraCredentials credentials) {

        // TODO: Validate the credentials using a JAVA API that hits the Jira API

        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Endpoint to authenticate the user using the Jira provided endpoint
     * @param credentials the credentials to authenticate
     * @return a response entity containing the authentication result
     */
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<Object> authenticateUser(@RequestBody JiraCredentials credentials) {

        // TODO: Authenticate the user using the Jira provided endpoint

        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Endpoint to return an error message if the Jira credentials are invalid
     * @param credentials the credentials to validate
     * @return a response entity containing an error message
     */
    @RequestMapping(value = "/error", method = RequestMethod.POST)
    public ResponseEntity<Object> invalidCredentialsError(@RequestBody JiraCredentials credentials) {

        // TODO: Return an error message if the provided credentials are invalid

        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}