package react

import js.array.Tuple2

typealias Reducer<S, A> = (state: S, action: A) -> S
typealias Dispatch<A> = (action: A) -> Unit

typealias ReducerInstance<S, A> = Tuple2<S, Dispatch<A>>
