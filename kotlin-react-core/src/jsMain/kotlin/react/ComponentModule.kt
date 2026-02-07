package react

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ComponentModule<in P : Props> {
    val default: ComponentType<P>
}
