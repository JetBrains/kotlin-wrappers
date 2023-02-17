package react.router.dom

import remix.run.router.GetScrollRestorationKeyFunction


external interface UseScrollRestorationOptions {
    var getKey: GetScrollRestorationKeyFunction?
    var storageKey: String?
}

