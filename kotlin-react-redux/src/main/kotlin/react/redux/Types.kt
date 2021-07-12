package react.redux

import react.RClass
import react.RProps

external interface ConnectOptions<P : RProps> : FactoryOptions<P> {
    var getDisplayName: ((String) -> String)?
    var methodName: String?
    var renderCountProp: String?
    var shouldHandleStateChanges: Boolean?
    var storeKey: String?
    var withRef: Boolean?
}

external interface Options<S, OP : RProps, SP : RProps, P : RProps> : ConnectOptions<P> {
    var pure: Boolean?
    var areStatesEqual: ((S, S) -> Boolean)?
    var areOwnPropsEqual: ((OP, OP) -> Boolean)?
    var areStatePropsEqual: ((SP, SP) -> Boolean)?
    var areMergedPropsEqual: ((P, P) -> Boolean)?
}

external interface FactoryOptions<P : RProps> {
    var displayName: String?
    var wrappedComponentName: String?
    var wrappedComponent: RClass<P>?
}

typealias Selector<S, OP, P> = (S, OP) -> P

typealias SelectorFactory<S, A, R, OP, P> = ((A) -> R, FactoryOptions<P>) -> Selector<S, OP, P>

interface DispatchProps<A, R> : RProps {
    var dispatch: (A) -> R
}
