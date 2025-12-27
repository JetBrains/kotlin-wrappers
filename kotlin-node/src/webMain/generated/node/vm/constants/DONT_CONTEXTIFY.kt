// Automatically generated - do not modify!

@file:JsModule("node:vm")
@file:JsQualifier("constants")

package node.vm.constants

/**
 * This constant, when used as the `contextObject` argument in vm APIs, instructs Node.js to create
 * a context without wrapping its global object with another object in a Node.js-specific manner.
 * As a result, the `globalThis` value inside the new context would behave more closely to an ordinary
 * one.
 *
 * When `vm.constants.DONT_CONTEXTIFY` is used as the `contextObject` argument to {@link createContext},
 * the returned object is a proxy-like object to the global object in the newly created context with
 * fewer Node.js-specific quirks. It is reference equal to the `globalThis` value in the new context,
 * can be modified from outside the context, and can be used to access built-ins in the new context directly.
 * @since v22.8.0
 */
external val DONT_CONTEXTIFY: Double
