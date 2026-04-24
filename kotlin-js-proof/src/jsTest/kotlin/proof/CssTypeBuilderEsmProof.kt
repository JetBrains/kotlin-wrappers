// Regression proof: KT-ESM-DUPLICATE-HELPERS
//
// PropertiesBuilder inherits Record<Selector, Any>.set = definedExternally through six
// independent diamond-inheritance paths via: RuleBuilder, SimplePseudosRuleBuilder,
// AdvancedPseudosRuleBuilder, NonStandardPseudosRuleBuilder, ExperimentalPseudosRuleBuilder,
// and PseudosRuleBuilder. With useEsModules() + per-file IR granularity, the Kotlin/JS IR
// backend emits a duplicate top-level `function set` helper for each path in the generated
// .mjs, producing: SyntaxError: Identifier 'set' has already been declared.
//
// The node --check task in build.gradle.kts catches this before the test runner starts.
// This @Test verifies round-trip set/get behavior at runtime.

package proof

import csstype.PropertiesBuilder
import csstype.Rules
import js.objects.unsafeJso
import web.cssom.Selector
import kotlin.test.Test
import kotlin.test.assertNotNull

class CssTypeBuilderEsmProof {

    @Test
    fun propertiesBuilderSetAndGetRoundTrip() {
        // Instantiate PropertiesBuilder to force the IR backend to compile its full
        // builder hierarchy. Before the fix, PropertiesBuilder.mjs has 6 duplicate
        // top-level `function set` declarations and the ES module fails to load.
        val styles = unsafeJso<PropertiesBuilder>()
        val selector = Selector("--proof-prop")

        styles[selector] = "proof-value"

        assertNotNull(styles[selector])
    }

    @Test
    fun rulesSetAndGetRoundTrip() {
        // Rules = Record<Selector, Any>: the concrete type of each builder's map.
        // Using it directly ensures Rules.mjs also compiles cleanly.
        val rules = unsafeJso<Rules>()
        val selector = Selector("--rules-prop")

        rules[selector] = "rules-value"

        assertNotNull(rules[selector])
    }
}
