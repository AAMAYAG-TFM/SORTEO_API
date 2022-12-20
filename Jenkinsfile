pipeline {

    agent any
    
    tools {
       maven 'maven-3.6.3' 
    }
    
    environment {
        registry = "venus90210/sorteo_api"
        registryCredential = 'dockerhub'
    }
    
    stages {    
         
        stage('Build') {
          withMaven {
     	      sh "mvn clean verify"
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