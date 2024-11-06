def call(String imageName, String tag, String registry = 'docker.io', String dockerCredentialsId = 'dockerhub') {
   echo 'Pushing docker file to docker hub..'
   withCredentials([usernamePassword(credentialsId: dockerCredentialsId) {
      docker.withRegistry('https://index.docker.io/v1/', dockerCredentialsId) {
                            sh """
                                docker push ${registry}/${imageName}:${tag}
                            """
                  }
       }

}
