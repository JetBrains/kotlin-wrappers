@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import remix.run.router.GetScrollRestorationKeyFunction


external interface ScrollRestorationProps : react.Props {
    var getKey: GetScrollRestorationKeyFunction?
    var storageKey: String?
}

