package js.disposable.internal

import js.internal.InternalApi
import js.objects.PropertyKey
import js.symbol.Symbol

@SubclassOptInRequired(InternalApi::class)
external interface AsyncCloseableDisposable

@PublishedApi
internal suspend fun AsyncCloseableDisposable.close() {
    awaitFirst(
        Symbol.asyncDispose,
        PropertyKey("close"),
        PropertyKey("cancel"),
    )
}
