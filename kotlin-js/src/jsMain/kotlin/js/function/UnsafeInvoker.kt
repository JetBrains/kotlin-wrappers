package js.function

import seskar.js.JsNative

@PublishedApi
internal interface UnsafeInvoker<out R> {
    @JsNative
    fun invoke(): R

    @JsNative
    fun invoke(
        p1: Any?,
    ): R

    @JsNative
    fun invoke(
        p1: Any?,
        p2: Any?,
    ): R

    @JsNative
    fun invoke(
        p1: Any?,
        p2: Any?,
        p3: Any?,
    ): R

    @JsNative
    fun invoke(
        p1: Any?,
        p2: Any?,
        p3: Any?,
        p4: Any?,
    ): R

    @JsNative
    fun invoke(
        p1: Any?,
        p2: Any?,
        p3: Any?,
        p4: Any?,
        p5: Any?,
    ): R

    @JsNative
    fun invoke(
        p1: Any?,
        p2: Any?,
        p3: Any?,
        p4: Any?,
        p5: Any?,
        p6: Any?,
    ): R

    @JsNative
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
