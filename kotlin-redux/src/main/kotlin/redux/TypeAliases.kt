package redux

typealias Reducer<S, A> = (S, A) -> S

typealias StoreCreator<S, A> = (Reducer<S, A>, S) -> Store<S, A>
