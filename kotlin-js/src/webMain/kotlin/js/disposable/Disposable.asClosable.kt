package js.disposable

import js.symbol.Symbol

@PublishedApi
internal class AutoCloseableInterop(
    private val disposable: Disposable,
) : AutoCloseable {
    override fun close() {
        disposable[Symbol.dispose]()
    }
}

@PublishedApi
internal fun <T : Disposable> T.asClosable(): AutoCloseable =
    AutoCloseableInterop(this)
