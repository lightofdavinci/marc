#!/bin/sh
set -e

# This script is meant for quick & easy install via:
# $ curl -sSL https://github.com/wouterds/rpi-quake3-server/raw/master/install.sh | sh

echo 'Creating ./quake3 directory...'
mkdir quake3
cd quake3

echo 'Downloading assets...'
curl -LO https://github.com/wouterds/rpi-quake3-server/raw/master/docker-compose.yml
curl -LO https://github.com/wouterds/rpi-quake3-server/raw/master/server.cfg
curl -LO https://github.com/wouterds/rpi-quake3-server/releases/download/1.0.0/pak0.pk3

echo ''
echo 'Ready to go!'
echo ''
echo 'You can customize your server settings by editing: ./quake3/server.cfg'
echo 'When ready, start the server by running "cd ./quake3 && docker-compose up -d"'
