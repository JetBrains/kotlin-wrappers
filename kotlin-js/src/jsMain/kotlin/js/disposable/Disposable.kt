@file:Suppress(
    "JS_ACTUAL_EXTERNAL_INTERFACE_WHILE_EXPECT_WITHOUT_JS_NO_RUNTIME",
)

package js.disposable

actual external interface Disposable {

    actual interface Mixin :
        Disposable
}
