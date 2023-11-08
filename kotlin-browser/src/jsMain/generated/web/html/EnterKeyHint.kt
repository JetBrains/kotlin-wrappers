// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface EnterKeyHint {
    companion object {
        @JsValue("enter")
        val enter: EnterKeyHint

        @JsValue("done")
        val done: EnterKeyHint

        @JsValue("go")
        val go: EnterKeyHint

        @JsValue("next")
        val next: EnterKeyHint

        @JsValue("previous")
        val previous: EnterKeyHint

        @JsValue("search")
        val search: EnterKeyHint

        @JsValue("send")
        val send: EnterKeyHint
    }
}
