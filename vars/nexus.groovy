def call(body){
  withCredentials([usernamePassword(credentialsId: 'nexus-credentials', passwordVariable: 'pass', usernameVariable: 'userId')]) {
         sh   'curl -F file=@target/myWebApp_Test-${BUILD_NUMBER}.war -u $userId:$pass http://ec2-18-224-155-110.us-east-2.compute.amazonaws.com:8081/nexus/content/repositories/devopstraining/Codekillers/myWebApp_Test-${BUILD_NUMBER}.war'
			  } 
			  
       			}
