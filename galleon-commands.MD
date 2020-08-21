# Galleon Commands

A set of Galleon commands to manually provision a WildFly server with the Keycloak adapter feature pack.

First start the Galleon CLI:

java -jar ~/src/community/galleon/cli/target/galleon-cli-4.2.6.Final-SNAPSHOT.jar 

The first command installs the web-server layer of WildFly, we need to specify a version here as presently the Keycloak layer depends
on an exact version of the wildfly-ee feature pack and this is not in the universe.

install wildfly:20.0#20.0.0.Final --layers=web-server --dir=/home/darranl/tmp/galleon/wildfly

Finally add the Keycloak layer from our local build.

install org.keycloak:keycloak-adapter-galleon-pack:12.0.0-SNAPSHOT --layers=keycloak-elytron-oidc --dir=/home/darranl/tmp/galleon/wildfly

