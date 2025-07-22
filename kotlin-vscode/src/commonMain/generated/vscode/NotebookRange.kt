// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A notebook range represents an ordered pair of two cell indices.
 * It is guaranteed that start is less than or equal to end.
 */
open external class NotebookRange {
    /**
    // ORIGINAL SOURCE


    /**
     * The zero-based start index of this range.
    */
    readonly start: number;

    /**
     * The exclusive end index of this range (zero-based).
    */
    readonly end: number;

    /**
     * `true` if `start` and `end` are equal.
    */
    readonly isEmpty: boolean;

    /**
     * Create a new notebook range. If `start` is not
     * before or equal to `end`, the values will be swapped.
     *
     * @param start start index
     * @param end end index.
    */
    constructor(start: number, end: number);

    /**
     * Derive a new range for this range.
     *
     * @param change An object that describes a change to this range.
     * @returns A range that reflects the given change. Will return `this` range if the change
     * is not changing anything.
    */
    with(change: {
    /**
     * New start index, defaults to `this.start`.
    */
    start?: number;
    /**
     * New end index, defaults to `this.end`.
    */
    end?: number;
    }): NotebookRange;

    // ORIGINAL SOURCE
     **/
}
