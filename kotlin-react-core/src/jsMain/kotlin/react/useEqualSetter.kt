package react

fun <T> useEqualSetter(
    setter: StateSetter<T>,
): StateSetter<T> =
    useMemo(setter) {
        toEqualSetter(setter)
    }

private fun <T> toEqualSetter(
    setter: StateSetter<T>,
): StateSetter<T> =
    { source: Any? ->
        if (source is Function<*>) {
            val transform = source.unsafeCast<(T) -> T>()
            setter { oldValue ->
                val newValue = transform(oldValue)
                if (newValue != oldValue) newValue else oldValue
            }
        } else {
            val newValue = source.unsafeCast<T>()
            setter { oldValue ->
                if (newValue != oldValue) newValue else oldValue
            }
        }
    }.unsafeCast<StateSetter<T>>()
