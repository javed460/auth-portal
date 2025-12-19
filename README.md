# auth-portal
A minimal Spring Boot 3.x application that integrates with Keycloak 26.0.0 for OAuth2/OpenID Connect authentication. This application serves as a frontend that redirects users to Keycloak for login and handles the authentication callback.


# The application:

Protects endpoints requiring authentication

Automatically redirects unauthenticated users to Keycloak

Handles OAuth2 callback from Keycloak

Creates and maintains authenticated sessions

# 🚀 Quick Start 

Prerequisites
Java 21 or later

Maven 3.6+

Keycloak 26.0.0


# Configure Keycloak

Access Keycloak Admin Console: http://localhost:8080

Login with: admin / admin

Create a realm (or use existing)

Create a client:

Client ID: auth-portal-client

Valid Redirect URIs: http://localhost:8081/login/oauth2/code/*

Web Origins: http://localhost:8081

Enable Client authentication

Copy the Client Secret from the Credentials tab


# 🔐 Authentication Flow
Access protected endpoint: http://localhost:8081/dashboard

Spring Security redirects to Keycloak login page

User authenticates on Keycloak

Keycloak redirects back with authorization code

Make sure keycloak server is up and running, use the command to start it
kc.bat start-dev

