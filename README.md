# Minecraft Drive

## What?

This project allows you to create a device driver that will store data in a Minecraft world with 1 block corresponding to each byte.

## How?

When the modified MC client starts up, it binds to a Unix Domain socket and awaits commands. 
Reading or writing to the device driver file will send commands to MC over the socket, causing the player to place or inspect corresponding blocks.

The data is then sent back to the device driver and made available to the user as if they had written to or read from a normal file.
