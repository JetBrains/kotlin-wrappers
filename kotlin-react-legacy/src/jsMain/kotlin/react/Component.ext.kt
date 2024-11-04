package react

import js.objects.Object
import js.objects.jso

fun <S : State> Component<*, S>.setState(buildState: S.() -> Unit) {
    setState({ Object.assign(jso(), it).apply(buildState) })
}
