# Quake III Arena Docker Alpine image with ARM support

This image provides a simple quake3 dedicated server that runs on Raspberry Pi.

## Setup & running

1. Create a directory where you'll run the project, e.g. `quake3-server`.

2. Copy [`docker-compose.yml`](/docker-compose.yml) into the directory.

3. Copy [`server.cfg`](/server.cfg) into the directory.

4. Copy the **pak0.pk3** file into the directory.

5. Run `docker-compose up -d`.

## Client

Find a client for your platform here: https://ioquake3.org/get-it/.
