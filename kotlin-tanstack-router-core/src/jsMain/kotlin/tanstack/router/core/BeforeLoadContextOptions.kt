package tanstack.router.core

import js.objects.JsPlainObject

@JsPlainObject
external interface BeforeLoadContextOptions :
    ContextOptions,
    FullSearchSchemaOption {
    val context: Context?
}
