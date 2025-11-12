run: build
	java -cp bin Main

build:
	javac -d bin Main.java

clean:
	rm -r bin

git:
	git config --global user.name "MiguelJorge01"
	git config --global user.email "migueljgedacruz@gmail.com"

git-clean:
	git config --global user.name ""
	git config --global user.email ""