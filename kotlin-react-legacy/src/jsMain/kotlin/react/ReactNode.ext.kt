package react

import js.reflect.unsafeCast

@PublishedApi
internal fun <P : Props> ReactNode.unsafeCastToElement(): ReactElement<P> =
    unsafeCast(this)
