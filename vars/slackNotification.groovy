def call(String result, String jobName, String buildNumber, String buildUrl) {
    def COLOR_MAP = [
        'SUCCESS': 'good', 
        'FAILURE': 'danger',
    ]
    
    slackSend channel: '#cicd-without-anything',
              color: COLOR_MAP[result] ?: 'warning',
              message: "*${result}:* Job ${jobName} build ${buildNumber} \n More info at: ${buildUrl}"
}
