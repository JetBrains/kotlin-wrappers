package react

import react.canary.ReactCanary
import web.cssom.ClassName

// type ViewTransitionClassPerType = Record<"default" | (string & {}), "none" | "auto" | (string & {})>;
// type ViewTransitionClass = ViewTransitionClassPerType | ViewTransitionClassPerType[string];

@ReactCanary
typealias ViewTransitionClass = ClassName
