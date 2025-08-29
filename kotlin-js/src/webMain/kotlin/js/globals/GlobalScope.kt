package js.globals

import js.core.JsAny
import js.objects.PropertyKey
import js.objects.Record
import js.reflect.JsExternalInheritorsOnly

@JsExternalInheritorsOnly
external interface GlobalScope :
    Record<PropertyKey, JsAny?>
