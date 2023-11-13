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
        stage("Earlybird Scan") {
            steps {
             sh "touch abc"
			 echo "${CURRENTDATE}"
			
			 echo "${BUILD_NUMBER}"
			 
               
            }
        }
    }
    stages {
        stage("Publisg results to EB API") {
            steps {
			echo "${CURRENTDATE}"
	        }
        }
    }

}

