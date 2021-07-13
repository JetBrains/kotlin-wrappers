package react

import kotlinext.js.assign

fun <S : RState> Component<*, S>.setState(buildState: S.() -> Unit) {
    setState({ assign(it, buildState) })
}
