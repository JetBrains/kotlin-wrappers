package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{automatic: 'automatic', rounded: 'rounded', texturedRounded: 'textured-rounded', roundRect: 'round-rect', texturedSquare: 'textured-square', capsule: 'capsule', smallSquare: 'small-square', separated: 'separated'}/*union*/)""")
sealed external interface TouchBarSegmentedControlConstructorOptionsSegmentStyle {
    companion object {
        val automatic: TouchBarSegmentedControlConstructorOptionsSegmentStyle
        val rounded: TouchBarSegmentedControlConstructorOptionsSegmentStyle
        val texturedRounded: TouchBarSegmentedControlConstructorOptionsSegmentStyle
        val roundRect: TouchBarSegmentedControlConstructorOptionsSegmentStyle
        val texturedSquare: TouchBarSegmentedControlConstructorOptionsSegmentStyle
        val capsule: TouchBarSegmentedControlConstructorOptionsSegmentStyle
        val smallSquare: TouchBarSegmentedControlConstructorOptionsSegmentStyle
        val separated: TouchBarSegmentedControlConstructorOptionsSegmentStyle
    }
}
