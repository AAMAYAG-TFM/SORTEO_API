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
                 sh 'docker build -t venus90210/sorteo_api:v1 ./sorteo/'
                  
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