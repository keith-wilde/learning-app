#!/bin/bash

echo "----Writing token to out.txt----"
kubectl -n kubernetes-dashboard create token admin-user > out.txt
