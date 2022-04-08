pipeline{


    agent {
                  docker {
                      image 'maven:3-alpine'
                  }
    }

    stages {

        stage('Initialize'){
                def dockerHome = tool 'mydocker'
                env.PATH = "${dockerHome}/bin:${env.PATH}"
        }
        stage("build application"){
            steps{
                echo 'building the application'
                sh 'mvn clean package'
            }
        }
    }
}