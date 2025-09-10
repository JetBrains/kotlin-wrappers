// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsAny

/**
 * Extra context passed to a participant.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatContext)
 */
@JsPlainObject
external interface ChatContext {
    /**
     * All of the chat messages so far in the current chat session. Currently, only chat messages for the current participant are included.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatContext.history)
     */
    val history: ReadonlyArray<JsAny /* ChatRequestTurn | ChatResponseTurn */>
}
