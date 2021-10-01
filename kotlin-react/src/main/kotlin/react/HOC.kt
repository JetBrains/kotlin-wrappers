package react

import kotlinext.js.JsFunction

external interface HOC<out P : Props, in R : Props> : JsFunction<Nothing?, ComponentClass<R>>

operator fun <P : Props, R : Props> HOC<P, R>.invoke(component: ComponentClass<P>) =
    call(null, component)

operator fun <P : Props, R : Props> HOC<P, R>.invoke(component: RBuilder.(P) -> Unit) =
    call(null, { props: P ->
        createElement {
            component(props)
        }
    })

operator fun <P : Props, R : Props> HOC<P, R>.invoke(config: Any, component: RBuilder.(P) -> Unit) =
    call(null, { props: P ->
        createElement {
            component(props)
        }
    }, config)

fun <P : Props> allOf(vararg hocs: HOC<P, P>): (component: ComponentClass<P>) -> ComponentClass<P> =
    { hocs.fold(it) { acc, hoc -> hoc(acc) } }
