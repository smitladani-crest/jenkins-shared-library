import org.example.Constants

def call(Map parameters=[:]) {

    stage('run') {
    
        echo "Output of the program"

        echo Constants.separator()

        sh "./${parameters.appName}"

        echo Constants.separator()
        
    }
}