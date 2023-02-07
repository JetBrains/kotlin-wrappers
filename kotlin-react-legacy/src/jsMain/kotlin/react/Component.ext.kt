package react

import kotlinext.js.assign

fun <S : State> Component<*, S>.setState(buildState: S.() -> Unit) {
    setState({ assign(it, buildState) })
}
