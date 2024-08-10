// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript


external val versionMajorMinor: Any? /* should be inferred */

/** The version of the TypeScript compiler release */
external val version: String

external var sys: System

external val unchangedTextChangeRange: TextChangeRange

external val factory: NodeFactory

external object JsTyping {
    sealed interface TypingResolutionHost {
        fun directoryExists(path: String): Boolean
        fun fileExists(fileName: String): Boolean
        fun readFile(path: String, encoding: String = definedExternally): String?
        fun readDirectory(
            rootDir: String,
            extensions: js.array.ReadonlyArray<String>,
            excludes: (js.array.ReadonlyArray<String>)?,
            includes: (js.array.ReadonlyArray<String>)?,
            depth: Double = definedExternally,
        ): js.array.ReadonlyArray<String>
    }
}

external object ScriptSnapshot {
    fun fromString(text: String): IScriptSnapshot
}

/** The version of the language service API */
external val servicesVersion: Any? /* should be inferred */
