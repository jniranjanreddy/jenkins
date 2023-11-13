pipeline {
    agent { 
          node { 
            label 'master'
            customWorkspace "/tmp/${JOB_NAME}"
        }  
    }  
    environment {
        CURRENTDATE=sh(script: "date '+%Y%m%d%H%M%S'", , returnStdout: true).trim()
    }
    stages {
        stage("Env Variables") {
            steps {
             sh "touch abc"
			 echo "${CURRENTDATE}"
			
			 echo "${BUILD_NUMBER}"
			 
               
            }
        }
	}
}
