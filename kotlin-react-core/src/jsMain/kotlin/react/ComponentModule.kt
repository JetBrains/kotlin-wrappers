package react

import js.objects.JsPlainObject

@JsPlainObject
external interface ComponentModule<in P : Props> {
    val default: ComponentType<P>
}
