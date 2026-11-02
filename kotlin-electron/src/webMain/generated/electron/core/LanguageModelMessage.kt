// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface LanguageModelMessage {
    // Docs: https://electronjs.org/docs/api/structures/language-model-message
    var content: js.array.ReadonlyArray<LanguageModelMessageContent>
    var prefix: Boolean?

    /**
     * Can be one of the following values:
     */
    var role: (LanguageModelMessageRole)
}
