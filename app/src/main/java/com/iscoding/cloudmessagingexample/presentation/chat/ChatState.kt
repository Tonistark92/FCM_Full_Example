package com.iscoding.cloudmessagingexample.presentation.chat

data class ChatState(
    val isEnteringToken: Boolean = true,
    val remoteToken: String = "",
    val messageText: String = ""
)