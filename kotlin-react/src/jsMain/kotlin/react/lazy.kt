@file:JsModule("react")

package react

import js.promise.Promise

/**
 * [Online Documentation](https://react.dev/reference/react/lazy)
 */
external fun <P : Props> lazy(
    factory: () -> Promise<ComponentModule<P>>,
): ExoticComponent<P>
