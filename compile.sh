echo 'Please give the path of the directory to compile.'
read -p "Enter directory: " directory
cd $directory
find . -name "*.java" -print | xargs javac
echo 'All java files were compiled.'