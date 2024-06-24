// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript


sealed external interface ScriptKind {
    sealed interface Unknown : ScriptKind
    sealed interface JS : ScriptKind
    sealed interface JSX : ScriptKind
    sealed interface TS : ScriptKind
    sealed interface TSX : ScriptKind
    sealed interface External : ScriptKind
    sealed interface JSON : ScriptKind
    sealed interface Deferred : ScriptKind

    companion object {
        val Unknown: Unknown
        val JS: JS
        val JSX: JSX
        val TS: TS
        val TSX: TSX
        val External: External
        val JSON: JSON

        /**
         * Used on extensions that doesn't define the ScriptKind but the content defines it.
         * Deferred extensions are going to be included in all project contexts.
         */
        val Deferred: Deferred
    }
}
