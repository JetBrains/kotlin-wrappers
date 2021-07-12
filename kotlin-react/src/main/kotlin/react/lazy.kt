@file:JsModule("react")
@file:JsNonModule

package react

import kotlin.js.Promise

external interface ComponentModule<in P : RProps> {
    val default: ComponentType<P>
}

// Lazy (16.6+)
external fun <P : RProps> lazy(
    factory: () -> Promise<ComponentModule<P>>
): RClass<P>
