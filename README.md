**Jenkins maven 4:**
select git --> paste the repo link https://github.com/rubenlagus/TelegramBots.git
build step --> invoke top level maven --> select the name and goal as compile

**Jenkins node creation 5:**
note: security--> agent(Random)
go in setting --> node --> new node 
make node in c drive , copy that path and paste it in the root directory
go in that slave and then run the windows command

**Jenkins slave node 6:**
select restricted where the project can run 
in labels write the node name 
go down
windows batch : echo Hello World

**Jenkins slave node 7:**
https://github.com/bonigarcia/selenium-jupiter.git
use maven integration plugin

**Jenkins slave node 8:**
new item --> name + pipeline
pipeline--> pipeliine script


    pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'BUILDING THE PROJECT...'
                bat 'echo COMPILING FILES...'
            }
        }

        stage('Test') {
            steps {
                echo 'RUNNING TEST CASES...'
                bat 'echo ALL TESTS PASSED SUCCESSFULLY!'
            }
        }

        stage('Deploy') {
            steps {
                echo 'DEPLOYING PROJECT...'
                bat 'echo DEPLOYMENT SUCCESSFUL!'
            }
        }
    }

    post {
        success {
            echo 'PIPELINE COMPLETED SUCCESSFULLY ✅'
        }
        failure {
            echo 'PIPELINE FAILED ❌'
        }
    }
}
apply and run 
Q16(ci-cd 'hello world')
    
    pipeline {
    agent any
    stages {
        stage('Clone Repo') {
            steps {
                git 'https://github.com/kaustubh2049/GITEXAM-test.git'
            }
        }
        stage('Build') {
            steps {
                sh 'javac hello.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java hello'
            }
        }
    }
}
