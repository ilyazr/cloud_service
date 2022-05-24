echo "executing: docker compose rm -f"
docker compose rm -f

echo "executing: docker compose pull"
docker compose pull

echo "executing: docker compose build --no-cache"
docker compose build --no-cache

echo "executing: docker compose up -d"
docker compose up -d
