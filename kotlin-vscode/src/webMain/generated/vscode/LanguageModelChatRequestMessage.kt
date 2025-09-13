// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsAny

/**
 * The provider version of {@linkcode LanguageModelChatMessage}.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatRequestMessage)
 */
@JsPlainObject
external interface LanguageModelChatRequestMessage {
    /**
     * The role of this message.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatRequestMessage.role)
     */
    val role: LanguageModelChatMessageRole

    /**
     * A heterogeneous array of things that a message can contain as content. Some parts may be message-type
     * specific for some models.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatRequestMessage.content)
     */
    val content: ReadonlyArray<JsAny /* LanguageModelInputPart | unknown */>

    /**
     * The optional name of a user for this message.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatRequestMessage.name)
     */
    val name: String?
}
