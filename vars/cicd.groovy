def gitDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}

def mavenBulid()
{
  sh 'mvn package'
}

def tomcatDepoly(jobname,ip,context)
{
        sh "scp /var/lib/jenkins/workspace/${d777}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"   
}
