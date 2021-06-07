import org.example.Constants

def call(Map parameters=[:]) {
    
    if (parameters.type == "slack") {
        
        echo Constants.SLACK_MESSAGE
        echo parameters.message

    } else {
        
        echo Constants.EMAIL_MESSAGE
        echo parameters.message

    }
}