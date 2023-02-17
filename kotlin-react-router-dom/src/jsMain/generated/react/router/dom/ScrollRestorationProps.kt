@file:JsModule("react-router-dom")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router.dom

import remix.run.router.GetScrollRestorationKeyFunction


external interface ScrollRestorationProps : react.Props {
    var getKey: GetScrollRestorationKeyFunction?
    var storageKey: String?
}

