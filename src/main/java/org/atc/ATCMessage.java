/*
 * Copyright 2015 Asitha Nanayakkara
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.atc;

/**
 * Generic class to represent messages sent and received through ATC
 * Different protocol implementations need to convert to and from protocol specific
 * message type to ATCMessage as needed.
 */
public class ATCMessage {

    private String messageId;
    private String text;
    private long timestamp;

    /**
     * A{@link org.atc.ATCMessage} created with content set
     * @param text Content as {@link java.lang.String}
     */
    public ATCMessage(String text) {
        this.text = text;
    }

    /**
     * Creates an empty Message without any value set
     */
    public ATCMessage() {
    }

    /**
     * Time the message sent from publisher is returned
     * @return Time the message was sent from publisher
     */
    public long getTimeStamp() {
        return timestamp;
    }

    /**
     * Time the message was sent from publisher should be set with this method
     * @param timeStamp Time the message was sent from publisher
     */
    public void setTimeStamp(long timeStamp) {
        this.timestamp = timeStamp;
    }

    /**
     * Payload (content) of the message is returned
     * @return {@link java.lang.String} representation of content is returned
     */
    public String getStringContent() {
        return text;
    }

    /**
     * Payload (content) of the message is set with this method
     * @param content {@link java.lang.String} representation of the content
     */
    public void setContent(String content) {
        this.text = content;
    }

    /**
     * Message id to uniquely identify the message is set
     * @param messageID unique {@link java.lang.String} to identify the message
     */
    public void setMessageID(String messageID) {
        this.messageId = messageID;
    }

    /**
     * Returns the message id of the message
     * @return message id
     */
    public String getMessageID() {
        return messageId;
    }

    /**
     * String representation of the message including headers
     * @return {@link java.lang.String} representation of the whole message including headers is returned
     */
    @Override
    public String toString() {
        return "\nmessage id: " + messageId + "\n" +
                "timestamp: " + timestamp + "\n" +
                "content: " + text;
    }
}
