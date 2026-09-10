package react

import web.cssom.ViewTransitionName

external interface ViewTransitionInstance {
    /**
     * The [ViewTransitionProps.name] that was used in the corresponding [ViewTransition] component or `"auto"` if the `name` prop was omitted.
     */
    val name: ViewTransitionName

    val group: ViewTransitionPseudoElement
    val imagePair: ViewTransitionPseudoElement
    val old: ViewTransitionPseudoElement
    val new: ViewTransitionPseudoElement
}
