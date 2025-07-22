// Automatically generated - do not modify!

package vscode

/**
 * A chat participant can be invoked by the user in a chat session, using the `@` prefix. When it is invoked, it handles the chat request and is solely
 * responsible for providing a response to the user. A ChatParticipant is created using {@link chat.createChatParticipant}.
 */
external interface ChatParticipant {
    /**
     * A unique ID for this participant.
     */
    val id: String

    /**
     * An icon for the participant shown in UI.
     */
//  iconPath?: IconPath

    /**
     * The handler for requests to this participant.
     */
//  requestHandler: ChatRequestHandler

    /**
     * This provider will be called once after each request to retrieve suggested followup questions.
     */
//  followupProvider?: ChatFollowupProvider

    /**
     * An event that fires whenever feedback for a result is received, e.g. when a user up- or down-votes
     * a result.
     *
     * The passed {@link ChatResultFeedback.result result} is guaranteed to have the same properties as the result that was
     * previously returned from this chat participant's handler.
     */
//  onDidReceiveFeedback: Event<ChatResultFeedback>

    /**
     * Dispose this participant and free resources.
     */
//  dispose(): void
}
