// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * Visits an iteration body, adding any block-scoped variables required by the transformation.
 */
external fun visitIterationBody(
    body: Statement,
    visitor: Visitor,
    context: TransformationContext,
): Statement
