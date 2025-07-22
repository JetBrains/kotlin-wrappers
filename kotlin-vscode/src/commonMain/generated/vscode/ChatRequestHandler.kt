// Automatically generated - do not modify!

package vscode

/**
 * A chat request handler is a callback that will be invoked when a request is made to a chat participant.
 */
typealias ChatRequestHandler = (
    request: ChatRequest,
    context: ChatContext,
    response: ChatResponseStream,
    token: CancellationToken,
) -> ProviderResult<ChatResult?>
