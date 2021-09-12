# DAT250-Assignment 2 Document report



## Experiment 1

### Installation: Derby Database
Tutorial: [apache.org](https://db.apache.org/derby/papers/DerbyTut/index.html)
1. Download [db-derby-10.15.2.0-bin.tar.gz](https://db.apache.org/derby/releases/release-10_15_2_0.cgi)
2. Extract the zip file into a desired folder
3. Set the DERBY_INSTALL variable in .bash_profile:

   `export DERBY_INSTALL=/Applications/Apache-db/db-derby-10.15.2.0-bin`
4. Set the CLASSPATH variable in .bash_profile:
    
    `export CLASSPATH=$DERBY_INSTALL/lib/derby.jar:$DERBY_INSTALL/lib/derbytools.jar:$DERBY_INSTALL/lib/derbyoptionaltools.jar:$DERBY_INSTALL/lib/derbyshared.jar`
5. To make Derby work with the $DERBY_INSTALL-variable, I had to change all DERBY_HOME instances to DERBY_INSTALL inside /bin/setEmbeddedCP
6. Execute the setEmbeddedCP inside bin:

    `. setEmbeddedCP`

#### Tables created in the sample project:
![](Images/db-tables_ex1.png)



## Inspecting the database
To examine the database created, I used Intellij´s database explorer. I connected it to
the Apache Derby-relational database, and got an overview of the different tables created:
![](Images/db-tables_ex2.png)

After defining the different relationships between the entities, I could inspect the visualization diagram created by Intellij:
![](Images/domain-model.png)


### Links
**Experiment 1:** https://github.com/joakimhansen/DAT250/tree/master/Assignment2/Experiment1

**Experiment 2:** https://github.com/joakimhansen/DAT250/tree/master/Assignment2/Experiment2