plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinCsstype)
        api(projects.kotlinBrowser)
        api(projects.kotlinEmotionCss)
        api(projects.kotlinEmotionUtils)
        api(projects.kotlinReact)

        api(npm(jspkg.emotion.react))
    }
}
