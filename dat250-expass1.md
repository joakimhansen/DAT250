# DAT250-Oblig1 Document report
In this report I will write about what I've done during this assignment, and how I set up the
software environment to get familiar with Heroku.

## Installation of the software development environment (MacOS)

### JDK 16.0.2
1. Download and install [jdk-16.0.2_osx-x64_bin.tar.gz](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)
2. Setting the JAVA_HOME variable in .bash_profile:

   `export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-16.0.2.jdk/Contents/Home`
3. Verifying java using: `java -version`

### Maven
1. Download and install [apache-maven-3.8.2-bin.tar.gz](https://maven.apache.org/download.cgi)
2. Change the Shell in Terminal from zsh to bash using the command: `chsh -s /bin/bash`
3. Setting the MAVEN_HOME variable in .bash_profile:
   ```
   export M2_HOME=/Applications/apache-maven-3.8.2
   export PATH=$PATH:$M2_HOME/bin
   ```
4. Verifying maven using: `mvn -version`



### Git
1. Install Homebrew:
`/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`

2. Install Git: `brew install git`

3. Verifying git using: `git --version`

### Heroku
1. Install Heroku using Homebrew:
`brew install heroku/brew/heroku`

2. Verifying Heroku using: `heroku --version`



## Experiment with Heroku
To become familiar with Heroku, I followed the tutorial on
[devcenter.heroku.com](https://devcenter.heroku.com/articles/getting-started-with-java).
Through this tutorial, I learned how to deploy a java application to Heroku,
in addition to run the application locally and in the cloud. I also learned about important files
inside the project, how to provision add-ons to the app, so that features like logging (Papertrail) and databases is available.

**URL to my project:** https://tranquil-caverns-26891.herokuapp.com/