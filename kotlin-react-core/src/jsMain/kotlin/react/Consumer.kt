package react

external interface ConsumerProps<T> : Props {
    var children: (T) -> ReactNode?
}

sealed external interface Consumer<T> :
    ExoticComponent<ConsumerProps<T>>
