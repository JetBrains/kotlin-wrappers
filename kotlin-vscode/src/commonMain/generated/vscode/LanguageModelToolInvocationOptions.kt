// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * Options provided for tool invocation.
 */
external interface LanguageModelToolInvocationOptions<T : JsAny?> {
    /**
     * An opaque object that ties a tool invocation to a chat request from a [chat participant][ChatParticipant].
     *
     * The _only_ way to get a valid tool invocation token is using the provided [toolInvocationToken][ChatRequest.toolInvocationToken]
     * from a chat request. In that case, a progress bar will be automatically shown for the tool invocation in the chat response view, and if
     * the tool requires user confirmation, it will show up inline in the chat view.
     *
     * If the tool is being invoked outside of a chat request, `undefined` should be passed instead, and no special UI except for
     * confirmations will be shown.
     *
     * *Note* that a tool that invokes another tool during its invocation, can pass along the `toolInvocationToken` that it received.
     */
    var toolInvocationToken: ChatParticipantToolToken?

    /**
     * The input with which to invoke the tool. The input must match the schema defined in
     * [LanguageModelToolInformation.inputSchema]
     */
    var input: T

    /**
     * Options to hint at how many tokens the tool should return in its response, and enable the tool to count tokens
     * accurately.
     */
    var tokenizationOptions: LanguageModelToolTokenizationOptions?
}
