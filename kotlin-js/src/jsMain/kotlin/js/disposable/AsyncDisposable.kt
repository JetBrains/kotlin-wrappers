@file:Suppress(
    "JS_ACTUAL_EXTERNAL_INTERFACE_WHILE_EXPECT_WITHOUT_JS_NO_RUNTIME",
)

package js.disposable

import js.core.Void
import js.promise.PromiseLike

actual external interface AsyncDisposable {

    @JsSymbol("asyncDispose")
    fun `[@@asyncDispose]`(): PromiseLike<Void>

    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    actual interface Mixin :
        AsyncDisposable {

        override fun `[@@asyncDispose]`(): PromiseLike<Void> = definedExternally
    }
}
