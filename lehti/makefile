#This is a simple makefile for building, cleaning and running Subscription.

JFLAGS =
JC = javac
CLASSES = RegularSubscription.java StandingSubscription.java Subscription.java SubscriptionMain.java

.PHONY: run clean go

# FILE (file to be created): FILE.java (depends on this/these)
	#How to make the file
SubscriptionMain: $(CLASSES)
	@$(JC) $(JFLAGS) $(CLASSES)
	@echo "--> Compiled OK <--"


# Make clean gets rid of all .class files ($(RM) == rm -f)
clean:
	@$(RM) *.class
	@echo "--> Cleaned OK <--"

# Run program
run:
	@echo
	@java SubscriptionMain

# Do everything!
go: clean SubscriptionMain run
	@echo
	@echo "--> DONE <--"

