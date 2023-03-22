// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

// language=JavaScript
@JsName("""(/*union*/{Unknown: 0, JS: 1, JSX: 2, TS: 3, TSX: 4, External: 5, JSON: 6, Deferred: 7}/*union*/)""")
sealed external interface ScriptKind {
    companion object {
        val Unknown: ScriptKind
        val JS: ScriptKind
        val JSX: ScriptKind
        val TS: ScriptKind
        val TSX: ScriptKind
        val External: ScriptKind
        val JSON: ScriptKind

        /**
         * Used on extensions that doesn't define the ScriptKind but the content defines it.
         * Deferred extensions are going to be included in all project contexts.
         */
        val Deferred: ScriptKind
    }
}
