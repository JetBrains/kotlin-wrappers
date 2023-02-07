// Automatically generated - do not modify!

@file:JsModule("@actions/glob")

package actions.glob

import js.core.ReadonlyArray
import js.core.Void

external class Pattern {
    /**
     * Indicates whether matches should be excluded from the result set
     */
    val negate: Boolean

    /**
     * The directory to search. The literal path prior to the first glob segment.
     */
    val searchPath: String

    /**
     * The path/pattern segments. Note, only the first segment (the root directory)
     * may contain a directory separator character. Use the trailingSeparator field
     * to determine whether the pattern ended with a trailing slash.
     */
    val segments: ReadonlyArray<String>

    /**
     * Indicates the pattern should only match directories, not regular files.
     */
    val trailingSeparator: Boolean

    constructor(pattern: String)
    constructor(
        pattern: String,
        isImplicitPattern: Boolean,
        segments: Void,
        homedir: String,
    )

    constructor(
        negate: Boolean,
        isImplicitPattern: Boolean,
        segments: ReadonlyArray<String>,
        homedir: String = definedExternally,
    )

    /**
     * Matches the pattern against the specified path
     */
    fun match(itemPath: String): MatchKind

    /**
     * Indicates whether the pattern may match descendants of the specified path
     */
    fun partialMatch(itemPath: String): Boolean

    companion object {
        /**
         * Escapes glob patterns within a path
         */
        fun globEscape(s: String): String
    }
}
