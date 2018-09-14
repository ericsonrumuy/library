#!/usr/bin/env groovy

def call(){
sh '''#!/bin/bash 
    mkdir -p /var/lib/jenkins/gdn_nonprod_chef_repo/data_bags/gdn_app_zurich
    echo "************************************"
    echo "Downloading existing Data bag"
    echo "************************************"
    knife data bag show gdn_app_zurich gdn-perf --secret-file /var/lib/jenkins/gdn_nonprod_chef_repo/nonprod_encrypted_data_bag_secret -Fj > /var/lib/jenkins/gdn_nonprod_chef_repo/data_bags/gdn_app_zurich/gdn-perf.json'''
}
