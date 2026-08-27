plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinCsstype)
        api(projects.kotlinBrowser)
        api(projects.kotlinEmotionUtils)

        npm(jspkg.emotion.css)
    }
}
