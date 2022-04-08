pipeline{

    stages {

        stage('Initialize'){
                def dockerHome = tool 'myDocker'
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