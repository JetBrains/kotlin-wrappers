// Automatically generated - do not modify!

package actions.glob

import seskar.js.JsRawValue

sealed external interface MatchKind {
    companion object {
        /** Not matched */
        @JsRawValue("0")
        val None: MatchKind

        /** Matched if the path is a directory */
        @JsRawValue("1")
        val Directory: MatchKind

        /** Matched if the path is a regular file */
        @JsRawValue("2")
        val File: MatchKind

        /** Matched */
        @JsRawValue("3")
        val All: MatchKind
    }
}
