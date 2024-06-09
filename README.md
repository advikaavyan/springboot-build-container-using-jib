# springboot-build-container-using-jib

Run the below maven command to push the image to docker hub 

mvn compile jib:build



First time log:
springboot-build-container-using-jib> mvn compile jib:build
[INFO] Scanning for projects...
[INFO]
[INFO] ----< com.advikavyan.examples:springboot-build-container-using-jib >----
[INFO] Building springboot-build-container-using-jib 1.0.1-snapshot
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] The artifact mysql:mysql-connector-java:jar:8.0.31 has been relocated to com.mysql:mysql-connector-j:jar:8.0.31: MySQL Connector/J artifacts moved to reverse-DNS compliant Ma
ven 2+ coordinates.
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ springboot-build-container-using-jib ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[WARNING] Base image 'eclipse-temurin:17-jre' does not use a specific image digest - build may not be reproducible
[WARNING] GET https://registry-1.docker.io/v2/ failed and will be retried
[WARNING] GET https://registry-1.docker.io/v2/library/eclipse-temurin/manifests/17-jre failed and will be retried
[INFO] The base image requires auth. Trying again for eclipse-temurin:17-jre...
[INFO] Using base image with digest: sha256:83a26e53f266effd86bf655262985737213efaeda772025980fad800ef095ad0
[WARNING] HEAD https://registry-1.docker.io/v2/advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot/blobs/sha256:5cb4c731d2480443a0f3dda5893425712ffb334c3c57c29ad6b7cd4dbc76
2c65 failed and will be retried
[WARNING] HEAD https://registry-1.docker.io/v2/advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot/blobs/sha256:d99fa7e59eb5038b548062ce0df71c6dbb88ffe6602c9fb45b6e84d213e6
3bf4 failed and will be retried
[WARNING] HEAD https://registry-1.docker.io/v2/advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot/blobs/sha256:b97110a61d86c7ff7e35c7c6c0e9c8431a7a087345dae96d8daf8512c550
7aaa failed and will be retried
[WARNING] HEAD https://registry-1.docker.io/v2/advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot/blobs/sha256:3dcc66cf759369b2bb3fd56e7ae258490bf533341b00c85b0e563272ceba
af1d failed and will be retried
[INFO]
[INFO] A new version of jib-maven-plugin (3.4.3) is available (currently using 3.4.0). Update your build configuration to use the latest features and fixes!
[INFO] https://github.com/GoogleContainerTools/jib/blob/master/jib-maven-plugin/CHANGELOG.md
[INFO]
[INFO] Please see https://github.com/GoogleContainerTools/jib/blob/master/docs/privacy.md for info on disabling this update check.
[INFO]
[INFO] Executing tasks:
[INFO] [===========                   ] 35.4% complete   
[INFO] > pushing blob sha256:d99fa7e59eb5038b548062ce0...
[INFO] > pushing blob sha256:b97110a61d86c7ff7e35c7c6c...
[INFO] > pushing blob sha256:3dcc66cf759369b2bb3fd56e7...
[INFO] > checking base image layer sha256:2ec76a50fe7c...
[INFO] > checking base image layer sha256:fab7f202453a...
[INFO] > checking base image layer sha256:2ce2282f972f...
[INFO] > checking base image layer sha256:ee59ca42def8...
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  02:04 min
[INFO] Finished at: 2024-06-09T17:37:24+05:30
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal com.google.cloud.tools:jib-maven-plugin:3.4.0:build (default-cli) on project springboot-build-container-using-jib: Build image failed, perhaps you should
make sure your credentials for 'registry-1.docker.io/advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot' are set up correctly. See https://github.com/GoogleContainerTools
/jib/blob/master/docs/faq.md#what-should-i-do-when-the-registry-responds-with-unauthorized for help: Unauthorized for registry-1.docker.io/advikaavyan/springboot-build-container-using-
jib-1.0.1-snapshot: 401 Unauthorized
[ERROR] HEAD https://registry-1.docker.io/v2/advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot/blobs/sha256:5cb4c731d2480443a0f3dda5893425712ffb334c3c57c29ad6b7cd4dbc762c
65











https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin#using-specific-credentials



we may see mavne unknown phase error when running the build using window.'s terminals (cmd, powershell)

springboot-build-container-using-jib> mvn compile jib:build -Djib.to.auth.username=advikaavyan -Djib.to.auth.password=##########
[INFO] Scanning for projects...
[INFO]
[INFO] ----< com.advikavyan.examples:springboot-build-container-using-jib >----
[INFO] Building springboot-build-container-using-jib 1.0.1-snapshot            
[INFO]   from pom.xml                                                          
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE                                                           
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.211 s
[INFO] Finished at: 2024-06-09T18:26:08+05:30
[INFO] ------------------------------------------------------------------------
tifact-id>[:<plugin-version>]:<goal>. Available lifecycle phases are: pre-clean, clean, post-clean, validate, initialize, generate-sources, process-sources, generate-resources, process
-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-pa
ckage, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy, pre-site, site, post-site, site-deploy. -> [Help 1]


try executing the same command using GIT bash that worked for me image published 

to https://hub.docker.com/repository/docker/advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot

Logs...



springboot-build-container-using-jib (main)
$  mvn compile jib:build -Djib.to.auth.username=advikaavyan -Djib.to.auth.password=######
[INFO] Scanning for projects...
[INFO]
[INFO] ----< com.advikavyan.examples:springboot-build-container-using-jib >----
[INFO] Building springboot-build-container-using-jib 1.0.1-snapshot
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] The artifact mysql:mysql-connector-java:jar:8.0.31 has been relocated to com.mysql:mysql-connector-j:jar:8.0.31: MySQL Connector/J artifacts moved to reverse-DNS compliant Maven 2+ coordinates.
[INFO]
[INFO] --- resources:3.2.0:resources (default-resources) @ springboot-build-container-using-jib ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO]
[INFO] --- compiler:3.8.1:compile (default-compile) @ springboot-build-container-using-jib ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- jib:3.4.0:build (default-cli) @ springboot-build-container-using-jib ---
[WARNING] 'mainClass' configured in 'maven-jar-plugin' is not a valid Java class: ${start-class}
[INFO]
[INFO] Containerizing application to advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot...
[WARNING] Base image 'eclipse-temurin:17-jre' does not use a specific image digest - build may not be reproducible
[INFO] Using credentials from <to><auth> for advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot
[INFO] The base image requires auth. Trying again for eclipse-temurin:17-jre...
[INFO] Using base image with digest: sha256:83a26e53f266effd86bf655262985737213efaeda772025980fad800ef095ad0
[INFO]
[INFO] Container entrypoint set to [java, -cp, @/app/jib-classpath-file, com.advikaavyan.examples.containerusingjib.TestContainerDemoApplication]
[WARNING] POST https://registry-1.docker.io/v2/advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot/blobs/uploads/?mount=sha256:fab7f202453ac8b8def634e399240ab2bd7247e2f125fbddd2dbaaa8fa4ce555&from=library/eclipse-temurin failed and will be retried
[INFO]
[INFO] Built and pushed image as advikaavyan/springboot-build-container-using-jib-1.0.1-snapshot
[INFO] Executing tasks:
[INFO] [==============================] 100.0% complete
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  04:10 min
[INFO] Finished at: 2024-06-09T18:45:21+05:30
[INFO] ------------------------------------------------------------------------

advik@DESKTOP-LDOVLHH MINGW64 ~/Documents/GitHub/springboot-build-container-using-jib (main)
