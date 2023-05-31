

## Useful Links
- setting up aws https://medium.com/condorlabs-engineering/setting-up-your-first-elastic-kubernetes-cluster-in-aws-4394ac328aff

# useful commands

## AWS
### see if aws cli working with eks
aws eks describe-cluster --name eks-cluster --region us-east-1 --query cluster.resourcesVpcConfig

## Kubernetes

## Docker
### Building Image
docker build -t learning-app .

### Pushing Image to ECS
docker images (to get the image id )
docker tag (image id) (iam ID).dkr.ecr.us-east-1.amazonaws.com/learning-app:0.0.1

docker push (iam ID).dkr.ecr.us-east-1.amazonaws.com/learning-app:0.0.1