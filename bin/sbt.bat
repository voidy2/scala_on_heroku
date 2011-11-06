set SCRIPT_DIR=%~dp0
java -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -Xmx512M -Dfile.encoding=UTF-8 -jar "%SCRIPT_DIR%sbt-launch.jar" %*
