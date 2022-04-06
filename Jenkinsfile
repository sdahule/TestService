pipeline{
    agent {
                  docker {
                      image 'maven:3-alpine'
                      args '-v /root/.m2:/root/.m2'
                  }
    }

    stages {
        stage("build application"){
            steps{
                echo 'building the application'
                sh 'mvn clean package'
            }
        }

        stage("build docker image"){
            script{
                    app=docker.build("service/testservice")
            }
        }
    }
}