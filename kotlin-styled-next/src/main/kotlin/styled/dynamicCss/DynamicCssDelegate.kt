package styled.dynamicCss

import kotlinx.css.CssBuilder
import styled.StyleSheet
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * The only purpose of this class is to intercept the property's name which is used to construct the final CSS class name.
 * */
class DynamicCssDelegate<T : Any> internal constructor(
    private val sheet: StyleSheet,
    private val builder: CssBuilder.(T) -> Unit
) {
    /**
     * The single purpose of this class is to avoid creation of an anonymous class holding a reference to the parent.
     * */
    private class DynamicCssProviderProperty<T : Any>(
        private val provider: DynamicCssProvider<T>
    ) : ReadOnlyProperty<Any?, DynamicCssProvider<T>> {
        override fun getValue(thisRef: Any?, property: KProperty<*>): DynamicCssProvider<T> = provider
    }

    /**
     * Intercepts the property name this delegate is assigned to and constructs the corresponding [DynamicCssProvider].
     * */
    operator fun provideDelegate(
        thisRef: Any?,
        providingProperty: KProperty<*>
    ): ReadOnlyProperty<Any?, DynamicCssProvider<T>> =
        DynamicCssProviderProperty(DynamicCssProvider(sheet, providingProperty.name, builder))
}
