@file:JsModule("react-redux")
@file:JsNonModule

package react.redux

import react.*
import redux.Store

external class Provider : Component<ProviderProps, State> {
    override fun render(): ReactElement?
}

external interface ProviderProps : RProps {
    var store: Store<*, *, *>
    var context: Context<*>
}

external fun <S, A, R, OP : RProps, SP : RProps, DP : RProps, P : RProps> connect(
    mapStateToProps: ((S, OP) -> SP)? = definedExternally,
    mapDispatchToProps: (((A) -> R, OP) -> DP)? = definedExternally,
    mergeProps: ((SP, DP, OP) -> P)? = definedExternally,
    options: Options<S, OP, SP, P>? = definedExternally,
): HOC<P, OP>

external fun <S, A, R, OP : RProps, P : RProps> connectAdvanced(
    selectorFactory: SelectorFactory<S, A, R, OP, P>,
    options: ConnectOptions<P> = definedExternally,
): HOC<P, OP>

external fun batch(action: () -> Unit)

external fun <S, R> useSelector(selector: (S) -> R): R

external fun <S, R> useSelector(selector: (S) -> R, equalityFn: (R, R) -> Boolean): R

external fun <A, R> useDispatch(): ((A) -> R)

external fun <S, A, R> useStore(): Store<S, A, R>

external fun <S, R> createSelectorHook(context: Context<*>): (selector: (S) -> R, equalityFn: ((R, R) -> Boolean)) -> R

external fun <A, R> createDispatchHook(context: Context<*>): () -> ((A) -> R)

external fun <S, A, R> createStoreHook(context: Context<*>): () -> Store<S, A, R>



