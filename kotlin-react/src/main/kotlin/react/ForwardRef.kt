package react

fun <T : Any, P : PropsWithRef<T>> ForwardRef(
    block: ChildrenBuilder.(
        props: P,
        forwardedRef: Ref<T>?,
    ) -> Unit,
): ForwardRefExoticComponent<P> =
    rawForwardRef { props, ref ->
        createElementOrNull { block(props, ref) }
    }
