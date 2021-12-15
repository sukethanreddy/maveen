def build() {
    sh 'mvn clean package sonar:sonar'
}

return this
