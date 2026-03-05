## Fixing mismatches between react and kotlin event dispatching
* With node, mocha, kotlin/js coroutines, global-jsdom, react, and react-testing-libraries in the mix,
  some code tries to use a browser dispatch model, and some tries to use a node model. This eventually results in
  events loop hangs, either due to lost events or events never settling (unclear which)
* Using the wrong dispatcher results in tests seeming to hang, often at the end of calls to `reactTestingLibrary.act`.
* Kotlin coroutines detects and sets browser default dispatching first since jsdom partially provides this functionality.
  Coroutines only uses node dispatching if browser dispatching is not detected OR if the user agent contains "jsdom".
  By default, node returns a user-agent of "Node <version>"
* Two fixes are possible:
  1) Provide functionality to coroutines.core.js to manually configure the default dispatcher.  This is preferred.
  2) Patch the user agent to contain "jsdom" before kotlin starts up.
* This workaround appends " jsdom" to the current user agent at module load
  in `mocha-support/append-jsdom-to-user-agent-name.js`
* To install:
```kotlin
        compilations.named("test") {
            packageJson {
                customField("mocha",
                    mapOf("require"
                            to
                        arrayOf(
                            // For a typical project, project root is four levels up from node's CWD
                            "../../../../tools/mocha-support/append-jsdom-to-user-agent-name.js",
                            "global-jsdom/register"
                        )
                    )
                )
            }
        }
```

