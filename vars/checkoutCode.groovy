def call(String repoUrl, String branch) {

    git(
        branch: branch,
        url: repoUrl,
        credentialsId: 'github-creds'
    )
}
