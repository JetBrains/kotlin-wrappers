// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.objects.JsPlainObject
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A range represents an ordered pair of two positions.
 * It is guaranteed that [start}.isBeforeOrEqual({@link Range.end end][Range.start])
 *
 * Range objects are __immutable__. Use the [with][Range.with],
 * [intersection}, or {@link Range.union union][Range.intersection] methods
 * to derive new ranges from an existing range.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range)
 */
open external class Range {
    /**
     * The start position. It is before or equal to [end][Range.end].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.start)
     */
    val start: Position

    /**
     * The end position. It is after or equal to [start][Range.start].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.end)
     */
    val end: Position

    /**
     * Create a new range from two positions. If `start` is not
     * before or equal to `end`, the values will be swapped.
     *
     * @param start A position.
     * @param end A position.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.constructor)
     */
    constructor(
        start: Position,
        end: Position,
    )

    /**
     * Create a new range from number coordinates. It is a shorter equivalent of
     * using `new Range(new Position(startLine, startCharacter), new Position(endLine, endCharacter))`
     *
     * @param startLine A zero-based line value.
     * @param startCharacter A zero-based character value.
     * @param endLine A zero-based line value.
     * @param endCharacter A zero-based character value.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.constructor)
     */
    constructor(
        startLine: Int,
        startCharacter: Int,
        endLine: Int,
        endCharacter: Int,
    )

    /**
     * `true` if `start` and `end` are equal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.isEmpty)
     */
    var isEmpty: Boolean

    /**
     * `true` if `start.line` and `end.line` are equal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.isSingleLine)
     */
    var isSingleLine: Boolean

    /**
     * Check if a position or a range is contained in this range.
     *
     * @param positionOrRange A position or a range.
     * @returns `true` if the position or range is inside or equal
     * to this range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.contains)
     */
    fun contains(positionOrRange: Position): Boolean

    fun contains(positionOrRange: Range): Boolean

    /**
     * Check if `other` equals this range.
     *
     * @param other A range.
     * @returns `true` when start and end are [equal][Position.isEqual] to
     * start and end of this range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.isEqual)
     */
    fun isEqual(other: Range): Boolean

    /**
     * Intersect `range` with this range and returns a new range or `undefined`
     * if the ranges have no overlap.
     *
     * @param range A range.
     * @returns A range of the greater start and smaller end positions. Will
     * return undefined when there is no overlap.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.intersection)
     */
    fun intersection(range: Range): Range?

    /**
     * Compute the union of `other` with this range.
     *
     * @param other A range.
     * @returns A range of smaller start position and the greater end position.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.union)
     */
    fun union(other: Range): Range

    /**
     * Derived a new range from this range.
     *
     * @param start A position that should be used as start. The default value is the [current start][Range.start].
     * @param end A position that should be used as end. The default value is the [current end][Range.end].
     * @returns A range derived from this range with the given start and end position.
     * If start and end are not different `this` range will be returned.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.with)
     */
    fun with(
        start: Position = definedExternally,
        end: Position = definedExternally,
    ): Range

    /**
     * Derived a new range from this range.
     *
     * @param change An object that describes a change to this range.
     * @returns A range that reflects the given change. Will return `this` range if the change
     * is not changing anything.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Range.with)
     */
    fun with(change: WithChange): Range


    @JsPlainObject
    interface WithChange {
        /**
         * New start position, defaults to [current start][Range.start]
         */
        var start: Position?

        /**
         * New end position, defaults to [current end][Range.end]
         */
        var end: Position?
    }
}
