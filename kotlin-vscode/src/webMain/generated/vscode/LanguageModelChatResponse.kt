// Automatically generated - do not modify!

package vscode

import js.iterable.AsyncIterable
import js.objects.JsPlainObject
import kotlin.js.JsAny
import kotlin.js.JsString

/**
 * Represents a language model response.
 *
 * @see [ChatRequest]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatResponse)
 */
@JsPlainObject
external interface LanguageModelChatResponse {
    /**
     * An async iterable that is a stream of text and tool-call parts forming the overall response. A
     * [LanguageModelTextPart] is part of the assistant's response to be shown to the user. A
     * [LanguageModelToolCallPart] is a request from the language model to call a tool. The latter will
     * only be returned if tools were passed in the request via [LanguageModelChatRequestOptions.tools]. The
     * `unknown`-type is used as a placeholder for future parts, like image data parts.
     *
     * *Note* that this stream will error when during data receiving an error occurs. Consumers of the stream should handle
     * the errors accordingly.
     *
     * To cancel the stream, the consumer can [cancel][CancellationTokenSource.cancel] the token that was used to make
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatResponse.stream)
     */
    var stream: AsyncIterable<JsAny /* LanguageModelTextPart | LanguageModelToolCallPart | LanguageModelDataPart | unknown */>

    /**
     * This is equivalent to filtering everything except for text parts from a [LanguageModelChatResponse.stream].
     *
     * @see [LanguageModelChatResponse.stream]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatResponse.text)
     */
    var text: AsyncIterable<JsString>
}
