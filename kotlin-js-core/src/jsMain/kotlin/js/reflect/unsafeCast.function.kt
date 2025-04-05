package js.reflect

import js.core.JsAny

actual inline fun <T : Any> unsafeCast(
    noinline value: () -> Unit,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any> unsafeCast(
    noinline value: () -> JsAny?,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any, P1 : Any?> unsafeCast(
    noinline value: (P1) -> Unit,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any, P1 : Any?> unsafeCast(
    noinline value: (P1) -> Any?,
): T =
    value.unsafeCast<T>()
