pipeline {

    agent any
    
    tools {
       maven 'maven-3.6.3' 
    }
    
    environment {
        DATE = new Date().format('yy.M')
        TAG = "${DATE}.${BUILD_NUMBER}"
    }
    
    stages {    
         
        stage('Build') {
          withMaven {
     	      sh 'mvn clean package'
    		} 
        }
        stage('Docker Build') {
            steps {
                script {
                    docker.build("venus90210/sorteo_api:${TAG}")
                }
            }
        }
        
        stage('Test') {
            steps {
                echo 'Hello world!' 
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Hello world!' 
            }
        }
    }
}