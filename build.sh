#!/bin/sh

java -jar jnaerator.jar glib.jnaerator -mode Directory -f -v

java -jar jnaerator.jar gobject.jnaerator -mode Directory -f -v

java -jar jnaerator.jar gio.jnaerator -mode Directory -f -v
