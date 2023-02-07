package react

sealed external interface ReactPortal : ReactElement<Props> {
    val children: ReactNode?
}
