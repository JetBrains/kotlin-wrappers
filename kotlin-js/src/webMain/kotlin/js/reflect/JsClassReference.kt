package js.reflect

import js.core.JsAny

external interface JsClassReference<T : JsAny> {
    val value: JsClass<T>
}
