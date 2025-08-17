package js.reflect

import js.core.JsAny

interface JsClassReference<T : JsAny> {
    val value: JsClass<T>
}
