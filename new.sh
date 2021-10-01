echo 'Please give the path and classname of the file that you want to create.'
read -p "Enter directory: " directory
read -p "Enter class name: " classname
touch $directory/$classname.java
"public class " > $directory/$classname.java

