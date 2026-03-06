package karakum.virtual

internal const val SHOULD_MEASURE_DURING_SCROLL_JSDOC = """
    /**
     * Determines if an item at the given index should be measured during smooth scroll.
     * During smooth scroll, only items within a buffer range around the target are measured
     * to prevent items far from the target from pushing it away.
     */
"""
