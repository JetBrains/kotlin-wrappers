// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.typedarrays.Uint8Array
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A language model response part containing arbitrary data. Can be used in [responses][LanguageModelChatResponse],
 * [chat messages}, {@link LanguageModelToolResult tool results][LanguageModelChatMessage], and other language model interactions.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelDataPart)
 */
open external class LanguageModelDataPart {
    /**
     * The mime type which determines how the data property is interpreted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelDataPart.mimeType)
     */
    var mimeType: String

    /**
     * The byte data for this part.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelDataPart.data)
     */
    var data: Uint8Array<*>

    /**
     * Construct a generic data part with the given content.
     * @param data The byte data for this part.
     * @param mimeType The mime type of the data.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelDataPart.constructor)
     */
    constructor(
        data: Uint8Array<*>,
        mimeType: String,
    )

    companion object {
        /**
         * Create a new [LanguageModelDataPart] for an image.
         * @param data Binary image data
         * @param mime The MIME type of the image. Common values are `image/png` and `image/jpeg`.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelDataPart.image)
         */
        fun image(
            data: Uint8Array<*>,
            mime: String,
        ): LanguageModelDataPart

        /**
         * Create a new [LanguageModelDataPart] for a json.
         *
         * *Note* that this function is not expecting "stringified JSON" but
         * an object that can be stringified. This function will throw an error
         * when the passed value cannot be JSON-stringified.
         * @param value  A JSON-stringifyable value.
         * @param mime Optional MIME type, defaults to `application/json`
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelDataPart.json)
         */
        fun json(
            value: JsAny?,
            mime: String = definedExternally,
        ): LanguageModelDataPart

        /**
         * Create a new [LanguageModelDataPart] for text.
         *
         * *Note* that an UTF-8 encoder is used to create bytes for the string.
         * @param value Text data
         * @param mime The MIME type if any. Common values are `text/plain` and `text/markdown`.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelDataPart.text)
         */
        fun text(
            value: String,
            mime: String = definedExternally,
        ): LanguageModelDataPart
    }
}
