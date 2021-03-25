pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                git url: 'https://github.com/Shilpa40/FirstMavenApp.git'
            }
        }
        stage('build && SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    // Optionally use a Maven environment you've configured already
                    withMaven(maven:'Maven 3.6') {
                        sh 'mvn clean package sonar:sonar'
                    }
                }
            }
        }
       
    }
}
