package react.redux

import react.ComponentClass
import react.Props

external interface ConnectOptions<P : Props> : FactoryOptions<P> {
    var getDisplayName: ((String) -> String)?
    var methodName: String?
    var renderCountProp: String?
    var shouldHandleStateChanges: Boolean?
    var storeKey: String?
    var withRef: Boolean?
}

external interface Options<S, OP : Props, SP : Props, P : Props> : ConnectOptions<P> {
    var pure: Boolean?
    var areStatesEqual: ((S, S) -> Boolean)?
    var areOwnPropsEqual: ((OP, OP) -> Boolean)?
    var areStatePropsEqual: ((SP, SP) -> Boolean)?
    var areMergedPropsEqual: ((P, P) -> Boolean)?
}

external interface FactoryOptions<P : Props> {
    var displayName: String?
    var wrappedComponentName: String?
    var wrappedComponent: ComponentClass<P>?
}

typealias Selector<S, OP, P> = (S, OP) -> P

typealias SelectorFactory<S, A, R, OP, P> = ((A) -> R, FactoryOptions<P>) -> Selector<S, OP, P>

interface DispatchProps<A, R> : Props {
    var dispatch: (A) -> R
}
