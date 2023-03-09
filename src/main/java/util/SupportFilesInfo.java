package util;

public class SupportFilesInfo {
    public static String POM_CONTENTS = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "\n<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
            "\txsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">\n" +
            "\t<modelVersion>4.0.0</modelVersion>\n" +
            "\t<parent>\n" +
            "\t\t<groupId>org.springframework.boot</groupId>\n" +
            "\t\t<artifactId>spring-boot-starter-parent</artifactId>\n" +
            "\t\t<version>3.0.4</version>\n" +
            "\t\t<relativePath/> <!-- lookup parent from repository -->\n" +
            "\t</parent>\n" +
            "\t<groupId>com.daniel</groupId>\n" +
            "\t<artifactId>demo</artifactId>\n" +
            "\t<version>0.0.1-SNAPSHOT</version>\n" +
            "\t<name>demo</name>\n" +
            "\t<description>Demo project for Spring Boot</description>\n" +
            "\t<properties>\n" +
            "\t\t<java.version>17</java.version>\n" +
            "\t</properties>\n" +
            "\t<dependencies>\n" +
            "\t\t<dependency>\n" +
            "\t\t\t<groupId>org.springframework.boot</groupId>\n" +
            "\t\t\t<artifactId>spring-boot-starter-data-jpa</artifactId>\n" +
            "\t\t</dependency>\n" +
            "\t\t<dependency>\n" +
            "\t\t\t<groupId>org.springframework.boot</groupId>\n" +
            "\t\t\t<artifactId>spring-boot-starter-web</artifactId>\n" +
            "\t\t</dependency>\n" +
            "\n" +
            "\t\t<dependency>\n" +
            "\t\t\t<groupId>org.springframework.boot</groupId>\n" +
            "\t\t\t<artifactId>spring-boot-devtools</artifactId>\n" +
            "\t\t\t<scope>runtime</scope>\n" +
            "\t\t\t<optional>true</optional>\n" +
            "\t\t</dependency>\n" +
            "\t\t<dependency>\n" +
            "\t\t\t<groupId>org.postgresql</groupId>\n" +
            "\t\t\t<artifactId>postgresql</artifactId>\n" +
            "\t\t\t<scope>runtime</scope>\n" +
            "\t\t</dependency>\n" +
            "\t\t<dependency>\n" +
            "\t\t\t<groupId>org.projectlombok</groupId>\n" +
            "\t\t\t<artifactId>lombok</artifactId>\n" +
            "\t\t\t<optional>true</optional>\n" +
            "\t\t</dependency>\n" +
            "\t\t<dependency>\n" +
            "\t\t\t<groupId>org.springframework.boot</groupId>\n" +
            "\t\t\t<artifactId>spring-boot-starter-test</artifactId>\n" +
            "\t\t\t<scope>test</scope>\n" +
            "\t\t</dependency>\n" +
            "\t</dependencies>\n" +
            "\n" +
            "\t<build>\n" +
            "\t\t<plugins>\n" +
            "\t\t\t<plugin>\n" +
            "\t\t\t\t<groupId>org.springframework.boot</groupId>\n" +
            "\t\t\t\t<artifactId>spring-boot-maven-plugin</artifactId>\n" +
            "\t\t\t\t<configuration>\n" +
            "\t\t\t\t\t<excludes>\n" +
            "\t\t\t\t\t\t<exclude>\n" +
            "\t\t\t\t\t\t\t<groupId>org.projectlombok</groupId>\n" +
            "\t\t\t\t\t\t\t<artifactId>lombok</artifactId>\n" +
            "\t\t\t\t\t\t</exclude>\n" +
            "\t\t\t\t\t</excludes>\n" +
            "\t\t\t\t</configuration>\n" +
            "\t\t\t</plugin>\n" +
            "\t\t</plugins>\n" +
            "\t</build>\n" +
            "\n" +
            "</project>";


