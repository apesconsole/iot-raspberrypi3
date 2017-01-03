# iot-raspberrypi3

The project runs a web application and provides an user interface to interact with GPIO.
It provides a Login and a subsequent home screen upon validation. The home screen displays 3 main zones.
The Login also displays a Selection of Roles. Validation runs through the roles of the valid user and 
displays the active Zones available to control for a specific user.
* Drawing Room
* Master Room
* Guest Room

Each of the Zones can have their own set of appliances and can be contolled by the application.
* The sample project does not connect to any Database for the user validation.

### Harware
* Raspberry pi 3 Model B
* Replay Switches
* Wires
* *In Case Testing with LED
* LED, Bread Board, Resitors

Refer the GPIO pin numbers for the specific board before connection.

### Installations
* Raspbian
* Tomcat
* pi4j
* Maven

### Project Set up
The project refers to Bootstrap and jQuery for the UI. Download them separately and have them under 
```js
src
  |__main
       |__webapp
             |__resources
                    |__assets
                    |     |__brand
                    |     |__css
                    |     |__flash
                    |     |__img
                    |     |__js
                    |__dist
                    |     |_css
                    |__jumbotron-narrow
                    |__navbar
                  
```
If the start up fails to initialise, it is most likely that you should give root access to the user and possibley have to build it in th e root direcory. The pi4J will not have access if the user does not have root access.

### Built With
* [Maven](https://maven.apache.org/) - Dependency Management

### Deployment
Once Deployed Tomcat should start up the application 
```
I have renamed my Raspberry Host 'sampi' and configured Tomcat instance to run on 9080
http://raspberrypi:9080/iot-raspberrypi3-1.0/login.html
```
