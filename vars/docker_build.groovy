def call(String ProjectName, String ImageTag, String DockerHubUser) {
    
    
    echo "Building Docker image: ${imageName}:${imageTag} using ${dockerfile}"
    
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
