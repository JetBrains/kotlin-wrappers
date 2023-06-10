// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/LocalizationProvider")

package muix.pickers

external interface LocalizationProviderProps : react.PropsWithChildren {
    override var children: react.ReactNode?

    /** DateIO adapter class function */
    var dateAdapter: DateAdapter /* new (...args: any) => MuiPickersAdapter<unknown> */

    /** Formats that are used for any child pickers */
    var dateFormats: dynamic

    /**
     * Date library instance you are using, if it has some global overrides
     * ```jsx
     * dateLibInstance={momentTimeZone}
     * ```
     */
    var dateLibInstance: Any?

    /** Locale for the date library you are using
     * @deprecated Use `adapterLocale` instead
     */
    var locale: dynamic

    /** Locale for the date library you are using
     */
    var adapterLocale: dynamic

    /**
     * Locale for components texts
     */
    var localeText: dynamic
}

external interface MuiPickersAdapterContextValue {
    var defaultDates: dynamic

    var utils: dynamic

    var localeText: dynamic
}


external val LocalizationProvider: react.FC<LocalizationProviderProps>
