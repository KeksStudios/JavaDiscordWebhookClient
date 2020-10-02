# JavaDiscordWebhookClient
Webhook Client for discord

## Parts
1. [Getting started](#getting-started)
    - [Create Client](#create-client)
    - [Send messages](#send-messages)
       - [Send textmessages](#send-textmessages)
       - [Send embeds](#send-embeds)
2. [Change webhook metas](#change-webhook-metas)
3. [Download](https://github.com/MauricePascal/JavaDIscordWebhookClient/raw/master/out/artifacts/JavaDiscordWebhookClient/JavaDiscordWebhookClient.jar)

## Getting started
### Create Client
```java
JavaDiscordWebhookClient webhookClient = new JavaDiscordWebhookClient.Builder()
   .setToken("WEBHOOK TOKEN GOES HERE") //set url of webhook
   .setID("WEBHOOK ID GOES HERE") //Long or string
   .build(); //build Client
```
### Send messages
#### Send textmessages
```java
webhookClient.setContent("Helo World!"); //set the message content
webhookClient.execute(); //run the client and send the message(s)
```
You can also enable tts
```java
webhookClient.setContent("Helo World!"); //set the message content
webhookClient.setTts(true); //Enable tts
webhookClient.execute(); //run the client and send the message(s)
```
#### Send Embeds
```java
EmbedObject embed = new EmbedObject() //Create embed object
    embed.setTitle("Hello World"); //Set the title of the embed
    embed.setAuthor("MauricePascal#3009", "https://github.com/MauricePascal", null); //Set the author of the embed
    embed.setColor(Color.CYAN); //Set the color of the embed
    embed.setDescription("Here is a nice description"); //set the description of the embed
    embed.setFooter("Yea idk", null); //Set the footer of the embed
        
webhookClient.addEmbed(embed); //Add the embed(s) to the content
webhookClient.execute(); //run the client and send the message(s)
```
### Send Webhook Metas
```java
webhookClient.setUsername("Webhook"); //Set the username of the webhook
webhookClient.setAvatarUrl("https://cdn.discord.com/avatars/622784776234991626/929965595d84940026cac99ea2c125b0.png"); //Set the avatar of the webhook
```
