#!/bin/bash
set -eo pipefail
kubectl get crds -o json | cdk8s import /dev/stdin --language typescript
