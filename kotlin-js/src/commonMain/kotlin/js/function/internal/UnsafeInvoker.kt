package js.function.internal

import js.core.JsAny
import seskar.js.JsNativeInvoke

@PublishedApi
internal external interface UnsafeInvoker<out R : JsAny?> {
    @JsNativeInvoke
    fun invoke(): R

    @JsNativeInvoke
    fun invoke(
        p1: JsAny?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: JsAny?,
        p2: JsAny?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: JsAny?,
        p2: JsAny?,
        p3: JsAny?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: JsAny?,
        p2: JsAny?,
        p3: JsAny?,
        p4: JsAny?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: JsAny?,
        p2: JsAny?,
        p3: JsAny?,
        p4: JsAny?,
        p5: JsAny?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: JsAny?,
        p2: JsAny?,
        p3: JsAny?,
        p4: JsAny?,
        p5: JsAny?,
        p6: JsAny?,
    ): R

    @JsNativeInvoke
    fun invoke(
        p1: JsAny?,
        p2: JsAny?,
        p3: JsAny?,
        p4: JsAny?,
        p5: JsAny?,
        p6: JsAny?,
        p7: JsAny?,
    ): R
}
