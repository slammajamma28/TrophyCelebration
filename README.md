# TrophyCelebration
 
Automation for [PST Trophy Celebration](https://www.playstationtrophies.org/forum/the-arena/342725-pst-trophy-celebration-discussion-thread.html).

## How it Works

This Java code takes in a comma separated list of participants in the format PST-Name,PSN-name,starting-trophy-count. For each person, it will pull the current number of PS4 trophies earned using https://psnprofiles.com/PSN/log?platform=ps4 and calculate the number earned during the event.

There will be a leaderboard generated formatted with BBcode for posting to the fourm.

## Jaunt

I am using the free web-scraping API Jaunt in order to pull the trophy numbers from PSNP.

## IntelliJ

This repository includes the project files that IntelliJ uses. Because I'm too lazy to add them to .gitignore
