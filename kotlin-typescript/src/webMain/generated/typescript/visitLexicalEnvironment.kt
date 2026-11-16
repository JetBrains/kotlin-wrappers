// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.NodeArray
import typescript.ast.Statement
import typescript.ast.visitor.TransformationContext
import typescript.ast.visitor.Visitor

/**
 * Starts a new lexical environment and visits a statement list, ending the lexical environment
 * and merging hoisted declarations upon completion.
 */
external fun visitLexicalEnvironment(
    statements: NodeArray<Statement>,
    visitor: Visitor<*, *>,
    context: TransformationContext,
    start: Int = definedExternally,
    ensureUseStrict: Boolean = definedExternally,
    nodesVisitor: NodesVisitor = definedExternally,
): NodeArray<Statement>
