package styled

import kotlinx.css.CssBuilder
import kotlinx.css.RuleSet

/**
 * Provides [RuleSet]s with caching according to provided arguments.
 *
 * @param sheet           A reference to the [StyleSheet] containing and caching all related styles.
 * @param staticCssSuffix A suffix to be included into all names of dynamic CSS classes.
 * @param builder         A builder describing how to prepare CSS rules according to the current argument.
 * */
class DynamicCssProvider<T : Any> internal constructor(
    private val sheet: StyleSheet,
    private val staticCssSuffix: String,
    private val builder: CssBuilder.(T) -> Unit
) {

    operator fun invoke(argument: T): RuleSet = sheet.prepareCachedRuleSet(staticCssSuffix, builder, argument)

}
