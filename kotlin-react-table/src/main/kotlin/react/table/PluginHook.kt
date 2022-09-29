@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.table

external interface PluginHook<in D : Any> {
    val pluginName: String?
}

inline fun <D : Any> PluginHook(
    noinline block: Hooks<D>.() -> Unit,
): PluginHook<D> =
    block.unsafeCast<PluginHook<D>>()
