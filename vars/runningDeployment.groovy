#!/usr/bin/env groovy

def call(String SERVER){
sh "knife ssh --manual-list \"${SERVER}\" \"sudo chef-client -o 'role[gdn_app_zurich]'\" -x chef --ssh-port 2209"
}
