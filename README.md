# Quake III Arena Docker Alpine image with ARM support

This Docker image provides a simple Quake 3 dedicated server that runs on Raspberry Pi.

[![Quake 3 on Raspberry with Docker](https://wouterdeschuyter.be/static/media/955edb89-677f-4cb5-bea0-8491f9223175.jpeg)](https://wouterdeschuyter.be/blog/running-a-dedicated-quake-3-arena-server-on-raspberry-pi-with-docker)

## Install

### With script

```bash
curl -sSL https://github.com/wouterds/rpi-quake3-server/raw/master/install.sh | sh
```

### Manually

1. Create a directory where you'll run the project, e.g. `quake3`

2. Copy [`docker-compose.yml`](/docker-compose.yml) into the directory

3. Copy [`server.cfg`](/server.cfg) into the directory

4. Copy the [pak0.pk3](https://github.com/wouterds/rpi-quake3-server/releases/download/1.0.0/pak0.pk3) file into the directory

5. Run `docker-compose up -d`

### Configuring

Change server settings by editing `./server.cfg`.<br />
The changes will take effect once you restart the container with `docker-compose restart`.

## Client

Find a client for your platform here: https://ioquake3.org/get-it
