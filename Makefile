.PHONY: build
.PHONY: run
.PHONY: clean

build:
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    javac -cp $(antlr4_jar) -d comp/ src/antlr/*.java src/pizza/blackolivepineapple/calculator/*/*.java
endif
run:
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    java -classpath ./comp/:$(antlr4_jar) pizza.blackolivepineapple.calculator.run.Program
endif
clean:
	rm -r comp/
