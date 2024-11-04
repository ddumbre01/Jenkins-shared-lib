def call(Map config) {
  echo "${config}"
  echo "${config.name}"
  def scriptContent = libraryResource "scripts/${config.name}"
  echo "${scriptContent}"
  writeFile file: "${config.name}", text: scriptContent
  sh "chmod a+x ./${config-name}"
}
