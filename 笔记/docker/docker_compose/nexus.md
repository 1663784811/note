#  nexus

```yaml
version: '3'
services:
   nexus:
      restart: always
      image: sonatype/nexus3
      container_name: nexus3
      ports:
         - 8081:8081
      volumes:
         - ./data:/nexus-data
```













