pipeline {

    agent any
    
    tools {
       maven 'maven-3.6.3' 
    }
    
    environment {
        DATE = new Date().format('yy.M')
        TAG = "${DATE}.${BUILD_NUMBER}"
    }
    
    stage('Source') {
            steps {
               
                git branch: 'develop', url: 'https://github.com/AAMAYAG-TFM/SORTEO_API.git'
            }
        }
    
    stages {    
         
         stage ('Build') {
            steps {
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