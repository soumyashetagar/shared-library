def call(body)
{
  sh 'ssh -t -t -i /var/lib/jenkins/.ssh/id_rsa ansadmin@172.31.10.200 "ansible-playbook /opt/playbooks/down_perf.yml"'
}
