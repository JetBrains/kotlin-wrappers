package js.function

import seskar.js.JsNativeInvoke

@PublishedApi
internal interface UnsafeInvoker<out R> {
    @JsNativeInvoke
    fun invoke(): R

    @JsNativeInvoke
    fun invoke(
        p1: Any?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: Any?,
        p2: Any?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: Any?,
        p2: Any?,
        p3: Any?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: Any?,
        p2: Any?,
        p3: Any?,
        p4: Any?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: Any?,
        p2: Any?,
        p3: Any?,
        p4: Any?,
        p5: Any?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: Any?,
        p2: Any?,
        p3: Any?,
        p4: Any?,
        p5: Any?,
        p6: Any?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: Any?,
        p2: Any?,
        p3: Any?,
        p4: Any?,
        p5: Any?,
        p6: Any?,
        p7: Any?,
    ): R
}
