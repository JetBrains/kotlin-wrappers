// Automatically generated - do not modify!

package vscode

/**
 * A chat request handler is a callback that will be invoked when a request is made to a chat participant.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatRequestHandler)
 */
typealias ChatRequestHandler = (
    request: ChatRequest,
    context: ChatContext,
    response: ChatResponseStream,
    token: CancellationToken,
) -> ProviderResult<ChatResult?>
