package react

import js.reflect.unsafeCast

fun <T> useEqualSetter(
    setter: StateSetter<T>,
): StateSetter<T> =
    useMemo(setter) {
        toEqualSetter(setter)
    }

private fun <T> toEqualSetter(
    setter: StateSetter<T>,
): StateSetter<T> =
    unsafeCast { source: Any? ->
        if (source is Function<*>) {
            val transform = unsafeCast<(T) -> T>(source)
            setter { oldValue ->
                val newValue = transform(oldValue)
                if (newValue != oldValue) newValue else oldValue
            }
        } else {
            val newValue = unsafeCast<T>(source)
            setter { oldValue ->
                if (newValue != oldValue) newValue else oldValue
            }
        }
    }
