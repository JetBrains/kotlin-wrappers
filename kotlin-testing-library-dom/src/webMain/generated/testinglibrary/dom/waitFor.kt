// Automatically generated - do not modify!

@file:JsModule("@testing-library/dom")

package testinglibrary.dom

import js.promise.Promise

@JsName("waitFor")
external fun <T> waitForRaw(
    callback: () -> js.promise.PromiseResult<T>,
    options: waitForOptions = definedExternally,
): Promise<T>
