// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface AnimationComposition {
    companion object {
        @JsValue("accumulate")
        val accumulate: AnimationComposition

        @JsValue("add")
        val add: AnimationComposition

        @JsValue("replace")
        val replace: AnimationComposition
    }
}
