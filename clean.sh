echo 'Are you sure you want to delete all class files?'
echo 'Here are the files that will be deleted: '
find ./ -type f -name "*.class" -print
echo 'Please press any key to continue or CTRL-C to cancel.'
read
find ./ -type f -name "*.class" -delete
echo 'All class files successfully deleted.'
