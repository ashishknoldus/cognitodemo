import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;
import com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest;

public class CognitoDemo {
  
  private static final String POOL_ID = "us-east-2_OfXH5ztEz";
  
  private static final String POOL_ARN = "arn:aws:cognito-idp:us-east-2:452326120270:userpool/us-east-2_OfXH5ztEz";
  
  private static final String APP_CLIENT_ID = "71ki9sevlqp0vo9s1vceuqn1l7";
  
  private static final String APP_CLIENT_SECRET = "o9ge4u8g4oa0e7le24afsvaq4n4pn8bthrnbndu7jipoitl5v55";
  
  private static final String CONTEXT = "";
  
  private static final   AWSCredentials credentials = new ProfileCredentialsProvider().getCredentials();
  
  
  private static final AWSCognitoIdentityProvider AWS_COGNITO_IDENTITY_PROVIDER = AWSCognitoIdentityProviderClientBuilder
      .defaultClient();
  
  
  
  public void createUserPool() {
  
    
    CreateUserPoolRequest createUserPoolRequest = new CreateUserPoolRequest();
    
    AWS_COGNITO_IDENTITY_PROVIDER.createUserPool(createUserPoolRequest);
    
    AWSCognitoIdentityProviderClientBuilder builder = AWSCognitoIdentityProviderClientBuilder
        .defaultClient().createUserPool();
  
    AWSCognitoIdentityProviderClient client = new AWSCognitoIdentityProviderClient(credentials);
   // client.
  }
  
}