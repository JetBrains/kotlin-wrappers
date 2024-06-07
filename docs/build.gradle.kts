plugins {
    id("dev.adamko.dokkatoo-html")
}

dependencies {
    //region projects list, copied from :kotlin-wrappers-bom
    dokkatoo(projects.kotlinActionsToolkit)
    dokkatoo(projects.kotlinBrowser)
    dokkatoo(projects.kotlinCesiumEngine)
    dokkatoo(projects.kotlinCesiumWidgets)
    dokkatoo(projects.kotlinCss)
    dokkatoo(projects.kotlinCssomCore)
    dokkatoo(projects.kotlinCsstype)
    dokkatoo(projects.kotlinElectron)
    dokkatoo(projects.kotlinEmotion)
    dokkatoo(projects.kotlinExtensions)
    dokkatoo(projects.kotlinJs)
    dokkatoo(projects.kotlinMuiBase)
    dokkatoo(projects.kotlinMuiIconsMaterial)
    dokkatoo(projects.kotlinMuiLab)
    dokkatoo(projects.kotlinMuiMaterial)
    dokkatoo(projects.kotlinMuiSystem)
    dokkatoo(projects.kotlinMuixDatePickers)
    dokkatoo(projects.kotlinMuixTreeView)
    dokkatoo(projects.kotlinNode)
    dokkatoo(projects.kotlinPopper)
    dokkatoo(projects.kotlinPreactSignalsCore)
    dokkatoo(projects.kotlinPreactSignalsReact)
    dokkatoo(projects.kotlinReact)
    dokkatoo(projects.kotlinReactBeautifulDnd)
    dokkatoo(projects.kotlinReactCore)
    dokkatoo(projects.kotlinReactDom)
    dokkatoo(projects.kotlinReactDomLegacy)
    dokkatoo(projects.kotlinReactDomTestUtils)
    dokkatoo(projects.kotlinReactLegacy)
    dokkatoo(projects.kotlinReactPopper)
    dokkatoo(projects.kotlinReactRedux)
    dokkatoo(projects.kotlinReactRouter)
    dokkatoo(projects.kotlinReactRouterDom)
    dokkatoo(projects.kotlinReactSelect)
    dokkatoo(projects.kotlinReactUse)
    dokkatoo(projects.kotlinRedux)
    dokkatoo(projects.kotlinRemixRunRouter)
    dokkatoo(projects.kotlinRingUi)
    dokkatoo(projects.kotlinStyledNext)
    dokkatoo(projects.kotlinTanstackQueryCore)
    dokkatoo(projects.kotlinTanstackReactQuery)
    dokkatoo(projects.kotlinTanstackReactQueryDevtools)
    dokkatoo(projects.kotlinTanstackReactTable)
    dokkatoo(projects.kotlinTanstackReactVirtual)
    dokkatoo(projects.kotlinTanstackTableCore)
    dokkatoo(projects.kotlinTanstackVirtualCore)
    dokkatoo(projects.kotlinTypescript)
    dokkatoo(projects.kotlinWeb)
    //endregion

    dokkatoo(projects.kotlinWrappersBom)
}

dokkatoo {
    moduleName = "Kotlin Wrappers API Reference"

    dokkatooPublications.html {
        includes.from("README.md")
    }

    pluginsConfiguration.html {
        homepageLink = "https://github.com/JetBrains/kotlin-wrappers/"
        customAssets.from(
            "assets/homepage.svg",
            "assets/logo-icon.svg",
        )
    }
}
