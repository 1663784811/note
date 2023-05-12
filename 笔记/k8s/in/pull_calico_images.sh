#!/bin/bash
images=(
docker.io/calico/cni:v3.22.1
docker.io/calico/pod2daemon-flexvol:v3.22.1
docker.io/calico/node:v3.22.1
docker.io/calico/kube-controllers:v3.22.1
)
for pullimageName in ${images[@]} ; do
docker pull $pullimageName
done
