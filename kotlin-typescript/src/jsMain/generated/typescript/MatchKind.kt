// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MatchKind {
    companion object {
        @JsValue("exact")
        val exact: MatchKind

        @JsValue("prefix")
        val prefix: MatchKind

        @JsValue("substring")
        val substring: MatchKind

        @JsValue("camelCase")
        val camelCase: MatchKind
    }
}
