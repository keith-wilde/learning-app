#!/bin/bash
echo "----Configuring Kubernetes Environment----"

echo "----Applying recommended.yml----"
kubectl apply -f ../kubernetes/recommended.yml

echo "----Setup admin user----"
kubectl apply -f ../kubernetes/admin-user-setup.yml

echo "----Setup admin user----"
kubectl apply -f ../kubernetes/admin-binding-setup.yml

echo "----Creating Token----"
./create-secret.sh

echo "----Starting proxy----"
kubectl proxy
