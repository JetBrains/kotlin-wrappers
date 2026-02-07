// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

/**
 * Various features that the [LanguageModelChatInformation] supports such as tool calling or image input.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatCapabilities)
 */
@JsPlainObject
external interface LanguageModelChatCapabilities {
    /**
     * Whether image input is supported by the model.
     * Common supported images are jpg and png, but each model will vary in supported mimetypes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatCapabilities.imageInput)
     */
    val imageInput: Boolean?

    /**
     * Whether tool calling is supported by the model.
     * If a number is provided, that is the maximum number of tools that can be provided in a request to the model.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatCapabilities.toolCalling)
     */
    val toolCalling: JsAny /* boolean | number */?
}
