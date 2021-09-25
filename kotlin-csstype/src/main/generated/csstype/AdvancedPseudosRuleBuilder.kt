// Automatically generated - do not modify!

@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package csstype

interface AdvancedPseudosRuleBuilder<T : Any> : RuleBuilder<T> {
    inline fun cue(
        selector: String,
        block: T.() -> Unit,
    ) {
        "::cue($selector)"(block)
    }

    inline fun cueRegion(
        selector: String,
        block: T.() -> Unit,
    ) {
        "::cue-region($selector)"(block)
    }

    inline fun part(
        selector: String,
        block: T.() -> Unit,
    ) {
        "::part($selector)"(block)
    }

    inline fun slotted(
        selector: String,
        block: T.() -> Unit,
    ) {
        "::slotted($selector)"(block)
    }

    inline fun dir(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":dir($selector)"(block)
    }

    inline fun has(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":has($selector)"(block)
    }

    inline fun host(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":host($selector)"(block)
    }

    inline fun hostContext(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":host-context($selector)"(block)
    }

    inline fun __is__(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":is($selector)"(block)
    }

    inline fun lang(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":lang($selector)"(block)
    }

    inline fun matches(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":matches()($selector)"(block)
    }

    inline fun not(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":not($selector)"(block)
    }

    inline fun nthChild(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":nth-child($selector)"(block)
    }

    inline fun nthLastChild(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":nth-last-child($selector)"(block)
    }

    inline fun nthLastOfType(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":nth-last-of-type($selector)"(block)
    }

    inline fun nthOfType(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":nth-of-type($selector)"(block)
    }

    inline fun where(
        selector: String,
        block: T.() -> Unit,
    ) {
        ":where($selector)"(block)
    }
}
