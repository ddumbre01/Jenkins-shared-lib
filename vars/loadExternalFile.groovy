def call(Map config) {
  echo "${config}"
  echo "${config.name}"
  def scriptContent = libraryResource "scripts/${config.name}"
  writeFile file : "${config.name}", text: scriptContent
  sh "chmod a+x ./${config-name}"
}
