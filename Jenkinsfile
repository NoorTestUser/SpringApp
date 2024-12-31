pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
           maven 'Maven-3.9.9'
    }



    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                 git branch: 'main', url: 'https://github.com/NoorTestUser/SpringApp.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean install"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
         stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'  // Run Maven tests
            }
        }
        stage('Build Docker Image') {
            steps {
                echo 'Building image...'
                sh 'docker build -t thetestuser/springapp .'  // Run Maven tests
            }
        }
          stage('Push Docker Image') {
            steps {
                echo 'push image...'
                withCredentials([string(credentialsId: 'dockerpassword', variable: 'dockerpassword')]) {
    // some block
    sh 'docker login -u noorthetestuser@gmail.com -p ${dockerpassword} '
}
            sh 'docker push thetestuser/springapp'
            }
        }


    }
}
