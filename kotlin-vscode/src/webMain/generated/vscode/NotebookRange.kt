// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.objects.JsPlainObject
import kotlin.js.JsModule

/**
 * A notebook range represents an ordered pair of two cell indices.
 * It is guaranteed that start is less than or equal to end.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookRange)
 */
open external class NotebookRange {
    /**
     * The zero-based start index of this range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookRange.start)
     */
    val start: Int

    /**
     * The exclusive end index of this range (zero-based).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookRange.end)
     */
    val end: Int

    /**
     * `true` if `start` and `end` are equal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookRange.isEmpty)
     */
    val isEmpty: Boolean

    /**
     * Create a new notebook range. If `start` is not
     * before or equal to `end`, the values will be swapped.
     *
     * @param start start index
     * @param end end index.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookRange.constructor)
     */
    constructor(
        start: Int,
        end: Int,
    )

    /**
     * Derive a new range for this range.
     *
     * @param change An object that describes a change to this range.
     * @returns A range that reflects the given change. Will return `this` range if the change
     * is not changing anything.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookRange.with)
     */
    fun with(change: WithChange): NotebookRange


    @JsPlainObject
    interface WithChange {
        /**
         * New start index, defaults to `this.start`.
         */
        var start: Int?

        /**
         * New end index, defaults to `this.end`.
         */
        var end: Int?
    }
}
