// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import js.core.ReadonlyArray

/**
 * Gets the effective type parameters. If the node was parsed in a
 * JavaScript file, gets the type parameters from the `@template` tag from JSDoc.
 *
 * This does *not* return type parameters from a jsdoc reference to a generic type, eg
 *
 * type Id = <T>(x: T) => T
 * // @type {Id}
 * function id(x) { return x }
 */
external fun getEffectiveTypeParameterDeclarations(node: DeclarationWithTypeParameters): ReadonlyArray<TypeParameterDeclaration>
