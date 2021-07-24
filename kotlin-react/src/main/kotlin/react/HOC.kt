package react

import kotlinext.js.JsFunction

external interface HOC<out P : RProps, in R : RProps> : JsFunction<Nothing?, ComponentClass<R>>

operator fun <P : RProps, R : RProps> HOC<P, R>.invoke(component: ComponentClass<P>) =
    call(null, component)

operator fun <P : RProps, R : RProps> HOC<P, R>.invoke(component: RBuilder.(P) -> Unit) =
    call(null, { props: P ->
        buildElements {
            component(props)
        }
    })

operator fun <P : RProps, R : RProps> HOC<P, R>.invoke(config: Any, component: RBuilder.(P) -> Unit) =
    call(null, { props: P ->
        buildElements {
            component(props)
        }
    }, config)

fun <P : RProps> allOf(vararg hocs: HOC<P, P>): (component: ComponentClass<P>) -> ComponentClass<P> =
    { hocs.fold(it) { acc, hoc -> hoc(acc) } }
