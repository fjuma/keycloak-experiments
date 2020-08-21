# Keycloak Experiments

This project contains a set of experiments whilst working on support for a Keycloak feature pack to be added using Galleon.

## simple-webapp

A simple deployment that can be deployed to a running WildFly server to test invocations requiring security.

## provisioned-wildfly

A minimal pom which contains the definition to provision a WildFly server using Galleon, this will be enhanced to include the Keycloak feature pack. 

## bootable-webapp

A fork of the simple-webapp project, this time making use of bootable jar to add the Keycloak client adapter and configure it for use with the deployment.

