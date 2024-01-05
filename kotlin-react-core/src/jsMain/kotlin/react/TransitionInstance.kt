package react

import js.array.JsTuple2

typealias TransitionFunction = () -> Unit
typealias TransitionStartFunction = (callback: TransitionFunction) -> Unit

typealias TransitionInstance = JsTuple2<Boolean, TransitionStartFunction>
