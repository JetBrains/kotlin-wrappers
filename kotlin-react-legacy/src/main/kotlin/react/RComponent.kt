package react

import kotlinx.js.jso

abstract class RComponent<P : Props, S : State> : Component<P, S> {
    constructor() : super() {
        state = jso { init() }
    }

    constructor(props: P) : super(props) {
        state = jso { init(props) }
    }

    open fun S.init() {}

    // if you use this method, don't forget to pass props to the constructor first
    open fun S.init(props: P) {}

    abstract fun RBuilder.render()

    override fun render() = createElement { render() }
}
