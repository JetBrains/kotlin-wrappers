package js.globals

import js.objects.Record

@JsExternalInheritorsOnly
external interface GlobalScope :
    Record<String, Any?>
