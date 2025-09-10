package js.globals

import js.objects.PropertyKey
import js.objects.Record
import js.reflect.JsExternalInheritorsOnly
import kotlin.js.JsAny

@JsExternalInheritorsOnly
external interface GlobalScope :
    Record<PropertyKey, JsAny?>
