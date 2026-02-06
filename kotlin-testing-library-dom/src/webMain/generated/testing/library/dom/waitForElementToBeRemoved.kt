// Automatically generated - do not modify!

@file:JsModule("@testing-library/dom")

package testing.library.dom

// unhandled import: waitForOptions from "./wait-for"
import js.promise.Promise

@JsName("waitForElementToBeRemoved")
external fun <T> waitForElementToBeRemovedAsync(
    callback: T,
    options: waitForOptions = definedExternally,
): Promise<js.core.Void>

@JsName("waitForElementToBeRemoved")
external fun <T> waitForElementToBeRemovedAsync(
    callback: () -> T,
    options: waitForOptions = definedExternally,
): Promise<js.core.Void>
