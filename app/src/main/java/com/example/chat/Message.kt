package com.example.chat

class Message {
    var id: String? = null
    var message: String? = null
    var senderId: String? = null
    var timestamp: Long? = null
    var isDateSeparator: Boolean = false
    var status: MessageStatus = MessageStatus.SENT

    constructor() {}

    constructor(
        message: String?,
        senderId: String?,
        timestamp: Long?,
        isDateSeparator: Boolean = false,
        status: MessageStatus = MessageStatus.SENT
    ) {
        this.message = message
        this.senderId = senderId
        this.timestamp = timestamp
        this.isDateSeparator = isDateSeparator
        this.status = status
    }
}