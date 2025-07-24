// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny

/**
 * Extra context passed to a participant.
 */
external interface ChatContext {
    /**
     * All of the chat messages so far in the current chat session. Currently, only chat messages for the current participant are included.
     */
    val history: ReadonlyArray<JsAny /* ChatRequestTurn | ChatResponseTurn */>
}
