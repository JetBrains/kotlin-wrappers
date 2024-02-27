package js.reflect

external class Proxy<T : Any>(
    target: T,
    handler: ProxyHandler<T>,
) {
    interface Revocable<T : Any> {
        val proxy: T
        fun revoke()
    }

    companion object {
        fun <T : Any> revocable(
            target: T,
            handler: ProxyHandler<T>,
        ): Revocable<T>
    }
}
