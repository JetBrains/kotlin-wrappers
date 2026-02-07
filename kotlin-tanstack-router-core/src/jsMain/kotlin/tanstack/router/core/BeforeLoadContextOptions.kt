package tanstack.router.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface BeforeLoadContextOptions :
    ContextOptions,
    FullSearchSchemaOption {
    val context: Context?
}
