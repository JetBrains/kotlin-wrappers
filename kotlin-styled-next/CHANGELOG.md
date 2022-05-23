## 1.2.0

It is now possible to generate static CSS class names based on enumerations, properties, and other types.
Consider the following example:

```kotlin
private val demoComponent = fc<Props> {
    val (screenSize, setScreenSize) = useState(ScreenSize.fromRawWidth(window.innerWidth))

    useEffectOnce {
        val eventListener: (Event) -> Unit = {
            setScreenSize(ScreenSize.fromRawWidth(window.innerWidth))
        }
        window.addEventListener("resize", eventListener)
        cleanup {
            window.removeEventListener("resize", eventListener)
        }
    }

    styledP {
        css(DemoComponentStyles.demoDynamicStyle(screenSize))

        +"Hi, it seems like I'm running on the ${screenSize.name.lowercase()} screen!"
    }
}

private object DemoComponentStyles : StyleSheet() {
    val demoDynamicStyle by dynamicCss<ScreenSize> {
        fontSize = when (it) {
            ScreenSize.DESKTOP -> 2.rem
            ScreenSize.TABLET  -> 1.5.rem
            ScreenSize.PHONE   -> 1.rem
        }
    }
}

enum class ScreenSize(private val startsFromWidth: Int) : HasCssSuffix {
    DESKTOP(992),
    TABLET(768),
    PHONE(0);

    companion object {
        fun fromRawWidth(rawWidth: Int): ScreenSize {
            for (value in values()) {
                if (rawWidth >= value.startsFromWidth) return value
            }
            return DESKTOP
        }
    }

    override val cssSuffix: String get() = name.lowercase()
}
```

The `name` parameter is now optional when creating a `StyleSheet`, the name is obtained via reflection when not
specified. Additionally, the `isStatic` parameter is now `true` by default because it's more sensible.

Before:

```kotlin
object MyStyleSheet : StyleSheet("MyStyleSheet", isStatic = true)
```

After:

```kotlin
object MyStyleSheet : StyleSheet()
```

## 1.1.0

We have noticed that using a single stylesheet is detrimental to performance. Specifically, we were witnessing that
style recalculation took dozens of milliseconds whenever a stylesheet was modified in a complex web application. In this
version we have introduced rule partitioning: once 50 rules (50 is an empirical number) are added to a stylesheet, a new
stylesheet is created. This helped reduce style recalculation time almost by an order of magnitude. Additionally, as
kotlin-styled-next removes unused rules when the browser is idle, stylesheet compression was implemented: successive
style sheets with less than 50 rules in total are combined into one stylesheet. Without compression we would end up with
lots and lots of stylesheets with just a handful of rules. Kudos to [Vlad](https://github.com/Recognized) for
implementing this!

## 1.0

First public release. This is the version that successfully
replaced [kotlin-styled](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-styled)
in [JetBrains Space](https://www.jetbrains.com/space/) without any regressions in functionality or performance. Kudos
to [Konstantin](https://github.com/tretikoff) for the implementation and [Akif](https://github.com/Skolotsky) for the
ideas and guidance!
