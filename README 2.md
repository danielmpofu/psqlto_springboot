# Convert Postgres SQL to A working spring boot application

## A small app to convert psql to a bare min working springboot application

The purpose of this app is to bring  reduce the time developers take making models and other enties from a pre exisiting database

## Getting Started
### 1. Clone the git repo and save it to your local machine/enviroment
you can either clone the repo or simply download the zip, just make sure you have the code.

### 2. Run maven dependencies
there are a few maven dependencies in there, for more information <a target="_blank" href="https://github.com/danielmpofu/psqlto_springboot/blob/main/pom.xml">click here</a>


### 3. Read the setting.xml file and edit it if you wish to change anything
there are a few configuration which you need to change by just toggling true or false or even typing in some new values
Below is the default setup
<pre>
<configuration name="startup_settings">
        <database>postgres</database>
        <models>true</models>
        <controllers>true</controllers>
        <configs>false</configs>
        <input>input/test_script.sql</input>
        <projectPackage>com.daniel.test</projectPackage>
    </configuration>
</pre>

### 4.  paste in your pg sql database sql file in the sql file in the input directory.
paste in the postgres sql in the file in the input directory and if you happen to rename the file please make sure you add a config in settings.xml

### 5. Cross your fingers, something amaizing is about to happen
just hold your fingers and wait while the app perfoms a magic tric 

### 6. 


