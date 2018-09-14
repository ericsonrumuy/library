#!/usr/bin/env groovy

def call(String SERVICE){
    sh "mkdir -p /var/lib/jenkins/gdn_nonprod_chef_repo/data_bags/${SERVICE}"
    echo "************************************"
    echo "Downloading existing Data bag"
    echo "************************************"
}
