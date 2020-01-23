# Quake III Arena Docker Alpine image with ARM support

This Docker image provides a simple Quake 3 dedicated server that runs on Raspberry Pi.

[![Quake 3 on Raspberry with Docker](https://wouterdeschuyter.be/static/media/2fc444b5-e80e-49bb-85ef-71c3023e0e88.jpg)](https://wouterdeschuyter.be/blog/running-a-dedicated-quake-3-arena-server-on-raspberry-pi-with-docker)

## Installing

### With script

```bash
curl -sSL https://github.com/wouterds/rpi-quake3-server/raw/master/install.sh | sh
```

### Manually

1. Create a directory where you'll run the project, e.g. `quake3`

2. Copy [`docker-compose.yml`](/docker-compose.yml) into the directory

3. Copy [`server.cfg`](/server.cfg) into the directory

4. Copy the [pak0.pk3](https://github.com/wouterds/rpi-quake3-server/releases/download/1.0.0/pak0.pk3) file into the directory


### Configuring

Change server settings by editing `./server.cfg`

## Running

```bash
docker-compose up -d
```

## Client

Find a client for your platform here: https://ioquake3.org/get-it
