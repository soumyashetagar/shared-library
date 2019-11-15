def call(String msg="STAGE FAILED",String id="ULT-0")
{
  def issue = [fields: [ project: [key: 'ULT'],
                       summary: "${msg}",
                       description: "${id}",
                       issuetype: [name: 'Bug']]]
def newIssue = jiraNewIssue issue: issue, site: 'jira'
echo newIssue.data.key
}
