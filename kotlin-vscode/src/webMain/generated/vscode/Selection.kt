// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    // Temp WA for KT-83572
    "CALL_TO_JS_MODULE_WITHOUT_MODULE_SYSTEM",
)

package vscode

import kotlin.js.JsModule

/**
 * Represents a text selection in an editor.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Selection)
 */
open external class Selection :
    Range {
    /**
     * The position at which the selection starts.
     * This position might be before or after [active][Selection.active].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Selection.anchor)
     */
    val anchor: Position

    /**
     * The position of the cursor.
     * This position might be before or after [anchor][Selection.anchor].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Selection.active)
     */
    val active: Position

    /**
     * Create a selection from two positions.
     *
     * @param anchor A position.
     * @param active A position.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Selection.constructor)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Selection.constructor)
     */
    constructor(
        anchorLine: Int,
        anchorCharacter: Int,
        activeLine: Int,
        activeCharacter: Int,
    )

    /**
     * A selection is reversed if its [anchor} is the {@link Selection.end end][Selection.anchor] position.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Selection.isReversed)
     */
    val isReversed: Boolean
}
