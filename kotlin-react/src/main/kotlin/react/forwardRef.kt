package react

fun <P : Props> forwardRef(handler: RBuilder.(P, Ref<*>) -> Unit): ComponentType<P> =
    rawForwardRef { props, ref ->
        createElement { handler(props, ref) }
    }
