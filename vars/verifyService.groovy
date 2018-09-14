#!/usr/bin/env groovy

def call(){
sh "/var/lib/jenkins/scripts/verify_tomcat_versionpage_status.sh http://jenkinscoba-01.perf.lokal:8080/zurich/version"
}

