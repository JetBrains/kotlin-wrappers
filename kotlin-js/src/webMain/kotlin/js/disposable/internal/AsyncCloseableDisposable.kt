package js.disposable.internal

import js.internal.InternalApi
import js.symbol.Symbol
import kotlin.js.toJsString

@SubclassOptInRequired(InternalApi::class)
external interface AsyncCloseableDisposable

@PublishedApi
internal suspend fun AsyncCloseableDisposable.close() {
    awaitFirst(
        Symbol.asyncDispose,
        "close".toJsString(),
        "cancel".toJsString(),
    )
}
