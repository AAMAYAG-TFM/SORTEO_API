pipeline {
    
    environment {
        registry = "venus90210/sorteo_api"
        registryCredential = 'dockerhub'
    }
  
  
    agent any 
    stages {
    
        stage('Source') {
            steps {
               
                git branch: 'develop', url: 'https://github.com/AAMAYAG-TFM/SORTEO_API.git'
            }
        }
        
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