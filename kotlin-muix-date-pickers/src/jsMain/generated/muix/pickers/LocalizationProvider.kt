// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/LocalizationProvider")

package muix.pickers

import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface LocalizationProviderProps : PropsWithChildren {
    override var children: ReactNode?

    /**
     * Date library adapter class function.
     * @see See the localization provider {@link https://mui.com/x/react-date-pickers/quickstart/#integrate-provider-and-adapter date adapter setup section} for more details.
     */
    var dateAdapter: DateAdapter? /* new (...args: any) => MuiPickersAdapter<TLocale> */

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
    var localeText: Any? /* PickersInputLocaleText */
}

external interface PickersAdapterContextValue {
    var defaultDates: Any

    var adapter: Any? /* MuiPickersAdapter */

    var localeText: Any? /* PickersInputLocaleText */
}


external val LocalizationProvider: FC<LocalizationProviderProps>
