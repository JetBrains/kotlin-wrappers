// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package typescript

// language=JavaScript
@JsName("""(/*union*/{Unknown: 0, JS: 1, JSX: 2, TS: 3, TSX: 4, External: 5, JSON: 6, Deferred: 7}/*union*/)""")
external enum class ScriptKind {
    Unknown,
    JS,
    JSX,
    TS,
    TSX,
    External,
    JSON,

    /**
     * Used on extensions that doesn't define the ScriptKind but the content defines it.
     * Deferred extensions are going to be included in all project contexts.
     */
    Deferred,

    ;
}
