// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * An EvaluatableExpression represents an expression in a document that can be evaluated by an active debugger or runtime.
 * The result of this evaluation is shown in a tooltip-like widget.
 * If only a range is specified, the expression will be extracted from the underlying document.
 * An optional expression can be used to override the extracted expression.
 * In this case the range is still used to highlight the range in the document.
 */
open external class EvaluatableExpression {
    /*
     * The range is used to extract the evaluatable expression from the underlying document and to highlight it.
     */
    /*
    readonly range: Range;

    /*
     * If specified the expression overrides the extracted expression.
     */
    readonly expression?: string | undefined
    */

    /**
     * Creates a new evaluatable expression object.
     *
     * @param range The range in the underlying document from which the evaluatable expression is extracted.
     * @param expression If specified overrides the extracted expression.
     */
    constructor(
        range: Range,
        expression: String = definedExternally,
    )
}
