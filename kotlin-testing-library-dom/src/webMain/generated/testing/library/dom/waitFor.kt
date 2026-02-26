// Automatically generated - do not modify!

@file:JsModule("@testing-library/dom")

package testing.library.dom

@JsName("waitFor")
external fun <T> waitForRaw(
    callback: () -> js.promise.PromiseResult<T>,
    options: waitForOptions = definedExternally,
): js.promise.Promise<T>
