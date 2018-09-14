#!/usr/bin/env groovy

def call(String DEPLOY_VERSION){
	currentBuild.displayName="${DEPLOY_VERSION}"
}
