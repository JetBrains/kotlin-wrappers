package react.router

import remix.run.router.To

@Suppress("NOTHING_TO_INLINE")
inline operator fun NavigateFunction.invoke(to: To): Unit = asDynamic()(to)
