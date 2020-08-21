@file:JsModule("react-redux")
@file:JsNonModule

package react.redux

import react.*
import redux.*

external class Provider : Component<ProviderProps, RState> {
    override fun render(): ReactElement?
}

external interface ProviderProps : RProps {
    var store: Store<*, *, *>
}

external fun <S, A, R, OP : RProps, SP : RProps, DP : RProps, P : RProps> connect(
    mapStateToProps: ((S, OP) -> SP)? = definedExternally,
    mapDispatchToProps: (((A) -> R, OP) -> DP)? = definedExternally,
    mergeProps: ((SP, DP, OP) -> P)? = definedExternally,
    options: Options<S, OP, SP, P>? = definedExternally
): HOC<P, OP>

external fun <S, A, R, OP : RProps, P : RProps> connectAdvanced(
    selectorFactory: SelectorFactory<S, A, R, OP, P>,
    options: ConnectOptions<P> = definedExternally
): HOC<P, OP>
