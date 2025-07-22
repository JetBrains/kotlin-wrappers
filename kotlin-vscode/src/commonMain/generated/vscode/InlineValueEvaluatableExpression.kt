// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Provide an inline value through an expression evaluation.
 * If only a range is specified, the expression will be extracted from the underlying document.
 * An optional expression can be used to override the extracted expression.
 */
open external class InlineValueEvaluatableExpression {
    /**
     * The document range for which the inline value applies.
     * The range is used to extract the evaluatable expression from the underlying document.
     */
    val range: Range

    /**
     * If specified the expression overrides the extracted expression.
     */
    val expression: String?

    /**
     * Creates a new InlineValueEvaluatableExpression object.
     *
     * @param range The range in the underlying document from which the evaluatable expression is extracted.
     * @param expression If specified overrides the extracted expression.
     */
//  constructor(range: Range, expression?: string);
}
