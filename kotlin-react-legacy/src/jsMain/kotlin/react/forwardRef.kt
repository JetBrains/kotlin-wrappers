package react

import react.raw.forwardRefRaw

fun <T : Any, P : PropsWithRef<T>> forwardRef(
    handler: RBuilder.(P, Ref<T>?) -> Unit,
): ForwardRefExoticComponent<P> =
    forwardRefRaw { props, forwardedRef ->
        createElement<Props> { handler(props, forwardedRef) }
    }
