// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SignatureHelpTriggerCharacter {
    companion object {
        @JsValue(",")
        val comma: SignatureHelpTriggerCharacter

        @JsValue("(")
        val leftParenthesis: SignatureHelpTriggerCharacter

        @JsValue("<")
        val less: SignatureHelpTriggerCharacter
    }
}
