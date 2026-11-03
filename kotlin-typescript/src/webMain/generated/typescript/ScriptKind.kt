// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/* enum */
external class ScriptKind
private constructor() {
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
