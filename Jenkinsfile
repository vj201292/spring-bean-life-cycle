pipeline {
    
    environment {

    PATH = "C:\\WINDOWS\\SYSTEM32;C:\\Program Files\\Git\\bin;C:\\apache-maven-3.6.1\\bin"
}
     agent {
        label {
            label ""
            customWorkspace "E:/jenkins_custom_ws/pipeline-test"
        }
    }
    stages {
        stage('clean repo') { 
            steps {
              bat "mvn clean"
            }
        }
        stage('Test') { 
            steps {
               bat "mvn test"
            }
        }
        stage('Deploy') { 
            steps {
                bat "mvn package" 
            }
        }
    }
}
