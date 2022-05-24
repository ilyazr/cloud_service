## Info
- If you need new database, it should be listed in init.sql

## Useful commands

1. `mvn clean package -P <profile_name>` - clean and push to remote docker hub (because of jib)
2. Clean up cache, pull brand-new images and fire it up
```bash
docker compose rm -f
docker compose pull
docker compose build --no-cache
docker compose up -d
```
