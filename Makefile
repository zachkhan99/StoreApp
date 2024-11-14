JAVAC = javac
JAR = jar
SRC_DIR = src
BIN_DIR = bin
JAR_NAME = StoreApp.jar
MAIN_CLASS = Main

# Clean the build
clean:
	rm -rf $(BIN_DIR) $(JAR_NAME)

# Compile the source files
compile:
	mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(SRC_DIR)/*.java

# Create the JAR file
build: compile
	$(JAR) cfm $(JAR_NAME) $(SRC_DIR)/MANIFEST.MF -C $(BIN_DIR) .

# Run the JAR file
run: build
	java -jar $(JAR_NAME)
