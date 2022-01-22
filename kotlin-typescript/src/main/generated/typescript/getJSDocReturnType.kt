// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * Gets the return type node for the node if provided via JSDoc return tag or type tag.
 *
 * @remarks `getJSDocReturnTag` just gets the whole JSDoc tag. This function
 * gets the type from inside the braces, after the fat arrow, etc.
 */
external fun getJSDocReturnType(node: Node): TypeNode?