    public static  String MVNCMD_FILE =
            "@REM ----------------------------------------------------------------------------\n" +
            "@REM Licensed to the Apache Software Foundation (ASF) under one\n" +
            "@REM or more contributor license agreements.  See the NOTICE file\n" +
            "@REM distributed with this work for additional information\n" +
            "@REM regarding copyright ownership.  The ASF licenses this file\n" +
            "@REM to you under the Apache License, Version 2.0 (the\n" +
            "@REM \"License\"); you may not use this file except in compliance\n" +
            "@REM with the License.  You may obtain a copy of the License at\n" +
            "@REM\n" +
            "@REM    https://www.apache.org/licenses/LICENSE-2.0\n" +
            "@REM\n" +
            "@REM Unless required by applicable law or agreed to in writing,\n" +
            "@REM software distributed under the License is distributed on an\n" +
            "@REM \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\n" +
            "@REM KIND, either express or implied.  See the License for the\n" +
            "@REM specific language governing permissions and limitations\n" +
            "@REM under the License.\n" +
            "@REM ----------------------------------------------------------------------------\n" +
            "\n" +
            "@REM ----------------------------------------------------------------------------\n" +
            "@REM Maven Start Up Batch script\n" +
            "@REM\n" +
            "@REM Required ENV vars:\n" +
            "@REM JAVA_HOME - location of a JDK home dir\n" +
            "@REM\n" +
            "@REM Optional ENV vars\n" +
            "@REM M2_HOME - location of maven2's installed home dir\n" +
            "@REM MAVEN_BATCH_ECHO - set to 'on' to enable the echoing of the batch commands\n" +
            "@REM MAVEN_BATCH_PAUSE - set to 'on' to wait for a keystroke before ending\n" +
            "@REM MAVEN_OPTS - parameters passed to the Java VM when running Maven\n" +
            "@REM     e.g. to debug Maven itself, use\n" +
            "@REM set MAVEN_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000\n" +
            "@REM MAVEN_SKIP_RC - flag to disable loading of mavenrc files\n" +
            "@REM ----------------------------------------------------------------------------\n" +
            "\n" +
            "@REM Begin all REM lines with '@' in case MAVEN_BATCH_ECHO is 'on'\n" +
            "@echo off\n" +
            "@REM set title of command window\n" +
            "title %0\n" +
            "@REM enable echoing by setting MAVEN_BATCH_ECHO to 'on'\n" +
            "@if \"%MAVEN_BATCH_ECHO%\" == \"on\"  echo %MAVEN_BATCH_ECHO%\n" +
            "\n" +
            "@REM set %HOME% to equivalent of $HOME\n" +
            "if \"%HOME%\" == \"\" (set \"HOME=%HOMEDRIVE%%HOMEPATH%\")\n" +
            "\n" +
            "@REM Execute a user defined script before this one\n" +
            "if not \"%MAVEN_SKIP_RC%\" == \"\" goto skipRcPre\n" +
            "@REM check for pre script, once with legacy .bat ending and once with .cmd ending\n" +
            "if exist \"%USERPROFILE%\\mavenrc_pre.bat\" call \"%USERPROFILE%\\mavenrc_pre.bat\" %*\n" +
            "if exist \"%USERPROFILE%\\mavenrc_pre.cmd\" call \"%USERPROFILE%\\mavenrc_pre.cmd\" %*\n" +
            ":skipRcPre\n" +
            "\n" +
            "@setlocal\n" +
            "\n" +
            "set ERROR_CODE=0\n" +
            "\n" +
            "@REM To isolate internal variables from possible post scripts, we use another setlocal\n" +
            "@setlocal\n" +
            "\n" +
            "@REM ==== START VALIDATION ====\n" +
            "if not \"%JAVA_HOME%\" == \"\" goto OkJHome\n" +
            "\n" +
            "echo.\n" +
            "echo Error: JAVA_HOME not found in your environment. >&2\n" +
            "echo Please set the JAVA_HOME variable in your environment to match the >&2\n" +
            "echo location of your Java installation. >&2\n" +
            "echo.\n" +
            "goto error\n" +
            "\n" +
            ":OkJHome\n" +
            "if exist \"%JAVA_HOME%\\bin\\java.exe\" goto init\n" +
            "\n" +
            "echo.\n" +
            "echo Error: JAVA_HOME is set to an invalid directory. >&2\n" +
            "echo JAVA_HOME = \"%JAVA_HOME%\" >&2\n" +
            "echo Please set the JAVA_HOME variable in your environment to match the >&2\n" +
            "echo location of your Java installation. >&2\n" +
            "echo.\n" +
            "goto error\n" +
            "\n" +
            "@REM ==== END VALIDATION ====\n" +
            "\n" +
            ":init\n" +
            "\n" +
            "@REM Find the project base dir, i.e. the directory that contains the folder \".mvn\".\n" +
            "@REM Fallback to current working directory if not found.\n" +
            "\n" +
            "set MAVEN_PROJECTBASEDIR=%MAVEN_BASEDIR%\n" +
            "IF NOT \"%MAVEN_PROJECTBASEDIR%\"==\"\" goto endDetectBaseDir\n" +
            "\n" +
            "set EXEC_DIR=%CD%\n" +
            "set WDIR=%EXEC_DIR%\n" +
            ":findBaseDir\n" +
            "IF EXIST \"%WDIR%\"\\.mvn goto baseDirFound\n" +
            "cd ..\n" +
            "IF \"%WDIR%\"==\"%CD%\" goto baseDirNotFound\n" +
            "set WDIR=%CD%\n" +
            "goto findBaseDir\n" +
            "\n" +
            ":baseDirFound\n" +
            "set MAVEN_PROJECTBASEDIR=%WDIR%\n" +
            "cd \"%EXEC_DIR%\"\n" +
            "goto endDetectBaseDir\n" +
            "\n" +
            ":baseDirNotFound\n" +
            "set MAVEN_PROJECTBASEDIR=%EXEC_DIR%\n" +
            "cd \"%EXEC_DIR%\"\n" +
            "\n" +
            ":endDetectBaseDir\n" +
            "\n" +
            "IF NOT EXIST \"%MAVEN_PROJECTBASEDIR%\\.mvn\\jvm.config\" goto endReadAdditionalConfig\n" +
            "\n" +
            "@setlocal EnableExtensions EnableDelayedExpansion\n" +
            "for /F \"usebackq delims=\" %%a in (\"%MAVEN_PROJECTBASEDIR%\\.mvn\\jvm.config\") do set JVM_CONFIG_MAVEN_PROPS=!JVM_CONFIG_MAVEN_PROPS! %%a\n" +
            "@endlocal & set JVM_CONFIG_MAVEN_PROPS=%JVM_CONFIG_MAVEN_PROPS%\n" +
            "\n" +
            ":endReadAdditionalConfig\n" +
            "\n" +
            "SET MAVEN_JAVA_EXE=\"%JAVA_HOME%\\bin\\java.exe\"\n" +
            "set WRAPPER_JAR=\"%MAVEN_PROJECTBASEDIR%\\.mvn\\wrapper\\maven-wrapper.jar\"\n" +
            "set WRAPPER_LAUNCHER=org.apache.maven.wrapper.MavenWrapperMain\n" +
            "\n" +
            "set DOWNLOAD_URL=\"https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.1.0/maven-wrapper-3.1.0.jar\"\n" +
            "\n" +
            "FOR /F \"usebackq tokens=1,2 delims==\" %%A IN (\"%MAVEN_PROJECTBASEDIR%\\.mvn\\wrapper\\maven-wrapper.properties\") DO (\n" +
            "    IF \"%%A\"==\"wrapperUrl\" SET DOWNLOAD_URL=%%B\n" +
            ")\n" +
            "\n" +
            "@REM Extension to allow automatically downloading the maven-wrapper.jar from Maven-central\n" +
            "@REM This allows using the maven wrapper in projects that prohibit checking in binary data.\n" +
            "if exist %WRAPPER_JAR% (\n" +
            "    if \"%MVNW_VERBOSE%\" == \"true\" (\n" +
            "        echo Found %WRAPPER_JAR%\n" +
            "    )\n" +
            ") else (\n" +
            "    if not \"%MVNW_REPOURL%\" == \"\" (\n" +
            "        SET DOWNLOAD_URL=\"%MVNW_REPOURL%/org/apache/maven/wrapper/maven-wrapper/3.1.0/maven-wrapper-3.1.0.jar\"\n" +
            "    )\n" +
            "    if \"%MVNW_VERBOSE%\" == \"true\" (\n" +
            "        echo Couldn't find %WRAPPER_JAR%, downloading it ...\n" +
            "        echo Downloading from: %DOWNLOAD_URL%\n" +
            "    )\n" +
            "\n" +
            "    powershell -Command \"&{\"^\n" +
            "\t\t\"$webclient = new-object System.Net.WebClient;\"^\n" +
            "\t\t\"if (-not ([string]::IsNullOrEmpty('%MVNW_USERNAME%') -and [string]::IsNullOrEmpty('%MVNW_PASSWORD%'))) {\"^\n" +
            "\t\t\"$webclient.Credentials = new-object System.Net.NetworkCredential('%MVNW_USERNAME%', '%MVNW_PASSWORD%');\"^\n" +
            "\t\t\"}\"^\n" +
            "\t\t\"[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12; $webclient.DownloadFile('%DOWNLOAD_URL%', '%WRAPPER_JAR%')\"^\n" +
            "\t\t\"}\"\n" +
            "    if \"%MVNW_VERBOSE%\" == \"true\" (\n" +
            "        echo Finished downloading %WRAPPER_JAR%\n" +
            "    )\n" +
            ")\n" +
            "@REM End of extension\n" +
            "\n" +
            "@REM Provide a \"standardized\" way to retrieve the CLI args that will\n" +
            "@REM work with both Windows and non-Windows executions.\n" +
            "set MAVEN_CMD_LINE_ARGS=%*\n" +
            "\n" +
            "%MAVEN_JAVA_EXE% ^\n" +
            "  %JVM_CONFIG_MAVEN_PROPS% ^\n" +
            "  %MAVEN_OPTS% ^\n" +
            "  %MAVEN_DEBUG_OPTS% ^\n" +
            "  -classpath %WRAPPER_JAR% ^\n" +
            "  \"-Dmaven.multiModuleProjectDirectory=%MAVEN_PROJECTBASEDIR%\" ^\n" +
            "  %WRAPPER_LAUNCHER% %MAVEN_CONFIG% %*\n" +
            "if ERRORLEVEL 1 goto error\n" +
            "goto end\n" +
            "\n" +
            ":error\n" +
            "set ERROR_CODE=1\n" +
            "\n" +
            ":end\n" +
            "@endlocal & set ERROR_CODE=%ERROR_CODE%\n" +
            "\n" +
            "if not \"%MAVEN_SKIP_RC%\"==\"\" goto skipRcPost\n" +
            "@REM check for post script, once with legacy .bat ending and once with .cmd ending\n" +
            "if exist \"%USERPROFILE%\\mavenrc_post.bat\" call \"%USERPROFILE%\\mavenrc_post.bat\"\n" +
            "if exist \"%USERPROFILE%\\mavenrc_post.cmd\" call \"%USERPROFILE%\\mavenrc_post.cmd\"\n" +
            ":skipRcPost\n" +
            "\n" +
            "@REM pause the script if MAVEN_BATCH_PAUSE is set to 'on'\n" +
            "if \"%MAVEN_BATCH_PAUSE%\"==\"on\" pause\n" +
            "\n" +
            "if \"%MAVEN_TERMINATE_CMD%\"==\"on\" exit %ERROR_CODE%\n" +
            "\n" +
            "cmd /C exit /B %ERROR_CODE%\n";


