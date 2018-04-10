#This is a simple makefile for building, cleaning and running Subscription.

JFLAGS =
JC = javac
CLASSES = VT4main.java Property.java InsuranceInfo.java InsInfoContainer.java

.PHONY: run clean go

# FILE (file to be created): FILE.java (depends on this/these)
	#How to make the file
VT4main: $(CLASSES)
	@$(JC) $(JFLAGS) $(CLASSES)
	@echo "--> Compiled OK <--"


# Make clean gets rid of all .class files ($(RM) == rm -f)
clean:
	@$(RM) *.class
	@echo "--> Cleaned OK <--"

# Run program
run:
	@echo
	@java VT4main

# Do everything!
go: clean VT4main run
	@echo
	@echo "--> DONE <--"

