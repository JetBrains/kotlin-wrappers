// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Provide an inline value through an expression evaluation.
 * If only a range is specified, the expression will be extracted from the underlying document.
 * An optional expression can be used to override the extracted expression.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueEvaluatableExpression)
 */
open external class InlineValueEvaluatableExpression {
    /**
     * The document range for which the inline value applies.
     * The range is used to extract the evaluatable expression from the underlying document.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueEvaluatableExpression.range)
     */
    val range: Range

    /**
     * If specified the expression overrides the extracted expression.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueEvaluatableExpression.expression)
     */
    val expression: String?

    /**
     * Creates a new InlineValueEvaluatableExpression object.
     *
     * @param range The range in the underlying document from which the evaluatable expression is extracted.
     * @param expression If specified overrides the extracted expression.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueEvaluatableExpression.constructor)
     */
    constructor(
        range: Range,
        expression: String = definedExternally,
    )
}
