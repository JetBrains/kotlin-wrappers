package react

sealed external interface ReactPortal : ReactElement {
    val children: ReactNode
}
