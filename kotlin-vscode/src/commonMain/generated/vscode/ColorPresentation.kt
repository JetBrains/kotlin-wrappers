// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * A color presentation object describes how a {@linkcode Color} should be represented as text and what
 * edits are required to refer to it from source code.
 *
 * For some languages one color can have multiple presentations, e.g. css can represent the color red with
 * the constant `Red`, the hex-value `#ff0000`, or in rgba and hsla forms. In csharp other representations
 * apply, e.g. `System.Drawing.Color.Red`.
 */
open external class ColorPresentation {
    /**
     * The label of this color presentation. It will be shown on the color
     * picker header. By default this is also the text that is inserted when selecting
     * this color presentation.
     */
    var label: String

    /**
     * An {@link TextEdit edit} which is applied to a document when selecting
     * this presentation for the color.  When `falsy` the {@link ColorPresentation.label label}
     * is used.
     */
    var textEdit: TextEdit?

    /**
     * An optional array of additional {@link TextEdit text edits} that are applied when
     * selecting this color presentation. Edits must not overlap with the main {@link ColorPresentation.textEdit edit} nor with themselves.
     */
    var additionalTextEdits: ReadonlyArray<TextEdit>?

    /**
     * Creates a new color presentation.
     *
     * @param label The label of this color presentation.
     */
//  constructor(label: string)
}
