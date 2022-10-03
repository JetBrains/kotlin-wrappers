@file:JsModule("react-select")
@file:JsNonModule

package react.select

import csstype.ClassName
import dom.events.WheelEvent
import dom.html.HTMLDivElement
import dom.html.HTMLElement
import dom.html.HTMLInputElement
import react.ComponentClass
import react.Key
import react.PropsWithClassName
import react.ReactNode
import react.dom.events.FocusEventHandler
import react.dom.events.KeyboardEventHandler

external interface MenuPosition

external interface ActionMeta<Option>
external interface InputActionMeta

external interface ThemeConfig


external interface InputValue {
    var inputValue: String
}

external interface SelectProps<Option : Any, Group : GroupBase<Option>> : PropsWithClassName {
    /** Focus the control when it is mounted */
    var autoFocus: Boolean?

    /** Remove the currently focused option when the user presses backspace when Select isClearable or isMulti */
    var backspaceRemovesValue: Boolean

    /** Remove focus from the input when the user selects an option (handy for dismissing the keyboard on touch devices) */
    var blurInputOnSelect: Boolean

    /** When the user reaches the top/bottom of the menu, prevent scroll on the scroll-parent  */
    var captureMenuScroll: Boolean

    /** Sets a className attribute on the outer component */
    override var className: ClassName?

    /**
     * If provided, all inner components will be given a prefixed className attribute.
     *
     * This is useful when styling via CSS classes instead of the Styles API approach.
     */
    var classNamePrefix: String?

    /** Close the select menu when the user selects an option */
    var closeMenuOnSelect: Boolean

    /**
     * If `true`, close the select menu when the user scrolls the document/body.
     *
     * If a function, takes a standard javascript `ScrollEvent` you return a Boolean:
     *
     * `true` -> The menu closes
     *
     * `false` -> The menu stays open
     *
     * This is useful when you have a scrollable modal and want to portal the menu out,
     * but want to Unitgraphical issues.
     */
    var closeMenuOnScroll: Boolean /* Boolean | ((event: Event) -> Boolean) */

    /**
     * This complex object includes all the compositional components that are used
     * in `react-select`. If you wish to overwrite a component, pass in an object
     * with the appropriate namespace.
     *
     * If you only wish to restyle a component, we recommend using the `styles` prop
     * instead. For a list of the components that can be passed in, and the shape
     * that will be passed to them, see [the components docs](/components)
     */
    var components: SelectComponentsConfig<Option, Group>

    /** Whether the value of the select, e.g. SingleValue, should be displayed in the control. */
    var controlShouldRenderValue: Boolean

    /** Delimiter used to join multiple values into a single HTML Input value */
    var delimiter: String?

    /** Clear all values when the user presses escape AND the menu is closed */
    var escapeClearsValue: Boolean

    /** Custom method to filter whether an option should be displayed in the menu */
    var filterOption: ((option: FilterOptionOption<Option>, inputValue: String) -> Boolean)?

    /**
     * Formats group labels in the menu as React components
     *
     * An example can be found in the [Replacing builtins](/advanced#replacing-builtins) documentation.
     */
    var formatGroupLabel: (group: Group) -> ReactNode

    /** Formats option labels in the menu and control as React components */
    var formatOptionLabel: ((data: Option, formatOptionLabelMeta: FormatOptionLabelMeta<Option>) -> ReactNode)?

    /**
     * Resolves option data to a String to be displayed as the label by components
     *
     * Note: Failure to resolve to a String type can interfere with filtering and
     * screen reader support.
     */
    var getOptionLabel: GetOptionLabel<Option>

    /** Resolves option data to a String to compare options and specify value attributes */
    var getOptionValue: GetOptionValue<Option>

    /** Hide the selected option from the menu */
    var hideSelectedOptions: Boolean?

    /** The id to set on the SelectContainer component. */
    var id: String?

    /** The value of the search input */
    var inputValue: String

    /** The id of the search input */
    var inputId: String?

    /** Define an id prefix for the select components e.g. {your-id}-value */
    var instanceId: Key?

    /** Is the select value clearable */
    var isClearable: Boolean?

    /** Is the select disabled */
    var isDisabled: Boolean

    /** Is the select in a state of loading (async) */
    var isLoading: Boolean

    /**
     * Override the built-in logic to detect whether an option is disabled
     *
     * An example can be found in the [Replacing builtins](/advanced#replacing-builtins) documentation.
     */
    var isOptionDisabled: (option: Option, selectValue: Options<Option>) -> Boolean

    /** Override the built-in logic to detect whether an option is selected */
    var isOptionSelected: (option: Option, selectValue: Options<Option>) -> Boolean

    /** Support multiple selected options */
    var isMulti: Boolean

    /** Is the select direction right-to-left */
    var isRtl: Boolean

    /** Whether to enable search functionality */
    var isSearchable: Boolean

    /** Async: Text to display when loading options */
    var loadingMessage: (inputValue: InputValue) -> ReactNode

    /** Minimum height of the menu before flipping */
    var minMenuHeight: Double

    /** Maximum height of the menu before scrolling */
    var maxMenuHeight: Double

    /** Whether the menu is open */
    var menuIsOpen: Boolean

    /**
     * Default placement of the menu in relation to the control. 'auto' will flip
     * when there isn't enough space below the control.
     */
    var menuPlacement: MenuPlacement

    /** The CSS position value of the menu, when "fixed" extra layout management is required */
    var menuPosition: MenuPosition

    /**
     * Whether the menu should use a portal, and where it should attach
     *
     * An example can be found in the [Portaling](/advanced#portaling) documentation
     */
    var menuPortalTarget: HTMLElement?

    /** Whether to block scroll events when the menu is open */
    var menuShouldBlockScroll: Boolean

    /** Whether the menu should be scrolled into view when it opens */
    var menuShouldScrollIntoView: Boolean

    /** Name of the HTML Input (optional - without this, no input will be rendered) */
    var name: String?

    /** Text to display when there are no options */
    var noOptionsMessage: (inputValue: InputValue) -> ReactNode

    /** Handle blur events on the control */
    var onBlur: FocusEventHandler<HTMLInputElement>?

    /** Handle change events on the select */
    var onChange: (newValue: OnChangeValue<Option>, actionMeta: ActionMeta<Option>) -> Unit

    /** Handle focus events on the control */
    var onFocus: FocusEventHandler<HTMLInputElement>?

    /** Handle change events on the input */
    var onInputChange: (newValue: String, actionMeta: InputActionMeta) -> Unit

    /** Handle key down events on the select */
    var onKeyDown: KeyboardEventHandler<HTMLDivElement>?

    /** Handle the menu opening */
    var onMenuOpen: () -> Unit

    /** Handle the menu closing */
    var onMenuClose: () -> Unit

    /** Fired when the user scrolls to the top of the menu */
    // TODO TouchEvent
    var onMenuScrollToTop: ((event: WheelEvent) -> Unit)?

    /** Fired when the user scrolls to the bottom of the menu */
    // TODO TouchEvent
    var onMenuScrollToBottom: ((event: WheelEvent) -> Unit)?

    /** Allows control of whether the menu is opened when the Select is focused */
    var openMenuOnFocus: Boolean

    /** Allows control of whether the menu is opened when the Select is clicked */
    var openMenuOnClick: Boolean

    /** Array of options that populate the select menu */
    var options: OptionsOrGroups<Option, Group>

    /** Number of options to jump in menu when page{up|down} keys are used */
    var pageSize: Int

    /** Placeholder for the select value */
    var placeholder: ReactNode

    /** Status to relay to screen readers */
    var screenReaderStatus: (obj: dynamic /*{ count: Int}*/) -> String

    /**
     * Style modifier methods
     *
     * A basic example can be found at the bottom of the [Replacing builtins](/advanced#replacing-builtins) documentation.
     */
    var styles: StylesConfig<Option, Group>

    /** Theme modifier method */
    var theme: ThemeConfig?

    /** Sets the tabIndex attribute on the input */
    var tabIndex: Int

    /** Select the currently focused option when the user presses tab */
    var tabSelectsValue: Boolean

    /** The value of the select reflected by the selected option */
    var value: PropsValue<Option>

    /** Sets the form attribute on the input */
    var form: String?
}

@JsName("default")
external val Select: ComponentClass<SelectProps<*, *>>
