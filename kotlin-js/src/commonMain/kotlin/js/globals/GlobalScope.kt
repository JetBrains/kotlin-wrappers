package js.globals

import js.objects.Record
import js.reflect.JsExternalInheritorsOnly

@JsExternalInheritorsOnly
external interface GlobalScope :
    Record<String, Any?>
