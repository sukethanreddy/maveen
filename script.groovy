def build() {
    sh 'mvn clean package'
}
def sonar() {
    sh sh 'mvn sonar:sonar -Dsonar.host.url=http://3.91.232.116:9000 -Dsonar.login=13452f0700fb5aed47696638ee052d926d73b36e'
}

return this
