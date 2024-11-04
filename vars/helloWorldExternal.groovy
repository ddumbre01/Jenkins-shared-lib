def call(Map config) {
 sh "echo from external"
 def config = [name: 'hello-world.sh']
 loadExternalFile(config)
 sh "./hello-world.sh ${config.name} ${config.day}"
}
