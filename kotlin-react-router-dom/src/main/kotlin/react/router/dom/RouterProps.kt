@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.PropsWithChildren

external interface RouterProps : PropsWithChildren {
    var history: History
}


