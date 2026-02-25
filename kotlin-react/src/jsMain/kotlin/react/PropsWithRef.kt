package react

external interface PropsWithRef<T : Any> : Props {
    var ref: Ref<T>?
}
