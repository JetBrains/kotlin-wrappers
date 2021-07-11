package react

import kotlinext.js.jsObject

abstract class RComponent<P : RProps, S : RState> : Component<P, S> {
    constructor() : super() {
        state = jsObject { init() }
    }

    constructor(props: P) : super(props) {
        state = jsObject { init(props) }
    }

    open fun S.init() {}

    // if you use this method, don't forget to pass props to the constructor first
    open fun S.init(props: P) {}

    fun RBuilder.children() {
        props.children()
    }

    fun <T> RBuilder.children(value: T) {
        props.children(value)
    }

    abstract fun RBuilder.render()

    override fun render() = buildElements { render() }
}
