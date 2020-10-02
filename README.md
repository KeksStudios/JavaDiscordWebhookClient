# JavaDiscordWebhookClient
Webhook Client for discord

## Parts
1. [Getting started](#getting-started)
    - [Create Client](#create-client)

## Getting started
### Create Client
```java
DiscordWebhookClient webhookClient = new DiscordWebhookClient.Builder()
   .setURL("WEBHOOK URL GOES HERE") //set url of webhook
   .build(); //build Client
```
