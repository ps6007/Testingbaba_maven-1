pipeline {
    agent any
   

    stages {
        stage("git") {
            steps {
                
                git credentialsId:'git_credentials', url: 'https://github.com/shivusrd/Testingbaba_maven'
            }
        }
        
         stage("build maven") {
            steps {
                
                @bat "clean install"
            }
        }
       
    }
}
