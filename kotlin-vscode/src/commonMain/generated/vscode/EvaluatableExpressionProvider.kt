// Automatically generated - do not modify!

package vscode

/**
 * The evaluatable expression provider interface defines the contract between extensions and
 * the debug hover. In this contract the provider returns an evaluatable expression for a given position
 * in a document and the editor evaluates this expression in the active debug session and shows the result in a debug hover.
 */
external interface EvaluatableExpressionProvider {
    /**
     * Provide an evaluatable expression for the given document and position.
     * The editor will evaluate this expression in the active debug session and will show the result in the debug hover.
     * The expression can be implicitly specified by the range in the underlying document or by explicitly returning an expression.
     *
     * @param document The document for which the debug hover is about to appear.
     * @param position The line and character position in the document where the debug hover is about to appear.
     * @param token A cancellation token.
     * @returns An EvaluatableExpression or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     */
//  provideEvaluatableExpression(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<EvaluatableExpression>
}
