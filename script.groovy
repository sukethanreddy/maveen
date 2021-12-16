def build() {
    sh 'mvn clean package'
}
def sonar() {
    sh 'mvn sonar:sonar -Dsonar.host.url=http://54.172.129.26:9000 -Dsonar.login=13452f0700fb5aed47696638ee052d926d73b36e'
}

def uploadwarfiletonexus()
{
    nexusArtifactUploader artifacts: [
                    [artifactId: 'StandAlone', 
                    classifier: '', 
                    file: 'target/StandAlone-3.0.0.jar',
                     type: 'jar'
                     ]
                ], 
                credentialsId: 'nexus3',
                groupId: 'com.ravi.p1',
                nexusUrl: '172.31.90.88:8081', 
                nexusVersion: 'nexus3', 
                protocol: 'http', 
                repository: 'simpleapp-release', 
                version: '3.0.0'
}

return this
