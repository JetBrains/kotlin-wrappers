// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents a line and character position, such as
 * the position of the cursor.
 *
 * Position objects are __immutable__. Use the [with][Position.with] or
 * [translate][Position.translate] methods to derive new positions
 * from an existing position.
 */
open external class Position {
    /**
     * The zero-based line value.
     */
    val line: Int

    /**
     * The zero-based character value.
     *
     * Character offsets are expressed using UTF-16 [code units](https://developer.mozilla.org/en-US/docs/Glossary/Code_unit).
     */
    val character: Int

    /**
     * @param line A zero-based line value.
     * @param character A zero-based character value.
     */
    constructor(
        line: Int,
        character: Int,
    )

    /**
     * Check if this position is before `other`.
     *
     * @param other A position.
     * @returns `true` if position is on a smaller line
     * or on the same line on a smaller character.
     */
    fun isBefore(other: Position): Boolean

    /**
     * Check if this position is before or equal to `other`.
     *
     * @param other A position.
     * @returns `true` if position is on a smaller line
     * or on the same line on a smaller or equal character.
     */
    fun isBeforeOrEqual(other: Position): Boolean

    /**
     * Check if this position is after `other`.
     *
     * @param other A position.
     * @returns `true` if position is on a greater line
     * or on the same line on a greater character.
     */
    fun isAfter(other: Position): Boolean

    /**
     * Check if this position is after or equal to `other`.
     *
     * @param other A position.
     * @returns `true` if position is on a greater line
     * or on the same line on a greater or equal character.
     */
    fun isAfterOrEqual(other: Position): Boolean

    /**
     * Check if this position is equal to `other`.
     *
     * @param other A position.
     * @returns `true` if the line and character of the given position are equal to
     * the line and character of this position.
     */
    fun isEqual(other: Position): Boolean

    /**
     * Compare this to `other`.
     *
     * @param other A position.
     * @returns A number smaller than zero if this position is before the given position,
     * a number greater than zero if this position is after the given position, or zero when
     * this and the given position are equal.
     */
    fun compareTo(other: Position): Int

    /**
     * Create a new position relative to this position.
     *
     * @param lineDelta Delta value for the line value, default is `0`.
     * @param characterDelta Delta value for the character value, default is `0`.
     * @returns A position which line and character is the sum of the current line and
     * character and the corresponding deltas.
     */
    fun translate(
        lineDelta: Int = definedExternally,
        characterDelta: Int = definedExternally,
    ): Position

    /**
     * Derived a new position relative to this position.
     *
     * @param change An object that describes a delta to this position.
     * @returns A position that reflects the given delta. Will return `this` position if the change
     * is not changing anything.
     */
    /*
    translate(change: {
        /**
         * Delta value for the line value, default is `0`.
         */
        lineDelta?: number;
        /**
         * Delta value for the character value, default is `0`.
         */
        characterDelta?: number;
    }): Position
    */

    /**
     * Create a new position derived from this position.
     *
     * @param line Value that should be used as line value, default is the [existing value][Position.line]
     * @param character Value that should be used as character value, default is the [existing value][Position.character]
     * @returns A position where line and character are replaced by the given values.
     */
    fun with(
        line: Int = definedExternally,
        character: Int = definedExternally,
    ): Position

    /**
     * Derived a new position from this position.
     *
     * @param change An object that describes a change to this position.
     * @returns A position that reflects the given change. Will return `this` position if the change
     * is not changing anything.
     */
    /*
    with(change: {
        /**
         * New line value, defaults the line value of `this`.
         */
        line?: number;
        /**
         * New character value, defaults the character value of `this`.
         */
        character?: number;
    }): Position
    */
}
