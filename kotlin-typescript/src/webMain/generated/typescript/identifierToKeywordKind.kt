// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.Identifier
import typescript.ast.KeywordSyntaxKind

/**
 * If the text of an Identifier matches a keyword (including contextual and TypeScript-specific keywords), returns the
 * SyntaxKind for the matching keyword.
 */
external fun identifierToKeywordKind(node: Identifier): KeywordSyntaxKind?
