package react

import js.array.Tuple2

typealias Dispatch<A> = (action: A) -> Unit

typealias ReducerInstance<S, A> = Tuple2<S, Dispatch<A>>
