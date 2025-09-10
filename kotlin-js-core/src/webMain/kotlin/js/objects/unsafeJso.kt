package js.objects

import kotlin.js.JsAny

expect fun <T : JsAny> unsafeJso(): T
