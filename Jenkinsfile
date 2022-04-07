pipeline{
    agent {
                  docker {
                      image 'maven:3-alpine'
                  }
    }

    stages {
        stage("build application"){
            steps{
                echo 'building the application'
                sh 'mvn clean package'
            }
        }
    }
}