package react.router.dom

import remix.run.router.GetScrollRestorationKeyFunction


sealed external interface UseScrollRestorationOptions {
    var getKey: GetScrollRestorationKeyFunction?
    var storageKey: String?
}
