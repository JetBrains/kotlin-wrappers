// Automatically generated - do not modify!

@file:JsModule("@testing-library/dom")

package testing.library.dom

// unhandled import: waitForOptions from "./wait-for"

@JsName("waitForElementToBeRemoved")
external fun <T> waitForElementToBeRemovedAsync(
    callback: T,
    options: waitForOptions = definedExternally,
): js.promise.Promise<js.void.Void>

@JsName("waitForElementToBeRemoved")
external fun <T> waitForElementToBeRemovedAsync(
    callback: () -> T,
    options: waitForOptions = definedExternally,
): js.promise.Promise<js.void.Void>
