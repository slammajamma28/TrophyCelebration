# TrophyCelebration
 
Automation for [PST Trophy Celebration](https://www.playstationtrophies.org/forum/the-arena/342725-pst-trophy-celebration-discussion-thread.html).

## Instructions on How to Run on Discord

Enter in **$trophy** which will kick it off. The bot will say "Grabbing trophy numbers, brb..." Don't enter in any additional commands until you see "Check it out!" with an attachment. This attachment is the BBCode that can be posted to PST.

If you're on a PC, Discord will download the attached text file to your computer. Open it with something like WordPad.

If you're on mobile (at least for iPhone as that is what I've tested with), you should download the attachment to "Files" as that is the only way I could find of opening it.

For the bot, you can also enter in **$datenow** to see what the current date and time is in UTC.

If the bot becomes unresponsive or offline, ping me and I'll restart it as soon as I'm able.

## Instructions on How To Run Locally

If there are bot issues that cannot be resolved... you can download some things that will enable you to run it on your computer. 

You will need a few things:
- TrophyCelebration.jar
- participants_list
- runit.bat
- Java

I will package all four of these into a zip file and put it on the cloud somewhere.

All you need to do is double-click "runit.bat" and hopefully everything else should take care of itself.

## NONE OF THIS IS WORKING SLAMMA

My bad, ping me and I'll try to fix it.

## How it Works

This Java code takes in a comma separated list of participants in the format PST-Name,PSN-name,starting-trophy-count. For each person, it will pull the current number of PS4 trophies earned using https://psnprofiles.com/PSN/log?platform=ps4 and calculate the number earned during the event.

There will be a leaderboard generated formatted with BBcode for posting to the fourm.

## Jaunt

I am using the free web-scraping API Jaunt in order to pull the trophy numbers from PSNP.

## IntelliJ

This repository includes the project files that IntelliJ uses. Because I'm too lazy to add them to .gitignore
