// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/LocalizationProvider")
@file:JsNonModule

package muix.pickers

external interface LocalizationProviderProps : react.PropsWithChildren {
    override var children: react.ReactNode?

    /** DateIO adapter class function */
    var dateAdapter: dynamic

    /** Formats that are used for any child pickers */
    var dateFormats: dynamic

    /**
     * Date library instance you are using, if it has some global overrides
     * ```jsx
     * dateLibInstance={momentTimeZone}
     * ```
     */
    var dateLibInstance: Any?

    /** Locale for the date library you are using */
    var locale: dynamic
}

external interface MuiPickersAdapterContextValue {
    var defaultDates: dynamic

    var utils: dynamic
}


external val LocalizationProvider: react.FC<LocalizationProviderProps>
