package react

fun <T : Any, P : PropsWithRef<T>> forwardRef(
    handler: RBuilder.(P, Ref<T>?) -> Unit,
): ForwardRefExoticComponent<P> =
    rawForwardRef { props, forwardedRef ->
        createElement<Props> { handler(props, forwardedRef) }
    }
