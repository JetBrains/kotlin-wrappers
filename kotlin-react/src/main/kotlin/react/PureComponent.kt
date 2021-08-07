@file:JsModule("react")
@file:JsNonModule

package react

abstract external class PureComponent<P : Props, S : State>(
    props: P = definedExternally,
) : Component<P, S> {

    final override fun shouldComponentUpdate(
        nextProps: P,
        nextState: S,
    ): Boolean

}
