def call(Map : config = [:]) {
 sh "echo from external"
 loadExternalFile(name: 'hello-world.sh')
 sh "./hello-world.sh ${config.name} ${config.day}"
}
