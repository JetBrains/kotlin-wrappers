package react

import js.objects.unsafeJso

abstract class RComponent<P : Props, S : State> : Component<P, S> {
    constructor() : super() {
        state = unsafeJso { init() }
    }

    constructor(props: P) : super(props) {
        state = unsafeJso { init(props) }
    }

    open fun S.init() {}

    // if you use this method, don't forget to pass props to the constructor first
    open fun S.init(props: P) {}

    abstract fun RBuilder.render()

    override fun render() = createElement<Props> { render() }
}
