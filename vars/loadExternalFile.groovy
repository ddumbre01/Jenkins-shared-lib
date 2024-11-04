def call(Map config) {
  echo "${config}"
  echo "${config.name}"
  def scriptContent = libraryResource "scripts/${config.name}"
  echo "${scriptContent}"
  writeFile file: "hello-world.sh", text: scriptContent
  sh "chmod a+x ./hello-world.sh"
}
