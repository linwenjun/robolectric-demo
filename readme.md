### Robolectric Demo

Notes for Mac

If you are on a Mac, you will probably need to configure the default JUnit test runner configuration in order to work around a bug where IntelliJ / Android Studio does not set the working directory to the module being tested. This can be accomplished by editing the run configurations, Defaults -> JUnit and changing the working directory value to $MODULE_DIR$