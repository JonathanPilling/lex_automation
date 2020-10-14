<div style="background-color:rgba(0, 0, 0, 0.0470588); vertical-align: middle; padding:60px; font-family: univers">

# Running Automation

1. First, navigate to **http://martech-d01.vwsl.pgx.local:8080/** This is where the jenkins server is hosted. You must navigate to this server to run the automation test suite, or individual test suites
2. You should see a screen that says, **Welcome to Jenkins!** fill in the following fields:
   *Username*: **admin**
   *Password*: **admin**
   and click **Sign in**
3. You should see the main Jenkins page with a list of projects. To run an automation suite, click on a project ![image](images/jenkins-dashboard.png)
4. On the project screen, click **Build Now** on the left
5. A few seconds later you'll see a flashing build icon and a progress bar under **Build History** ![image](images/flashing-build.png)
6. The tests are running now, you can click on the Build # then **Console Output** for more information while it's running
7. When the build finishes, you'll see a blue circle for success and a red circle for failures

# Figuring Things Out (Pass/Fail)

1. For the time being, figuring out why things failed can be tricky. Hopefully this will be made a little easier in the future. Click on a pass/failed project, indicated by a blue/red circle
2. Click on the build you are interested in under, **Build History**
3. Click **Console Output** on the left
4. Scroll through the output to the bottom, you should see something like this for a pass: ![image](images/test-pass.png)
Or this, for a fail: ![image](images/test-fail.png)
The automation suite makes use of the RetryAnalyzer class, so tests will run 5x before they are flagged as a fail. If a test is failing here, it means it failed 5x in a row and likely something is wrong with the website or there was a change that broke the framework. You can read the test name to get a better idea of what went wrong. ![image](images/credit-repair-fail.png)
For example, take the class/method name, LexHomepageTests.canNavigateToCreditRepair. LexHomepageTests refers to the fact we were running tests on the lexington law homepage. 'canNavigateToCreditRepair' is a test that clicks on **Credit Repair** in the LexingtonLaw header and verifies that we are at the correct URL

# Changing Email Recipients and Build Schedule

### Build Schedule Configuration

1. Sign into Jenkins and click on a project you would like to configure.
2. Click **Configure** on the left
3. Navigate to **Build Triggers**
4. Check **Build periodically** ![image](images/build-triggers.png)
5. In the **Schedule** text field, enter a Cron string 
   - More information on Cron can be found here: [Cron](https://en.wikipedia.org/wiki/Cron)
   - For example, '**\* \* \* \* \***' runs every minute of every day.

### Changing Email Recipients

1. Sign into Jenkins and click on a project you would like to configure.
2. Click **Configure** on the left
3. Navigate to **Post-build Actions**
4. Add any recipients you want in the **Recipients** text field [image](images/post-build.png)
5. Check **Send e-mail for every unstable build** to get email notifications for the above recipients on failed builds.

# Notes on Project Structure
The Jenkins project structure is as follows: 
- **Automation Testing** is the project that runs all automation tests when built
- **www** projects are correspond to individual sites. If you want to run all tests for a particular website, build one of these projects
- **HttpTests** sends request to sites and verifies that the response is an OK status code
</div>