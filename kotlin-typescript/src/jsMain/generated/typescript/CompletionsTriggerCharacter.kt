// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
