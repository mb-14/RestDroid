##RESTful webservices on android
Maven project for a webapp(WAR) deployable on IJetty.
###Setup Environment:

1. Install the latest maven and android sdk
2. Edit maven.sh according to your maven installation and android-sdk installation directories.
3. Copy maven.sh to the profile.d directory to execute the script everytime you login:
```sh
$sudo cp maven.sh /etc/profile.d/
```


###Building instructions:

Run this command from the project directory:
```sh
$mvn clean install
```

###Deplyoing instructions:

1. Install i-jetty-custom.apk on your device.
2. Copy the built war file to your sdcard.
3. Download & install the war file using I-jetty. Set a context path  of your choice (Example: **rest**).
4. Start I-jetty to deploy.
5. Visit http://localhost:8080/{{context_path}/hello
