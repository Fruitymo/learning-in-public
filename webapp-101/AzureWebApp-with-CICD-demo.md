# Step by step Code deployment done through CI/CD from GitHub to Azure

## What you will need
- [x] Microsoft Azure Subscription [(create one for free)](https://azure.microsoft.com/en-us/free/)
- [x] GitHub account [(join GitHub for free)](https://github.com/join)

## Let's get started
- navigate to Azure dot microsoft dot com
- Log in using your live/microsoft/gitHub ID
- navigate to the quickstart centre wizard
- Click on create a web app

Out of the box you have an option to build and host a web app with azure web apps or create CI/CS pipeline with Azure DevOps.

If you or your team are already using ```Azure DevOps``` for your build pipeline, can use this option.

If you're like me and you use GitHub for almost everything, I'm here to show you how you can use ```GitHub actions``` to integrate a CI/CD pipeline for your azure hosted webapp.

- Click on the ```Build and host a web app with Azure Web Apps``` option
You'll notice you can build and run a webapp on any framework namely dotNet, NodeJS, PHP, Java, Python, .NET Core, HTML5 or Ruby without the hassle of managing the infrastructure.

- Choose your subscription, this works for both free tier Azure subscriptions and paid subscriptions.
- Choose a resource group, if you do not have one you can create one, as best practice, I always append my resource group names with underscore rg

### Instance details

- fill in the name of your webapp, the final url will be the name you provide dot ```azurewebsites.net```
- choose what you'd like to publish
    - Code
    - Docker Container
    - Static Web App
Code is if you already have the source code of your webapp local to your machine or in a GitHub repo
- Choose a runtime stack, OS and region (always good to choose one closest to you)
- select next: Deployment
This is where we now configure our web app to make use of GitHub Actions for continuous integration and deployment. GitHub Actions is an automation framework that can build, test, and deploy your app whenever a new commit is made in your repository. If your code is on GitHub, choose your repository here and it will add a workflow file to automatically deploy your app to App Service. 

If your code is not on GitHub, go to the Deployment Center once the web app is created to set up your deployment

Please note:

- The instance of your webapp must be in the same region as your resource group to avoid failed deployment
- Once deployed successfully, navigate to the deployment center, check if repo is linked
- navigate to Github
- go to ```actions tab```, you'll see the workflow
- check the status of the deployment
- once status changes to done (green), go to your URL and refresh
- Woooohoooo your webapp is now available online 😊

## Contact
[![Twitter URL](https://img.shields.io/twitter/url/https/twitter.com/LeboMadise.svg?style=social&label=Follow%20%40LeboMadise)](https://twitter.com/LeboMadise)
