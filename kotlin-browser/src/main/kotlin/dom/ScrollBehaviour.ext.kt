package dom

import org.w3c.dom.ScrollBehavior

inline val ScrollBehavior.Companion.AUTO: ScrollBehavior
    get() = "auto".unsafeCast<ScrollBehavior>()

inline val ScrollBehavior.Companion.INSTANT: ScrollBehavior
    get() = "instant".unsafeCast<ScrollBehavior>()

inline val ScrollBehavior.Companion.SMOOTH: ScrollBehavior
    get() = "smooth".unsafeCast<ScrollBehavior>()
