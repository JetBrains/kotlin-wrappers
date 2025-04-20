package react

import js.objects.Object
import js.objects.unsafeJso

fun <S : State> Component<*, S>.setState(buildState: S.() -> Unit) {
    setState({ Object.assign(unsafeJso(), it).apply(buildState) })
}
