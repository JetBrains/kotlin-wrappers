// Automatically generated - do not modify!

package typescript

import seskar.js.JsValue

sealed external interface CompletionsTriggerCharacter {
    companion object {
        @JsValue(".")
        val period: CompletionsTriggerCharacter

        @JsValue("\"")
        val backslash: CompletionsTriggerCharacter

        @JsValue("'")
        val quote: CompletionsTriggerCharacter

        @JsValue("`")
        val backquote: CompletionsTriggerCharacter

        @JsValue("/")
        val slash: CompletionsTriggerCharacter

        @JsValue("@")
        val at: CompletionsTriggerCharacter

        @JsValue("<")
        val less: CompletionsTriggerCharacter

        @JsValue("#")
        val sharp: CompletionsTriggerCharacter

        @JsValue(" ")
        val space: CompletionsTriggerCharacter
    }
}
