#!/bin/bash
echo "----Configuring Kubernetes admin console----"

echo "----Applying recommended.yml----"
kubectl apply -f ../kubernetes/admin-console-setup.yml

echo "----Setup admin user----"
kubectl apply -f ../kubernetes/admin-user-setup.yml

echo "----Setup admin user binding----"
kubectl apply -f ../kubernetes/admin-binding-setup.yml


