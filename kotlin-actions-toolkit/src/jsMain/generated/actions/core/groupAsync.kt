// Automatically generated - do not modify!

@file:JsModule("@actions/core")

package actions.core

import js.promise.Promise

@JsName("group")
external fun <T> groupAsync(
    name: String,
    fn: () -> Promise<T>,
): Promise<T>
