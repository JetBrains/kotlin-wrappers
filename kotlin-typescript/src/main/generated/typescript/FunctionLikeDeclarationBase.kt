// Automatically generated - do not modify!

package typescript

/**
 * Several node kinds share function-like features such as a signature,
 * a name, and a body. These nodes should extend FunctionLikeDeclarationBase.
 * Examples:
 * - FunctionDeclaration
 * - MethodDeclaration
 * - AccessorDeclaration
 */
sealed external interface FunctionLikeDeclarationBase : SignatureDeclarationBase {
    var _functionLikeDeclarationBrand: Any
    val asteriskToken: AsteriskToken?
    val questionToken: QuestionToken?
    val exclamationToken: ExclamationToken?
    val body: Union.FunctionLikeDeclarationBase_body?
}
