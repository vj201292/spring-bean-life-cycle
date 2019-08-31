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
        stage('clone repo') { 
            steps {
                bat "git clone https://github.com/vj201292/spring-bean-life-cycle.git"
                bat "mvn clean -f spring-bean-life-cycle"
            }
        }
        stage('Test') { 
            steps {
                bat "mvn test -f spring-bean-life-cycle"
            }
        }
        stage('Deploy') { 
            steps {
                bat "mvn package -f spring-bean-life-cycle" 
            }
        }
    }
}
