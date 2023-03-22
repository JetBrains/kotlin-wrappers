// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package actions.glob

// language=JavaScript
@JsName("""(/*union*/{None: 0, Directory: 1, File: 2, All: 3}/*union*/)""")
sealed external interface MatchKind {
    companion object {
        /** Not matched */
        val None: MatchKind

        /** Matched if the path is a directory */
        val Directory: MatchKind

        /** Matched if the path is a regular file */
        val File: MatchKind

        /** Matched */
        val All: MatchKind
    }
}
