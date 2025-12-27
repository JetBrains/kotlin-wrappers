// Automatically generated - do not modify!

@file:JsModule("node:test")
@file:JsQualifier("test.assert")

package node.test.assert

/**
 * Defines a new assertion function with the provided name and function. If an
 * assertion already exists with the same name, it is overwritten.
 * @since v22.14.0
 */
external fun register(name: String, fn: Function<Unit> /* (this: TestContext, ...args: any[]) => void */)
