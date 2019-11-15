def call(body)
{
  script
  {
      
        emailext mimeType: 'text/html',
                 subject: "[Jenkins]${currentBuild.fullDisplayName}",
                 to: "maheshwar.mannur@gmail.com",
                 body: '''<a href="http://13.232.60.255:8080/">Click here to approve </a>''' 

        def userInput = input id: 'userInput',
                              message: 'Let\'s promote?', 
                              submitterParameter: 'submitter',
                              submitter: 'Ritwik',
                              parameters: [
                                [$class: 'TextParameterDefinition', defaultValue: 'sit', description: 'Environment', name: 'env'],
                                [$class: 'TextParameterDefinition', defaultValue: 'k8s', description: 'Target', name: 'target']]

        echo ("Env: "+userInput['env'])
        echo ("Target: "+userInput['target'])
        echo ("submitted by: "+userInput['submitter'])
         
     }
}
