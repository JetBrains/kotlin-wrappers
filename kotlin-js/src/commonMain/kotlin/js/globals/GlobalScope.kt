package js.globals

import js.core.JsAny
import js.core.JsString
import js.objects.Record
import js.reflect.JsExternalInheritorsOnly

@JsExternalInheritorsOnly
external interface GlobalScope :
    Record<JsString, JsAny?>
