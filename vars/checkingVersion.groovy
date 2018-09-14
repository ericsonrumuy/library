#!/usr/bin/env groovy

def call(){
    mkdir -p /var/lib/jenkins/gdn_nonprod_chef_repo/data_bags/tesdatabag
    echo "************************************"
    echo "Downloading existing Data bag"
    echo "************************************"
}
