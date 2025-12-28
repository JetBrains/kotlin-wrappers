package tanstack.react.router

external interface ActiveLinkOptionProps {
    /**
     * A function that returns additional props for the `active` state of this link.
     * These props override other props passed to the link (`style`'s are merged, `className`'s are concatenated)
     */
    var activeProps: ActiveLinkProps? /* | () -> ActiveLinkProps */

    /**
     * A function that returns additional props for the `inactive` state of this link.
     * These props override other props passed to the link (`style`'s are merged, `className`'s are concatenated)
     */
    var inactiveProps: ActiveLinkProps? /* | () -> ActiveLinkProps */
}
