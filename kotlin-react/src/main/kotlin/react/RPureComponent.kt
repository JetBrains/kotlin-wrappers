package react

import kotlinext.js.jsObject

abstract class RPureComponent<P : Props, S : State> : PureComponent<P, S> {
    constructor() : super() {
        state = jsObject { init() }
    }

    constructor(props: P) : super(props) {
        state = jsObject { init(props) }
    }

    open fun S.init() {}

    // if you use this method, don't forget to pass props to the constructor first
    open fun S.init(props: P) {}

    abstract fun RBuilder.render()

    override fun render() = buildElements { render() }
}
