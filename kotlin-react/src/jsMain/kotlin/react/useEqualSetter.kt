package react

import js.reflect.legacyUnsafeCast
import js.reflect.unsafeSpecialCast

fun <T> useEqualSetter(
    setter: StateSetter<T>,
): StateSetter<T> =
    useMemo(setter) {
        toEqualSetter(setter)
    }

private fun <T> toEqualSetter(
    setter: StateSetter<T>,
): StateSetter<T> =
    legacyUnsafeCast { source: Any? ->
        if (source is Function<*>) {
            val transform = legacyUnsafeCast<(T) -> T>(source)
            setter { oldValue ->
                val newValue = transform(oldValue)
                if (newValue != oldValue) newValue else oldValue
            }
        } else {
            val newValue = unsafeSpecialCast<T>(source)
            setter { oldValue ->
                if (newValue != oldValue) newValue else oldValue
            }
        }
    }
