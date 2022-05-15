package styled

import kotlinx.css.CssBuilder
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * The only purpose of this class is to intercept a property's name which is used to construct a final CSS class name.
 * */
class DynamicCssDelegate<T : HasCssSuffix> internal constructor(
    private val sheet: StyleSheet,
    private val builder: CssBuilder.(T) -> Unit
) {

    /**
     * Almost anemic class with only one purpose
     * to avoid creation of an anonymous class holding a reference to the parent.
     * */
    private class DynamicCssProviderProperty<T : HasCssSuffix>(
        private val provider: DynamicCssProvider<T>
    ) : ReadOnlyProperty<Any?, DynamicCssProvider<T>> {

        override fun getValue(thisRef: Any?, property: KProperty<*>): DynamicCssProvider<T> = provider

    }

    /**
     * Intercepts a property name this delegate assigned to and constructs the corresponding [DynamicCssProvider].
     * */
    operator fun provideDelegate(
        thisRef: Any?,
        providingProperty: KProperty<*>
    ): ReadOnlyProperty<Any?, DynamicCssProvider<T>> =
        DynamicCssProviderProperty(DynamicCssProvider(sheet, providingProperty.name, builder))

}
