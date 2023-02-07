@file:JsModule("react")
@file:JsNonModule

package react

import kotlin.js.Promise

// Lazy (16.6+)
external fun <P : Props> lazy(
    factory: () -> Promise<ComponentModule<P>>,
): ExoticComponent<P>
