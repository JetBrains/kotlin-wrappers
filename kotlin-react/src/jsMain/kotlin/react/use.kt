@file:JsModule("react")

package react

import js.promise.PromiseLike

/**
 * [Online Documentation](https://react.dev/reference/react/use)
 */
external fun <T> use(
    context: PromiseLike<T>,
): T

/**
 * [Online Documentation](https://react.dev/reference/react/use)
 */
external fun <T> use(
    context: Context<T>,
): T

/**
 * [Online Documentation](https://react.dev/reference/react/use)
 */
external fun <T : Any> use(
    context: RequiredContext<T>,
): T?
