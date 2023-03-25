### Guide

Language: Kotlin (preferred) or Java

Recommended IDE: IntelliJ IDEA. You could try to use something else but that hasn't been tested.

1. You will need a test bot and a test server. Go to https://discord.com/developers/applications and create a bot if you don't have one yet, save the bot token. Also find the id of your test server

(more info https://www.writebots.com/discord-bot-token/)

2. Clone the repository and open the project

3. Gradle sync should start but it will fail because there is no build.properties file. Create a build.properties file in the root directory and paste

```
releaseBotToken = your_token
debugBotToken = your_token
testServerId = your_server_id
```

If you are not going to be building and deploying release versions, you can use the same token for both release and debug

4. Run gradle sync again
5. Open Main.kt file and launch the main() function
6. The bot should start but some commands might not be working correctly because a config file is missing

Go to storage folder in the project directory, create a file dynamicConfig.txt and paste

```
{"shlClaimThreadIds":[127364,126215,124810],"juniorClaimThreads":[127827,126519,125272],"currentSeason":69,"fantasySheetId":"1z7iHel_A1wclkR6uZMfeutvMbfisUAB0-Qz5JVC0J-s","ignoreClaimPostIds":[}
```

This config is for season 69

7. Now everything should be working
