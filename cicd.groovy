node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/ibm_pythonport.git'), string(name: 'PORT_DESCRIPTION', value: 'IBM Python' )]
  }
}
