def gitDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}

def mavenBulid()
{
  sh 'mvn package'
}
