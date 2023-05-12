#!/bin/bash
images=(
registry.aliyuncs.com/google_containers/kube-apiserver:v1.23.17
registry.aliyuncs.com/google_containers/kube-controller-manager:v1.23.17
registry.aliyuncs.com/google_containers/kube-scheduler:v1.23.17
registry.aliyuncs.com/google_containers/kube-proxy:v1.23.17
registry.aliyuncs.com/google_containers/pause:3.6
registry.aliyuncs.com/google_containers/etcd:3.5.6-0
registry.aliyuncs.com/google_containers/coredns:v1.8.6
)
for pullimageName in ${images[@]} ; do
docker pull $pullimageName
done


