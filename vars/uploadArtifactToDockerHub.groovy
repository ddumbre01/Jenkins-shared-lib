def call(String imageName, String tag, String registry = 'docker.io', String dockerCredentialsId = 'docker-hub-credentials') {
   echo 'Pushing docker file to docker hub..'
   withCredentials([usernamePassword(credentialsId: dockerCredentialsId) {
      docker.withRegistry('https://index.docker.io/v1/', dockerCredentialsId) {
                            sh """
                                docker push ${DOCKER_USER_NAME}/${DOCKER_IMAGE_NAME}:${DOCKER_TAG}
                            """
                  }
       }

}
