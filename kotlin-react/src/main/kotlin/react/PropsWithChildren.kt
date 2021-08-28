package react

external interface PropsWithChildren : Props {
    var children: Array<out ReactNode>?
}
