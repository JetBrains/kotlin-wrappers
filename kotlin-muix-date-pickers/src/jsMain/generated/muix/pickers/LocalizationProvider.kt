// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/LocalizationProvider")

package muix.pickers

external interface LocalizationProviderProps<TDate, TLocale> : react.PropsWithChildren {
    override var children: react.ReactNode?

    /**
     * Date library adapter class function.
     * @see See the localization provider {@link https://mui.com/x/react-date-pickers/getting-started/#setup-your-date-library-adapter date adapter setup section} for more details.
     */
    var dateAdapter: DateAdapter? /* new (...args: any) => MuiPickersAdapter<TDate, TLocale> */

    /** Formats that are used for any child pickers */
    var dateFormats: Any? /* Partial<AdapterFormats> */

    /**
     * Date library instance you are using, if it has some global overrides
     * ```jsx
     * dateLibInstance={momentTimeZone}
     * ```
     */
    var dateLibInstance: Any?

    /**
     * Locale for the date library you are using
     */
    var adapterLocale: Any? /* TLocale */

    /**
     * Locale for components texts
     */
    var localeText: Any? /* PickersInputLocaleText<TDate> */
}


external val LocalizationProvider: react.FC<LocalizationProviderProps<*, *>>
