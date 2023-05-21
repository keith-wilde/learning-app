#!/bin/bash
echo "----Configuring Kubernetes admin console----"
kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.7.0/aio/deploy/recommended.yaml

echo "----Setup admin user----"
kubectl apply -f ../kubernetes/admin-user-setup.yml

echo "----Setup admin user binding----"
kubectl apply -f ../kubernetes/admin-binding-setup.yml


