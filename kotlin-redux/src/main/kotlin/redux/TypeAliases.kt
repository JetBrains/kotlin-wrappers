package redux

typealias Reducer<S, A> = (S, A) -> S
