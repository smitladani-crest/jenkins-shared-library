// Reference: https://itnext.io/how-to-build-your-own-jenkins-shared-library-9dc129db260c

def call(Map parameters=[:], Closure body) {
    
    node {
        def root = tool type: 'go', name: parameters.toolName
        
        withEnv(["PATH+GO=${root}/bin"]) {
            
            stage('clone') {
                echo 'Cloning the repository...'
                git parameters.gitUrl
            }
            
            stage('build') {
                echo 'Building the Go project...'
                sh 'go build .'
            }
            
            body()
        }
    }
}