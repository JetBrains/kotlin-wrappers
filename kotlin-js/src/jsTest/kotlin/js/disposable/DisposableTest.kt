package js.disposable

import js.function.JsFunction
import js.function.invoke
import js.globals.globalThis
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertTrue

class DisposableTest {
    @BeforeTest
    fun setUp() {
        // TODO: remove polyfill after proposal release
        globalThis["DisposableStack"] = JsFunction<DisposableStack>(
            // language=javascript
            """
                return class DisposableStack {
                  #stack = []

                  use(disposable) {
                    this.#stack.push(disposable)
                    return disposable
                  }

                  [Symbol.dispose]() {
                    for (const disposable of this.#stack) {
                      disposable[Symbol.dispose]()
                    }
                  }
                }
            """.trimIndent()
        )()
    }

    @AfterTest
    fun tearDown() {
        globalThis["DisposableStack"] = undefined
    }

    private fun createDisposable(onDispose: () -> Unit): Disposable {
        return JsFunction<() -> Unit, Disposable>(
            "onDispose",
            // language=javascript
            "return {[Symbol.dispose]: onDispose}"
        )(onDispose)
    }

    @Test
    fun usingSync() {
        var isFirstDisposed = false
        val firstDisposable = createDisposable { isFirstDisposed = true }

        var isSecondDisposed = false
        val secondDisposable = createDisposable { isSecondDisposed = true }

        usingSync {
            use(firstDisposable)
            use(secondDisposable)
        }

        assertTrue(isFirstDisposed)
        assertTrue(isSecondDisposed)
    }

    @Test
    fun usingSyncWithError() {
        var isFirstDisposed = false
        val firstDisposable = createDisposable { isFirstDisposed = true }

        var isSecondDisposed = false
        val secondDisposable = createDisposable { isSecondDisposed = true }

        val result = runCatching {
            usingSync {
                use(firstDisposable)
                use(secondDisposable)

                error("Test error")
            }
        }

        assertTrue(result.isFailure)
        assertTrue(isFirstDisposed)
        assertTrue(isSecondDisposed)
    }
}
