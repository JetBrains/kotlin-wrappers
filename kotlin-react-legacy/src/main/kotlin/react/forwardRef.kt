package react

fun <T : Any, P : PropsWithRef<T>> forwardRef(handler: RBuilder.(P, Ref<T>?) -> Unit): ComponentType<P> =
    rawForwardRef { props, ref ->
        createElement<Props> { handler(props, ref) }
    }
