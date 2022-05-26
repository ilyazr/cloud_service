## Info
- If you need new database when using docker compose, it should be listed in init.sql

## Useful commands

1. `mvn clean package -P <profile_name>` - clean and push to remote docker hub (because of jib)
2. Clean up cache, pull brand-new images and fire it up
```bash
docker compose rm -f
docker compose pull
docker compose build --no-cache
docker compose up -d
```
3. Clean up k8s resources `kubectl delete all --all --all-namespaces`
4. if something went wrong:
```bash
minikube delete
minikube start
```
5. Get address of service - `minikube service --url <service_name>`
