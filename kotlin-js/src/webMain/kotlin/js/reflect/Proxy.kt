package js.reflect

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy)
 */
open external class Proxy<T : JsAny>(
    target: T,
    handler: ProxyHandler<T>,
) {
    sealed interface Revocable<T : JsAny> {
        val proxy: T
        fun revoke()
    }

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Proxy/revocable)
         */
        fun <T : JsAny> revocable(
            target: T,
            handler: ProxyHandler<T>,
        ): Revocable<T>
    }
}
