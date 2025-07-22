// Automatically generated - do not modify!

package vscode

import js.iterable.AsyncIterable

/**
 * Represents a language model response.
 *
 * @see {@link ChatRequest}
 */
external interface LanguageModelChatResponse {
    /**
     * An async iterable that is a stream of text and tool-call parts forming the overall response. A
     * {@link LanguageModelTextPart} is part of the assistant's response to be shown to the user. A
     * {@link LanguageModelToolCallPart} is a request from the language model to call a tool. The latter will
     * only be returned if tools were passed in the request via {@link LanguageModelChatRequestOptions.tools}. The
     * `unknown`-type is used as a placeholder for future parts, like image data parts.
     *
     * *Note* that this stream will error when during data receiving an error occurs. Consumers of the stream should handle
     * the errors accordingly.
     *
     * To cancel the stream, the consumer can {@link CancellationTokenSource.cancel cancel} the token that was used to make
     * the request or break from the for-loop.
     *
     * @example
     * ```ts
     * try {
     *   // consume stream
     *   for await (const chunk of response.stream) {
     *      if (chunk instanceof LanguageModelTextPart) {
     *        console.log("TEXT", chunk);
     *      } else if (chunk instanceof LanguageModelToolCallPart) {
     *        console.log("TOOL CALL", chunk);
     *      }
     *   }
     *
     * } catch(e) {
     *   // stream ended with an error
     *   console.error(e);
     * }
     * ```
     */
    var stream: AsyncIterable<Any /* LanguageModelTextPart | LanguageModelToolCallPart | unknown */>

    /**
     * This is equivalent to filtering everything except for text parts from a {@link LanguageModelChatResponse.stream}.
     *
     * @see {@link LanguageModelChatResponse.stream}
     */
    var text: AsyncIterable<String>
}
