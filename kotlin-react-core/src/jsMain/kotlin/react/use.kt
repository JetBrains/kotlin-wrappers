@file:JsModule("react")

package react

import js.promise.PromiseLike

external fun <T> use(
    context: PromiseLike<T>,
): T

external fun <T> use(
    context: Context<T>,
): T

external fun <T : Any> use(
    context: RequiredContext<T>,
): T?
