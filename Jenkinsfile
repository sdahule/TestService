pipeline{
    agent any

    stages {
        stage("build")
            steps{
                echo 'building the application'
                sh 'mvn clean package'
            }
    }
}