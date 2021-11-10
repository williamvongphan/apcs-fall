echo "What file of words are we testing? Please provide a filename in the Data directory."
read -p "" file
javac Pig.java
java Pig < ../data/$file