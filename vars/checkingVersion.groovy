#!/usr/bin/env groovy

def call(String SERVICE, String ENVIRONMENT){
    sh "mkdir -p /var/lib/jenkins/gdn_nonprod_chef_repo/data_bags/${SERVICE}"
    echo "************************************"
    echo "Downloading existing Data bag"
    echo "************************************"
    sh "knife data bag show ${SERVICE} ${ENVIRONMENT} --secret-file /var/lib/jenkins/gdn_nonprod_chef_repo/nonprod_encrypted_data_bag_secret -Fj > /var/lib/jenkins/gdn_nonprod_chef_repo/data_bags/${SERVICE}/${ENVIRONMENT}.json"
}
