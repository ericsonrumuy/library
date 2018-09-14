#!/usr/bin/env groovy
def call(String DEPLOY_VERSION){
	sh "/var/lib/jenkins/scripts/edit_databag.py -d gdn_app_zurich -i gdn-perf -v ${DEPLOY_VERSION}"
	sh "knife data bag from file gdn_app_zurich /var/lib/jenkins/gdn_nonprod_chef_repo/data_bags/gdn_app_zurich/gdn-perf.json --secret-file /var/lib/jenkins/gdn_nonprod_chef_repo/nonprod_encrypted_data_bag_secret "
    }
