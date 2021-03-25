   pipeline  {
                    docker.withRegistry('https://registry.hub.docker.com', 'DockerHub') {

                    def customImage = docker.build("shilpabains/Firstweb-app")

                    /* Push the container to the custom Registry */
                    customImage.push()
                }
          }
