package js.reflect

import kotlin.js.JsAny

external class Proxy<T : JsAny>(
    target: T,
    handler: ProxyHandler<T>,
) {
    sealed interface Revocable<T : JsAny> {
        val proxy: T
        fun revoke()
    }

    companion object {
        fun <T : JsAny> revocable(
            target: T,
            handler: ProxyHandler<T>,
        ): Revocable<T>
    }
}
