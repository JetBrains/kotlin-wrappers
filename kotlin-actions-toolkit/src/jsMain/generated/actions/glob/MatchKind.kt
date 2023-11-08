// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package actions.glob

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MatchKind {
    companion object {
        /** Not matched */
        @JsIntValue(0)
        val None: MatchKind

        /** Matched if the path is a directory */
        @JsIntValue(1)
        val Directory: MatchKind

        /** Matched if the path is a regular file */
        @JsIntValue(2)
        val File: MatchKind

        /** Matched */
        @JsIntValue(3)
        val All: MatchKind
    }
}
