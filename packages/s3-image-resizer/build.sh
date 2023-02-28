#!/bin/bash
set -eo pipefail
AWS_ACCOUNT_ID=$(aws sts get-caller-identity --query Account --output text)
AWS_REGION=$(aws configure get region)
APP_NAME="s3-image-resizer"
BUILD_TAG="latest"
gradle build  
docker build -t $APP_NAME:latest . 
docker tag $APP_NAME:$BUILD_TAG $AWS_ACCOUNT_ID.dkr.ecr.$AWS_REGION.amazonaws.com/$APP_NAME:$BUILD_TAG
aws ecr get-login-password --region $AWS_REGION | docker login --username AWS --password-stdin $AWS_ACCOUNT_ID.dkr.ecr.$AWS_REGION.amazonaws.com
docker push $AWS_ACCOUNT_ID.dkr.ecr.$AWS_REGION.amazonaws.com/$APP_NAME:$BUILD_TAG

