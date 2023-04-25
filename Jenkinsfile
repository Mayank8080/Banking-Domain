pipeline {
    agent any
    stages {
        stage("git"){
            steps{
                git url: 'https://github.com/Mayank8080/my-webapp.git', branch: 'main'

            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
         stage('Deploy to Tomcat') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'TomcatCredentials', url: 'http://localhost:9006/')], contextPath: '/webapp', war: '**/*.war'
            }
        }
    }
}

