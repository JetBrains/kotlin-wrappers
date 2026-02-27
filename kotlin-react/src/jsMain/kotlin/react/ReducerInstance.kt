package react

import js.array.Tuple2

typealias ReducerInstance<S, A> = Tuple2<S, Dispatch<A>>
