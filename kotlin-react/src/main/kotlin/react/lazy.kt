@file:JsModule("react")
@file:JsNonModule

package react

import kotlin.js.Promise

external interface RClassModule<in P : RProps> {
    val default: RClass<P>
}

// Lazy (16.6+)
external fun <P : RProps> lazy(
    factory: () -> Promise<RClassModule<P>>,
): RClass<P>
