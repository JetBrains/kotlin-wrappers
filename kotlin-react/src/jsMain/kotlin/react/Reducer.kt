package react

typealias Reducer<S, A> = (state: S, action: A) -> S
