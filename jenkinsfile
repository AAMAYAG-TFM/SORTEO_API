pipeline {

    agent any
    
    tools {
        maven 'maven-3.8.6' 
    }
    
    environment {
        registry = "venus90210/sorteo_api"
        registryCredential = 'dockerhub'
    }
    
    stages {    
         
        stage('Build') {
            steps {
               sh 'mvn clean install'                  
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