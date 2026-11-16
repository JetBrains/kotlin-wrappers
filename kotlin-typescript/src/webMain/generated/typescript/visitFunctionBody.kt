// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.ConciseBody
import typescript.ast.FunctionBody
import typescript.ast.visitor.TransformationContext
import typescript.ast.visitor.Visitor

/**
 * Resumes a suspended lexical environment and visits a function body, ending the lexical
 * environment and merging hoisted declarations upon completion.
 */
external fun visitFunctionBody(
    node: FunctionBody,
    visitor: Visitor<*, *>,
    context: TransformationContext,
): FunctionBody

/**
 * Resumes a suspended lexical environment and visits a function body, ending the lexical
 * environment and merging hoisted declarations upon completion.
 */
external fun visitFunctionBody(
    node: FunctionBody?,
    visitor: Visitor<*, *>,
    context: TransformationContext,
): FunctionBody?

/**
 * Resumes a suspended lexical environment and visits a concise body, ending the lexical
 * environment and merging hoisted declarations upon completion.
 */
external fun visitFunctionBody(
    node: ConciseBody,
    visitor: Visitor<*, *>,
    context: TransformationContext,
): ConciseBody
