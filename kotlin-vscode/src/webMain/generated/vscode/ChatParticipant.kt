// Automatically generated - do not modify!

package vscode

/**
 * A chat participant can be invoked by the user in a chat session, using the `@` prefix. When it is invoked, it handles the chat request and is solely
 * responsible for providing a response to the user. A ChatParticipant is created using [chat.createChatParticipant].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatParticipant)
 */
external interface ChatParticipant :
    DisposableLike {
    /**
     * A unique ID for this participant.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatParticipant.id)
     */
    val id: String

    /**
     * An icon for the participant shown in UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatParticipant.iconPath)
     */
    var iconPath: IconPath?

    /**
     * The handler for requests to this participant.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatParticipant.requestHandler)
     */
    var requestHandler: ChatRequestHandler

    /**
     * This provider will be called once after each request to retrieve suggested followup questions.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatParticipant.followupProvider)
     */
    var followupProvider: ChatFollowupProvider?

    /**
     * An event that fires whenever feedback for a result is received, e.g. when a user up- or down-votes
     * a result.
     *
     * The passed [result][ChatResultFeedback.result] is guaranteed to have the same properties as the result that was
     * previously returned from this chat participant's handler.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatParticipant.onDidReceiveFeedback)
     */
    val onDidReceiveFeedback: Event<ChatResultFeedback>

    /**
     * Dispose this participant and free resources.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatParticipant.dispose)
     */
    override fun dispose()
}
