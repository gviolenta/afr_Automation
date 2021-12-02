# nine-afr-automation

This project is a UI automation solution that will test for the subsciption prompt on an AFR page.
The test scenarios will run successfully on chromedriver.

## Pre-requisites
1. Java installed in the system --> Java JDK 16 is used for this project
```
  Reference: 
    Windows - https://www.youtube.com/watch?v=FqpmH8MVO6A&list=PLhW3qG5bs-L_qj1L5hnHvJYeFpQ_g4UuU&index=3&t=115s
    Mac - https://www.youtube.com/watch?v=NSvtis2fGlA&list=PLhW3qG5bs-L_qj1L5hnHvJYeFpQ_g4UuU&index=4
```           
2. Eclipse is installed in the system -IDE
```
  Reference:  https://www.youtube.com/watch?v=rpB1WWqZ6HQ&list=PLhW3qG5bs-L_H3ae0zT1hMrS9nhoujIj7&index=2&t=48s
 ```
3. Maven installed in the system
```
  Reference:  
    Windows - https://www.youtube.com/watch?v=K9U-5aa8VwE&list=PLhW3qG5bs-L8XkBrI-G5aTUo6QwEEoVcj&index=2
    Mac - https://www.youtube.com/watch?v=EoXImdzlAls&list=PLhW3qG5bs-L8XkBrI-G5aTUo6QwEEoVcj&index=3&t=7s
``` 
4. Download chromedriver.exe that is compatible to your Chrome version and replace the one in /src/test/resources/drivers
```
  Reference: https://chromedriver.chromium.org/
```

## Run Scripts
1. Clone the project and import to eclipse IDE
2. Once immported, right click on pom.xml > Maven > Update project
3. Open TestRunner.java from src/test/java/runner
4. Update CHROMEDRIVER_PATH value on line 5 of src/test/java/utilities/Constants.java
```
   Windows user: /src/test/resources/drivers/chromedriver.exe
   Mac user: /src/test/resources/drivers/chromedriver
```   
5.  Right click anywhere in the file and Run As > TestNG Test
