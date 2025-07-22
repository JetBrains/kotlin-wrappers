// Automatically generated - do not modify!

package vscode

/**
 * Will be invoked once after each request to get suggested followup questions to show the user. The user can click the followup to send it to the chat.
 */
external interface ChatFollowupProvider {
    /**
     * Provide followups for the given result.
     *
     * @param result This object has the same properties as the result returned from the participant callback, including `metadata`, but is not the same instance.
     * @param context Extra context passed to a participant.
     * @param token A cancellation token.
     */
//  provideFollowups(result: ChatResult, context: ChatContext, token: CancellationToken): ProviderResult<ChatFollowup[]>;
}
