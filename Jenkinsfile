pipeline {
  
  agent any
  stages {
    
    stage('Clean Code') {
      steps {
        cleanWs()
      }
    }
  
    stage('Build') {
            steps {
                bat 'mkdir lib'
                bat 'cd lib/wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.7.0/junit-platform-console-standalone-1.7.0-all.jar'
                bat 'cd src/javac -cp "../lib/junit-platform-console-standalone-1.7.0-all.jar" TrignometryTestClass.java TrignometryFunctions.java '
              }
        }

     stage('Test') {
            steps {
                bat 'cd src/java -jar ../lib/junit-platform-console-standalone-1.7.0-all.jar -cp "." --select-class TrignometryTestClass --reports-dir="reports"'
                junit 'src/reports/*-jupiter.xml'
            }
     }
  
  }


}
