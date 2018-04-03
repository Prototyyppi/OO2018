#This is a simple top-level makefile for building asunto and cleaning it
#and not working now (package definitions removed)

JFLAGS =
JC = javac

asunto/AsuntoMain.class: asunto/asuntoMain.java
	$(JC) $(JFLAGS) asunto/AsuntoMain.java

# Make clean gets rid of all .class files ($(RM) == rm -f)
clean:
	$(RM) asunto/*.class