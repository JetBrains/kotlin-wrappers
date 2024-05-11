// Automatically generated - do not modify!

@file:JsModule("@actions/core")

package actions.core

import js.promise.Promise

external suspend fun <T> group(
    name: String,
    fn: () -> Promise<T>,
): T

@JsName("group")
external fun <T> groupAsync(
    name: String,
    fn: () -> Promise<T>,
): Promise<T>
