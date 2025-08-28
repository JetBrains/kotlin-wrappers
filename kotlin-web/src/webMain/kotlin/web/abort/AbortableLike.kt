package web.abort

import js.internal.InternalApi

@SubclassOptInRequired(InternalApi::class)
external interface AbortableLike {
    val signal: AbortSignal
}
