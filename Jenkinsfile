pipeline {
    
    environment {
        registry = "venus90210/sorteo_api"
        registryCredential = 'dockerhub'
    }
  
      
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
  
 
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