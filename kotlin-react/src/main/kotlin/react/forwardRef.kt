package react

fun <P : RProps> forwardRef(handler: RBuilder.(P, Ref<*>) -> Unit): ComponentType<P> =
    rawForwardRef { props, ref ->
        buildElements { handler(props, ref) }
    }
