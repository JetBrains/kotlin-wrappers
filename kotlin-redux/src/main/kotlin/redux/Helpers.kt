package redux

val <S> Store<S, *>.state: S get() = getState()
