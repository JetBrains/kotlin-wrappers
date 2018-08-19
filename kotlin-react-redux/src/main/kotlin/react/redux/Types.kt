package react.redux

import react.RClass
import react.RProps

external interface ConnectOptions<P : RProps> : FactoryOptions<P> {
    val getDisplayName: ((String) -> String)?
    val methodName: String?
    val renderCountProp: String?
    val shouldHandleStateChanges: Boolean?
    val storeKey: String?
    val withRef: Boolean?
}

external interface Options<S, OP : RProps, SP : RProps, P : RProps> : ConnectOptions<P> {
    val pure: Boolean?
    val areStatesEqual: ((S, S) -> Boolean)?
    val areOwnPropsEqual: ((OP, OP) -> Boolean)?
    val areStatePropsEqual: ((SP, SP) -> Boolean)?
    val areMergedPropsEqual: ((P, P) -> Boolean)?
}

external interface FactoryOptions<P : RProps> {
    val displayName: String?
    val wrappedComponentName: String?
    val wrappedComponent: RClass<P>?
}

typealias Selector<S, OP, P> = (S, OP) -> P

typealias SelectorFactory<S, A, R, OP, P> = ((A) -> R, FactoryOptions<P>) -> Selector<S, OP, P>
