package de.mp.jdwc.internal;
/*
 *  Created by Maurice-Pascal at 20:05 on 02.10.2020
 */

import de.mp.jdwc.internal.entities.EmbedObject;
import de.mp.jdwc.internal.impl.JavaDiscordWebhookClientImpl;

import java.io.IOException;

public interface JavaDiscordWebhookClient {

    void setContent(String content);
    void setUsername(String username);
    void setAvatarUrl(String avatarUrl);
    void setTts(boolean tts);
    void addEmbed(EmbedObject embed);
    void execute() throws IOException;

        class Builder {

        public static String url = null;
        public static Long id = null;

        public Builder setToken(String url) {
            Builder.url = url;
            return this;
        }

        public Builder setID(String id) {
            Builder.id = Long.getLong(id);
            return this;
        }

        public Builder setID(Long id) {
            Builder.id = id;
            return this;
        }

        public JavaDiscordWebhookClient build() {
            return new JavaDiscordWebhookClientImpl(Builder.url, Builder.id);
        }

    }

    /**
     *
     * Please contact me if you have some questions:
     * Discord: https://discord.gg/ExCrcDX or "Maurice-Pascal L.#9336"
     *
     * Developed with IntelliJ Community
     *
     * Copyright (C) 2020 by Maurice-Pascal Larvière, all rights reserved
     * All codes are selfmade
     * Copy paste is not allowed
     *
     */

}
