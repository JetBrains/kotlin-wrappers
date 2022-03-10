// Automatically generated - do not modify!

@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package csstype

interface AdvancedPseudosRuleBuilder<T : Any> : RuleBuilder<T> {
    inline fun cue(
        selector: Selector,
    ): Selector =
        Selector("::cue($selector)")

    inline fun cue(
        selector: String,
    ): Selector =
        Selector("::cue($selector)")

    inline fun cueRegion(
        selector: Selector,
    ): Selector =
        Selector("::cue-region($selector)")

    inline fun cueRegion(
        selector: String,
    ): Selector =
        Selector("::cue-region($selector)")

    inline fun part(
        selector: Selector,
    ): Selector =
        Selector("::part($selector)")

    inline fun part(
        selector: String,
    ): Selector =
        Selector("::part($selector)")

    inline fun slotted(
        selector: Selector,
    ): Selector =
        Selector("::slotted($selector)")

    inline fun slotted(
        selector: String,
    ): Selector =
        Selector("::slotted($selector)")

    inline fun dir(
        selector: Selector,
    ): Selector =
        Selector(":dir($selector)")

    inline fun dir(
        selector: String,
    ): Selector =
        Selector(":dir($selector)")

    inline fun has(
        selector: Selector,
    ): Selector =
        Selector(":has($selector)")

    inline fun has(
        selector: String,
    ): Selector =
        Selector(":has($selector)")

    inline fun host(
        selector: Selector,
    ): Selector =
        Selector(":host($selector)")

    inline fun host(
        selector: String,
    ): Selector =
        Selector(":host($selector)")

    inline fun hostContext(
        selector: Selector,
    ): Selector =
        Selector(":host-context($selector)")

    inline fun hostContext(
        selector: String,
    ): Selector =
        Selector(":host-context($selector)")

    inline fun `is`(
        selector: Selector,
    ): Selector =
        Selector(":is($selector)")

    inline fun `is`(
        selector: String,
    ): Selector =
        Selector(":is($selector)")

    inline fun lang(
        selector: Selector,
    ): Selector =
        Selector(":lang($selector)")

    inline fun lang(
        selector: String,
    ): Selector =
        Selector(":lang($selector)")

    inline fun matches(
        selector: Selector,
    ): Selector =
        Selector(":matches()($selector)")

    inline fun matches(
        selector: String,
    ): Selector =
        Selector(":matches()($selector)")

    inline fun not(
        selector: Selector,
    ): Selector =
        Selector(":not($selector)")

    inline fun not(
        selector: String,
    ): Selector =
        Selector(":not($selector)")

    inline fun nthChild(
        selector: Selector,
    ): Selector =
        Selector(":nth-child($selector)")

    inline fun nthChild(
        selector: String,
    ): Selector =
        Selector(":nth-child($selector)")

    inline fun nthLastChild(
        selector: Selector,
    ): Selector =
        Selector(":nth-last-child($selector)")

    inline fun nthLastChild(
        selector: String,
    ): Selector =
        Selector(":nth-last-child($selector)")

    inline fun nthLastOfType(
        selector: Selector,
    ): Selector =
        Selector(":nth-last-of-type($selector)")

    inline fun nthLastOfType(
        selector: String,
    ): Selector =
        Selector(":nth-last-of-type($selector)")

    inline fun nthOfType(
        selector: Selector,
    ): Selector =
        Selector(":nth-of-type($selector)")

    inline fun nthOfType(
        selector: String,
    ): Selector =
        Selector(":nth-of-type($selector)")

    inline fun where(
        selector: Selector,
    ): Selector =
        Selector(":where($selector)")

    inline fun where(
        selector: String,
    ): Selector =
        Selector(":where($selector)")
}
