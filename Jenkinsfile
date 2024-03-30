node{
  stage('SDM Checkout'){
    git 'https://github.com/hirdyansh05/mavenProject'
  }
  stage ('Compile-Package'){
    // getting maven home path
    def mvnHome = tool name: 'Maven-3.9.6', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
}
