// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Represents a text selection in an editor.
 */
open external class Selection :
    Range {
    /**
     * The position at which the selection starts.
     * This position might be before or after [active][Selection.active].
     */
    val anchor: Position

    /**
     * The position of the cursor.
     * This position might be before or after [anchor][Selection.anchor].
     */
    val active: Position

    /**
     * Create a selection from two positions.
     *
     * @param anchor A position.
     * @param active A position.
     */
    constructor(
        anchor: Position,
        active: Position,
    )

    /**
     * Create a selection from four coordinates.
     *
     * @param anchorLine A zero-based line value.
     * @param anchorCharacter A zero-based character value.
     * @param activeLine A zero-based line value.
     * @param activeCharacter A zero-based character value.
     */
    constructor(
        anchorLine: Int,
        anchorCharacter: Int,
        activeLine: Int,
        activeCharacter: Int,
    )

    /**
     * A selection is reversed if its [anchor} is the {@link Selection.end end][Selection.anchor] position.
     */
    val isReversed: Boolean
}
