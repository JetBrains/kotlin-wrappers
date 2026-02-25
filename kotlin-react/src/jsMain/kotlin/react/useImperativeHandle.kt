package react

import react.raw.useImperativeHandleRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useImperativeHandle)
 */
inline fun <T : Any> useImperativeHandle(
    ref: Ref<T>?,
    vararg dependencies: Any?,
    noinline init: () -> T?,
) =
    useImperativeHandleRaw(ref, init, dependencies)
