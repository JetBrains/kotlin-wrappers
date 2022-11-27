// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

import js.core.ReadonlyArray

/**
 * Gets the JSDoc parameter tags for the node if present.
 *
 * @remarks Returns any JSDoc param tag whose name matches the provided
 * parameter, whether a param tag on a containing function
 * expression, or a param tag on a variable declaration whose
 * initializer is the containing function. The tags closest to the
 * node are returned first, so in the previous example, the param
 * tag on the containing function expression would be first.
 *
 * For binding patterns, parameter tags are matched by position.
 */
external fun getJSDocParameterTags(param: ParameterDeclaration): ReadonlyArray<JSDocParameterTag>
