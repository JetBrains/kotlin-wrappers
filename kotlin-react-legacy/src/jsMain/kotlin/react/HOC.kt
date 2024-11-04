package react

external interface HOC<out P : Props, in R : Props> {
    @nativeInvoke
    @Suppress("DEPRECATION")
    operator fun invoke(
        component: ComponentType<P>,
        vararg args: Any?,
    ): ComponentClass<R>
}

operator fun <P : Props, R : Props> HOC<P, R>.invoke(
    component: RBuilder.(P) -> Unit,
): ComponentClass<R> =
    invoke(
        component = fc { props: P ->
            createElement<P> {
                component(props)
            }
        },
    )

operator fun <P : Props, R : Props> HOC<P, R>.invoke(
    config: Any,
    component: RBuilder.(P) -> Unit,
): ComponentClass<R> =
    invoke(
        component = fc { props: P ->
            createElement<P> {
                component(props)
            }
        },
        config,
    )

fun <P : Props> allOf(vararg hocs: HOC<P, P>): (component: ComponentClass<P>) -> ComponentClass<P> =
    { hocs.fold(it) { acc, hoc -> hoc(acc) } }
