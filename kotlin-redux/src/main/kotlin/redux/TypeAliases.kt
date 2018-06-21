package redux

import kotlinx.html.A

typealias Reducer<S, A> = (S, A) -> S

typealias StoreCreator<S, A> = (Reducer<S, A>, S) -> Store<S, A>

typealias Enhancer<S, A1, A2> = (StoreCreator<S, A2>) -> StoreCreator<S, A1>
