def call(body)
{
  appscan application: '478cf57c-c285-4d5e-aa31-021622bac065', credentials: 'IBM_Mahesh', email: true, failBuild: true, failureConditions: [failure_condition(failureType: 'high', threshold: 500), failure_condition(failureType: 'total', threshold: 1000)], name: 'Security_Test', scanner: static_analyzer(hasOptions: false, target: 'var/lib/jenkins/workspace/gitlab pipeline'), type: 'Static Analyzer', wait: true
}
