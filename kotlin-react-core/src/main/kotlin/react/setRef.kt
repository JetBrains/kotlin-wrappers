package react

/**
 * [Original](https://github.com/mui/material-ui/blob/f0f33c6038f874d2f3ecc251a8ca5bc640424992/packages/mui-utils/src/setRef.ts#L16
 */
fun <T : Any> setRef(
    ref: Ref<T>?,
    value: T?,
) {
    ref ?: return

    if (ref is Function<*>) {
        ref.asDynamic()(value)
    } else {
        val refObject = ref.unsafeCast<MutableRefObject<T>>()
        refObject.current = value
    }
}
