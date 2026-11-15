// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.Statement
import typescript.ast.visitor.TransformationContext
import typescript.ast.visitor.Visitor

/**
 * Visits an iteration body, adding any block-scoped variables required by the transformation.
 */
external fun visitIterationBody(
    body: Statement,
    visitor: Visitor<*, *>,
    context: TransformationContext,
): Statement
