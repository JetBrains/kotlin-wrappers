// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a text selection in an editor.
 */
open external class Selection :
    Range {
    /**
     * The position at which the selection starts.
     * This position might be before or after {@link Selection.active active}.
     */
    val anchor: Position

    /**
     * The position of the cursor.
     * This position might be before or after {@link Selection.anchor anchor}.
     */
    val active: Position

    /**
     * Create a selection from two positions.
     *
     * @param anchor A position.
     * @param active A position.
     */
//  constructor(anchor: Position, active: Position);

    /**
     * Create a selection from four coordinates.
     *
     * @param anchorLine A zero-based line value.
     * @param anchorCharacter A zero-based character value.
     * @param activeLine A zero-based line value.
     * @param activeCharacter A zero-based character value.
     */
//  constructor(anchorLine: number, anchorCharacter: number, activeLine: number, activeCharacter: number);

    /**
     * A selection is reversed if its {@link Selection.anchor anchor} is the {@link Selection.end end} position.
     */
    val isReversed: Boolean
}
