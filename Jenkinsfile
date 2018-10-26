node{
     stage('SCM Checkout'){
     git 'https://github.ibm.com/BATDevops/TpdCommons.git'
   }
    stage('compile'){
        // Get maven home path
        def mvnHome = tool name: 'Maven', type: 'maven'
        sh "${mvnHome}/bin/mvn compile"
    }
          stage('SonarQube Analysis'){
         def mvnHome = tool name: 'Maven', type: 'maven'
         withSonarQubeEnv('SonarQube') {
            sh "${mvnHome}/bin/mvn sonar:sonar"
         }
    }
	
	stage ('upload') {
	  def server = Artifactory.newServer url: 'http://159.122.149.247:8081/artifactory', credentialsId: 'Jfrog-credentials'
	  def rtMaven = Artifactory.newMavenBuild()
	  rtMaven.deployer server: server, releaseRepo: 'libs-release-local', snapshotRepo: 'libs-snapshot-local'
	  rtMaven.tool = 'Maven'
	  
	  def buildInfo = rtMaven.run pom: 'pom.xml', goals: '-s settings.xml clean install sonar:sonar'
	   
	  server.publishBuildInfo buildInfo
	}
