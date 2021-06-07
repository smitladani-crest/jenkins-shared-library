import org.example.Constants

def call(Map parameters=[:]) {
    
    echo "Output of the program"

    echo Constants.separator()

    sh "./${parameters.appName}"

    echo Constants.separator()
}