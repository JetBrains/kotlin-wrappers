// Automatically generated - do not modify!

@file:JsModule("node:test")

package node.test

/**
 * This function is used to create a hook running after each subtest of the current test.
 * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
 *    the second argument. Default: A no-op function.
 * @param options Configuration options for the hook.
 * @since v18.8.0
 */
external fun afterEach(
    fn: HookFn = definedExternally,
    options: HookOptions = definedExternally,
)
