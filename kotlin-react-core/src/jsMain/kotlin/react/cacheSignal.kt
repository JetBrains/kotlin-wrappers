@file:JsModule("react")

package react

import web.abort.AbortSignal

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface CacheSignal :
    AbortSignal

external fun cacheSignal(): CacheSignal?