    public static  String READMEMD_FILE = "# Read Me First\n" +
            "The following was discovered as part of building this project:\n" +
            "\n" +
            "* The JVM level was changed from '11' to '17', review the [JDK Version Range](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Versions#jdk-version-range) on the wiki for more details.\n" +
            "\n" +
            "# Getting Started\n" +
            "\n" +
            "### Reference Documentation\n" +
            "For further reference, please consider the following sections:\n" +
            "\n" +
            "* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)\n" +
            "* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.4/maven-plugin/reference/html/)\n" +
            "* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.4/maven-plugin/reference/html/#build-image)\n" +
            "* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.4/reference/htmlsingle/#web)\n" +
            "* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.4/reference/htmlsingle/#using.devtools)\n" +
            "* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.4/reference/htmlsingle/#data.sql.jpa-and-spring-data)\n" +
            "\n" +
            "### Guides\n" +
            "The following guides illustrate how to use some features concretely:\n" +
            "\n" +
            "* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)\n" +
            "* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)\n" +
            "* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)\n" +
            "* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)\n" +
            "\n";

    public static String MVNW_EXEC_FILE = "#!/bin/sh\n" +
            "# ----------------------------------------------------------------------------\n" +
            "# Licensed to the Apache Software Foundation (ASF) under one\n" +
            "# or more contributor license agreements.  See the NOTICE file\n" +
            "# distributed with this work for additional information\n" +
            "# regarding copyright ownership.  The ASF licenses this file\n" +
            "# to you under the Apache License, Version 2.0 (the\n" +
            "# \"License\"); you may not use this file except in compliance\n" +
            "# with the License.  You may obtain a copy of the License at\n" +
            "#\n" +
            "#    https://www.apache.org/licenses/LICENSE-2.0\n" +
            "#\n" +
            "# Unless required by applicable law or agreed to in writing,\n" +
            "# software distributed under the License is distributed on an\n" +
            "# \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\n" +
            "# KIND, either express or implied.  See the License for the\n" +
            "# specific language governing permissions and limitations\n" +
            "# under the License.\n" +
            "# ----------------------------------------------------------------------------\n" +
            "\n" +
            "# ----------------------------------------------------------------------------\n" +
            "# Maven Start Up Batch script\n" +
            "#\n" +
            "# Required ENV vars:\n" +
            "# ------------------\n" +
            "#   JAVA_HOME - location of a JDK home dir\n" +
            "#\n" +
            "# Optional ENV vars\n" +
            "# -----------------\n" +
            "#   M2_HOME - location of maven2's installed home dir\n" +
            "#   MAVEN_OPTS - parameters passed to the Java VM when running Maven\n" +
            "#     e.g. to debug Maven itself, use\n" +
            "#       set MAVEN_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000\n" +
            "#   MAVEN_SKIP_RC - flag to disable loading of mavenrc files\n" +
            "# ----------------------------------------------------------------------------\n" +
            "\n" +
            "if [ -z \"$MAVEN_SKIP_RC\" ] ; then\n" +
            "\n" +
            "  if [ -f /usr/local/etc/mavenrc ] ; then\n" +
            "    . /usr/local/etc/mavenrc\n" +
            "  fi\n" +
            "\n" +
            "  if [ -f /etc/mavenrc ] ; then\n" +
            "    . /etc/mavenrc\n" +
            "  fi\n" +
            "\n" +
            "  if [ -f \"$HOME/.mavenrc\" ] ; then\n" +
            "    . \"$HOME/.mavenrc\"\n" +
            "  fi\n" +
            "\n" +
            "fi\n" +
            "\n" +
            "# OS specific support.  $var _must_ be set to either true or false.\n" +
            "cygwin=false;\n" +
            "darwin=false;\n" +
            "mingw=false\n" +
            "case \"`uname`\" in\n" +
            "  CYGWIN*) cygwin=true ;;\n" +
            "  MINGW*) mingw=true;;\n" +
            "  Darwin*) darwin=true\n" +
            "    # Use /usr/libexec/java_home if available, otherwise fall back to /Library/Java/Home\n" +
            "    # See https://developer.apple.com/library/mac/qa/qa1170/_index.html\n" +
            "    if [ -z \"$JAVA_HOME\" ]; then\n" +
            "      if [ -x \"/usr/libexec/java_home\" ]; then\n" +
            "        export JAVA_HOME=\"`/usr/libexec/java_home`\"\n" +
            "      else\n" +
            "        export JAVA_HOME=\"/Library/Java/Home\"\n" +
            "      fi\n" +
            "    fi\n" +
            "    ;;\n" +
            "esac\n" +
            "\n" +
            "if [ -z \"$JAVA_HOME\" ] ; then\n" +
            "  if [ -r /etc/gentoo-release ] ; then\n" +
            "    JAVA_HOME=`java-config --jre-home`\n" +
            "  fi\n" +
            "fi\n" +
            "\n" +
            "if [ -z \"$M2_HOME\" ] ; then\n" +
            "  ## resolve links - $0 may be a link to maven's home\n" +
            "  PRG=\"$0\"\n" +
            "\n" +
            "  # need this for relative symlinks\n" +
            "  while [ -h \"$PRG\" ] ; do\n" +
            "    ls=`ls -ld \"$PRG\"`\n" +
            "    link=`expr \"$ls\" : '.*-> \\(.*\\)$'`\n" +
            "    if expr \"$link\" : '/.*' > /dev/null; then\n" +
            "      PRG=\"$link\"\n" +
            "    else\n" +
            "      PRG=\"`dirname \"$PRG\"`/$link\"\n" +
            "    fi\n" +
            "  done\n" +
            "\n" +
            "  saveddir=`pwd`\n" +
            "\n" +
            "  M2_HOME=`dirname \"$PRG\"`/..\n" +
            "\n" +
            "  # make it fully qualified\n" +
            "  M2_HOME=`cd \"$M2_HOME\" && pwd`\n" +
            "\n" +
            "  cd \"$saveddir\"\n" +
            "  # echo Using m2 at $M2_HOME\n" +
            "fi\n" +
            "\n" +
            "# For Cygwin, ensure paths are in UNIX format before anything is touched\n" +
            "if $cygwin ; then\n" +
            "  [ -n \"$M2_HOME\" ] &&\n" +
            "    M2_HOME=`cygpath --unix \"$M2_HOME\"`\n" +
            "  [ -n \"$JAVA_HOME\" ] &&\n" +
            "    JAVA_HOME=`cygpath --unix \"$JAVA_HOME\"`\n" +
            "  [ -n \"$CLASSPATH\" ] &&\n" +
            "    CLASSPATH=`cygpath --path --unix \"$CLASSPATH\"`\n" +
            "fi\n" +
            "\n" +
            "# For Mingw, ensure paths are in UNIX format before anything is touched\n" +
            "if $mingw ; then\n" +
            "  [ -n \"$M2_HOME\" ] &&\n" +
            "    M2_HOME=\"`(cd \"$M2_HOME\"; pwd)`\"\n" +
            "  [ -n \"$JAVA_HOME\" ] &&\n" +
            "    JAVA_HOME=\"`(cd \"$JAVA_HOME\"; pwd)`\"\n" +
            "fi\n" +
            "\n" +
            "if [ -z \"$JAVA_HOME\" ]; then\n" +
            "  javaExecutable=\"`which javac`\"\n" +
            "  if [ -n \"$javaExecutable\" ] && ! [ \"`expr \\\"$javaExecutable\\\" : '\\([^ ]*\\)'`\" = \"no\" ]; then\n" +
            "    # readlink(1) is not available as standard on Solaris 10.\n" +
            "    readLink=`which readlink`\n" +
            "    if [ ! `expr \"$readLink\" : '\\([^ ]*\\)'` = \"no\" ]; then\n" +
            "      if $darwin ; then\n" +
            "        javaHome=\"`dirname \\\"$javaExecutable\\\"`\"\n" +
            "        javaExecutable=\"`cd \\\"$javaHome\\\" && pwd -P`/javac\"\n" +
            "      else\n" +
            "        javaExecutable=\"`readlink -f \\\"$javaExecutable\\\"`\"\n" +
            "      fi\n" +
            "      javaHome=\"`dirname \\\"$javaExecutable\\\"`\"\n" +
            "      javaHome=`expr \"$javaHome\" : '\\(.*\\)/bin'`\n" +
            "      JAVA_HOME=\"$javaHome\"\n" +
            "      export JAVA_HOME\n" +
            "    fi\n" +
            "  fi\n" +
            "fi\n" +
            "\n" +
            "if [ -z \"$JAVACMD\" ] ; then\n" +
            "  if [ -n \"$JAVA_HOME\"  ] ; then\n" +
            "    if [ -x \"$JAVA_HOME/jre/sh/java\" ] ; then\n" +
            "      # IBM's JDK on AIX uses strange locations for the executables\n" +
            "      JAVACMD=\"$JAVA_HOME/jre/sh/java\"\n" +
            "    else\n" +
            "      JAVACMD=\"$JAVA_HOME/bin/java\"\n" +
            "    fi\n" +
            "  else\n" +
            "    JAVACMD=\"`\\\\unset -f command; \\\\command -v java`\"\n" +
            "  fi\n" +
            "fi\n" +
            "\n" +
            "if [ ! -x \"$JAVACMD\" ] ; then\n" +
            "  echo \"Error: JAVA_HOME is not defined correctly.\" >&2\n" +
            "  echo \"  We cannot execute $JAVACMD\" >&2\n" +
            "  exit 1\n" +
            "fi\n" +
            "\n" +
            "if [ -z \"$JAVA_HOME\" ] ; then\n" +
            "  echo \"Warning: JAVA_HOME environment variable is not set.\"\n" +
            "fi\n" +
            "\n" +
            "CLASSWORLDS_LAUNCHER=org.codehaus.plexus.classworlds.launcher.Launcher\n" +
            "\n" +
            "# traverses directory structure from process work directory to filesystem root\n" +
            "# first directory with .mvn subdirectory is considered project base directory\n" +
            "find_maven_basedir() {\n" +
            "\n" +
            "  if [ -z \"$1\" ]\n" +
            "  then\n" +
            "    echo \"Path not specified to find_maven_basedir\"\n" +
            "    return 1\n" +
            "  fi\n" +
            "\n" +
            "  basedir=\"$1\"\n" +
            "  wdir=\"$1\"\n" +
            "  while [ \"$wdir\" != '/' ] ; do\n" +
            "    if [ -d \"$wdir\"/.mvn ] ; then\n" +
            "      basedir=$wdir\n" +
            "      break\n" +
            "    fi\n" +
            "    # workaround for JBEAP-8937 (on Solaris 10/Sparc)\n" +
            "    if [ -d \"${wdir}\" ]; then\n" +
            "      wdir=`cd \"$wdir/..\"; pwd`\n" +
            "    fi\n" +
            "    # end of workaround\n" +
            "  done\n" +
            "  echo \"${basedir}\"\n" +
            "}\n" +
            "\n" +
            "# concatenates all lines of a file\n" +
            "concat_lines() {\n" +
            "  if [ -f \"$1\" ]; then\n" +
            "    echo \"$(tr -s '\\n' ' ' < \"$1\")\"\n" +
            "  fi\n" +
            "}\n" +
            "\n" +
            "BASE_DIR=`find_maven_basedir \"$(pwd)\"`\n" +
            "if [ -z \"$BASE_DIR\" ]; then\n" +
            "  exit 1;\n" +
            "fi\n" +
            "\n" +
            "##########################################################################################\n" +
            "# Extension to allow automatically downloading the maven-wrapper.jar from Maven-central\n" +
            "# This allows using the maven wrapper in projects that prohibit checking in binary data.\n" +
            "##########################################################################################\n" +
            "if [ -r \"$BASE_DIR/.mvn/wrapper/maven-wrapper.jar\" ]; then\n" +
            "    if [ \"$MVNW_VERBOSE\" = true ]; then\n" +
            "      echo \"Found .mvn/wrapper/maven-wrapper.jar\"\n" +
            "    fi\n" +
            "else\n" +
            "    if [ \"$MVNW_VERBOSE\" = true ]; then\n" +
            "      echo \"Couldn't find .mvn/wrapper/maven-wrapper.jar, downloading it ...\"\n" +
            "    fi\n" +
            "    if [ -n \"$MVNW_REPOURL\" ]; then\n" +
            "      jarUrl=\"$MVNW_REPOURL/org/apache/maven/wrapper/maven-wrapper/3.1.0/maven-wrapper-3.1.0.jar\"\n" +
            "    else\n" +
            "      jarUrl=\"https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.1.0/maven-wrapper-3.1.0.jar\"\n" +
            "    fi\n" +
            "    while IFS=\"=\" read key value; do\n" +
            "      case \"$key\" in (wrapperUrl) jarUrl=\"$value\"; break ;;\n" +
            "      esac\n" +
            "    done < \"$BASE_DIR/.mvn/wrapper/maven-wrapper.properties\"\n" +
            "    if [ \"$MVNW_VERBOSE\" = true ]; then\n" +
            "      echo \"Downloading from: $jarUrl\"\n" +
            "    fi\n" +
            "    wrapperJarPath=\"$BASE_DIR/.mvn/wrapper/maven-wrapper.jar\"\n" +
            "    if $cygwin; then\n" +
            "      wrapperJarPath=`cygpath --path --windows \"$wrapperJarPath\"`\n" +
            "    fi\n" +
            "\n" +
            "    if command -v wget > /dev/null; then\n" +
            "        if [ \"$MVNW_VERBOSE\" = true ]; then\n" +
            "          echo \"Found wget ... using wget\"\n" +
            "        fi\n" +
            "        if [ -z \"$MVNW_USERNAME\" ] || [ -z \"$MVNW_PASSWORD\" ]; then\n" +
            "            wget \"$jarUrl\" -O \"$wrapperJarPath\" || rm -f \"$wrapperJarPath\"\n" +
            "        else\n" +
            "            wget --http-user=$MVNW_USERNAME --http-password=$MVNW_PASSWORD \"$jarUrl\" -O \"$wrapperJarPath\" || rm -f \"$wrapperJarPath\"\n" +
            "        fi\n" +
            "    elif command -v curl > /dev/null; then\n" +
            "        if [ \"$MVNW_VERBOSE\" = true ]; then\n" +
            "          echo \"Found curl ... using curl\"\n" +
            "        fi\n" +
            "        if [ -z \"$MVNW_USERNAME\" ] || [ -z \"$MVNW_PASSWORD\" ]; then\n" +
            "            curl -o \"$wrapperJarPath\" \"$jarUrl\" -f\n" +
            "        else\n" +
            "            curl --user $MVNW_USERNAME:$MVNW_PASSWORD -o \"$wrapperJarPath\" \"$jarUrl\" -f\n" +
            "        fi\n" +
            "\n" +
            "    else\n" +
            "        if [ \"$MVNW_VERBOSE\" = true ]; then\n" +
            "          echo \"Falling back to using Java to download\"\n" +
            "        fi\n" +
            "        javaClass=\"$BASE_DIR/.mvn/wrapper/MavenWrapperDownloader.java\"\n" +
            "        # For Cygwin, switch paths to Windows format before running javac\n" +
            "        if $cygwin; then\n" +
            "          javaClass=`cygpath --path --windows \"$javaClass\"`\n" +
            "        fi\n" +
            "        if [ -e \"$javaClass\" ]; then\n" +
            "            if [ ! -e \"$BASE_DIR/.mvn/wrapper/MavenWrapperDownloader.class\" ]; then\n" +
            "                if [ \"$MVNW_VERBOSE\" = true ]; then\n" +
            "                  echo \" - Compiling MavenWrapperDownloader.java ...\"\n" +
            "                fi\n" +
            "                # Compiling the Java class\n" +
            "                (\"$JAVA_HOME/bin/javac\" \"$javaClass\")\n" +
            "            fi\n" +
            "            if [ -e \"$BASE_DIR/.mvn/wrapper/MavenWrapperDownloader.class\" ]; then\n" +
            "                # Running the downloader\n" +
            "                if [ \"$MVNW_VERBOSE\" = true ]; then\n" +
            "                  echo \" - Running MavenWrapperDownloader.java ...\"\n" +
            "                fi\n" +
            "                (\"$JAVA_HOME/bin/java\" -cp .mvn/wrapper MavenWrapperDownloader \"$MAVEN_PROJECTBASEDIR\")\n" +
            "            fi\n" +
            "        fi\n" +
            "    fi\n" +
            "fi\n" +
            "##########################################################################################\n" +
            "# End of extension\n" +
            "##########################################################################################\n" +
            "\n" +
            "export MAVEN_PROJECTBASEDIR=${MAVEN_BASEDIR:-\"$BASE_DIR\"}\n" +
            "if [ \"$MVNW_VERBOSE\" = true ]; then\n" +
            "  echo $MAVEN_PROJECTBASEDIR\n" +
            "fi\n" +
            "MAVEN_OPTS=\"$(concat_lines \"$MAVEN_PROJECTBASEDIR/.mvn/jvm.config\") $MAVEN_OPTS\"\n" +
            "\n" +
            "# For Cygwin, switch paths to Windows format before running java\n" +
            "if $cygwin; then\n" +
            "  [ -n \"$M2_HOME\" ] &&\n" +
            "    M2_HOME=`cygpath --path --windows \"$M2_HOME\"`\n" +
            "  [ -n \"$JAVA_HOME\" ] &&\n" +
            "    JAVA_HOME=`cygpath --path --windows \"$JAVA_HOME\"`\n" +
            "  [ -n \"$CLASSPATH\" ] &&\n" +
            "    CLASSPATH=`cygpath --path --windows \"$CLASSPATH\"`\n" +
            "  [ -n \"$MAVEN_PROJECTBASEDIR\" ] &&\n" +
            "    MAVEN_PROJECTBASEDIR=`cygpath --path --windows \"$MAVEN_PROJECTBASEDIR\"`\n" +
            "fi\n" +
            "\n" +
            "# Provide a \"standardized\" way to retrieve the CLI args that will\n" +
            "# work with both Windows and non-Windows executions.\n" +
            "MAVEN_CMD_LINE_ARGS=\"$MAVEN_CONFIG $@\"\n" +
            "export MAVEN_CMD_LINE_ARGS\n" +
            "\n" +
            "WRAPPER_LAUNCHER=org.apache.maven.wrapper.MavenWrapperMain\n" +
            "\n" +
            "exec \"$JAVACMD\" \\\n" +
            "  $MAVEN_OPTS \\\n" +
            "  $MAVEN_DEBUG_OPTS \\\n" +
            "  -classpath \"$MAVEN_PROJECTBASEDIR/.mvn/wrapper/maven-wrapper.jar\" \\\n" +
            "  \"-Dmaven.home=${M2_HOME}\" \\\n" +
            "  \"-Dmaven.multiModuleProjectDirectory=${MAVEN_PROJECTBASEDIR}\" \\\n" +
            "  ${WRAPPER_LAUNCHER} $MAVEN_CONFIG \"$@\"\n";
}
