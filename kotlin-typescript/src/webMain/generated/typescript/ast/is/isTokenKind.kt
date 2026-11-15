// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript.ast.`is`

import typescript.ast.SyntaxKind

/**
 * True if kind is of some token syntax kind.
 * For example, this is true for an IfKeyword but not for an IfStatement.
 * Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail.
 */
external fun isTokenKind(kind: SyntaxKind): Boolean
