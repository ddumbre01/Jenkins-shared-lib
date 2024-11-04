def call(Map config) {
 sh "echo from external"
 def loadConfig = [name: 'hello-world.sh']
 loadExternalFile(loadConfig)
 echo "fileWrote"
 sh "./hello-world.sh ${config.name} ${config.day}"
}
